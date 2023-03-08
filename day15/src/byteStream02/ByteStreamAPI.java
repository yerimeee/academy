package byteStream02;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class ByteStreamAPI {
	/*
	 * 바이트 기반 스트림: 
	 * - 바이트 스트림: 1Byte단위로 전송하는 통로
	 * - 기반 스트림: 외부매체와 직접적으로 연결되는 통로
	 * 
	 * xxxInputStream: xxx매체로부터 데이터를 직접 입력받는 통로
	 * xxxOutputStream: xxx매체로부터 데이터를 직접 출력하는 통로
	 */
	//프로그램으로부터 외부매체로 내보내기(파일)
	public void fileSave() {
		//프로그램으로부터 내보내 저장하는 것이기 때문에 Output
		//FileOutputStream: 파일의 형태로 직접적으로 연결하여 1Byte단위 출력하는 스트림
		
		/*
		 * 순서
		 * 1. 스트림 생성(통로 생성)
		 * 2. 스트림으로 데이터를 보내기(출력)
		 * 3. 다 사용한 후 반드시!! 스트림 반납
		 */
		
		//1. 스트림 생성
		FileOutputStream fout = null;
		
		try {
			fout = new FileOutputStream("a_byte.txt");
			//파일이 없으면 만들고 있으면 덮어쓰기함
			//fout = new FileOutputStream("a_byte.txt", true);
			//파일 내용에 이어서 덧붙임
			
			//2. 데이터 출력
			fout.write(97);	//'a'유니코드 값
			fout.write('b');
			
			byte[] arr = {99,100,101};	//'c,d,e'에 대한 유니코드 값
			fout.write(arr);
			
			fout.write(arr, 1, 2);	//배열의 길이 1부터 2개만 출력
			
			fout.write('랑');	//2Byte는 깨져서 나옴
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {	//2번에 대한 오류 가능성
			e.printStackTrace();
		} finally {	//finally는 써도 되고 안 써도됨 
			try {
				//3. 스트림 반납
				fout.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
	//프로그램에서 파일 입력 (데이터 가져오기)
	public void fileRead() {
		//FileInputStream: 파일로부터 1Byte단위로 입력받는 스트림
		FileInputStream fin = null;
		try {
			fin = new FileInputStream("a_byte.txt");
			
			//fin.read() 2씩 호출되기 때문에 하나 건너씩 출력
			/* 
			while(fin.read() != -1) {
				System.out.println(fin.read());
			}
			*/
			//해결방법 1. 무한반복을 돌면서 매번 검사
			/*
			while(true) {
				int value = fin.read();
				if(value == -1)
					break;
				System.out.println(value);
			}
			*/
			//해결방법 2. 권장사항
			int value=0; //변수에 넣지 않으면 while문에서 다음 것을 검사하기 때문에 퐁당퐁당 값이 됨
			while((value = fin.read()) != -1) {
				System.out.println((char)value);
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
