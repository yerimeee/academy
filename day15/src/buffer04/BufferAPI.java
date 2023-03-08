package buffer04;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class BufferAPI {
	//프로그램 -> 파일(출력)
	public void fileSave() {
		//FileWriter
		//BufferedWriter: 버퍼라는 공간을 제공해주는 보조스트림(속도 향상)
		
		//1. 기반 스트림 먼저 생성
		//FileWriter fw = new FileWriter("c_buffer.txt");
		//2. 보조 스트림
		//BufferedWriter bw = new BufferedWriter(fw);
		
		//위에것을 한 줄로
	/*	BufferedWriter bw = null;
		try {
			bw = new BufferedWriter(new FileWriter("c_buffer.txt"));
			
			//3. 보조 스트림을 이용한 출력
			bw.write("안녕?\n");
			bw.write("반가워요");
			bw.newLine();	//줄바꿈 메서드
			bw.write("잘가요");
			//버퍼라는 공간에 계속 쌓아놨다가 한꺼번에 출력 => 속도 향상
			
		} catch (IOException e) {
			e.printStackTrace();
		}
		//4. 보조 스트림 반납
		try {
			bw.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
		*/
		
		//try ~ with ~ resource 구문으로 자원반납을 자동으로 해줌
		//JDK 1.7버전 이상부터 사용가능
		/*
		 * try(반납할 스트림 객체 생성){
		 * 
		 * } catch(예외클래스 e) {
		 * 
		 * }
		 */
		try(BufferedWriter bw = new BufferedWriter(new FileWriter("c_buffer.txt"))) {
			//반납할 거 많으면 변수에 ;넣고 또 넣어주면 됨
			bw.write("안녕?\n");
			bw.write("반가워요");
			bw.newLine();	
			bw.write("잘가요");
		}catch(IOException e) {
			e.printStackTrace();
		}
	}
	//프로그램 <- 파일(입력)
	public void fileRead() {
		//FileReader
		//BufferedReader
		try(BufferedReader br = new BufferedReader(new FileReader("c_buffer.txt"))){
			String value = null; //int형은 값이 없으면 -1 String이면 null
			while((value=br.readLine()) != null) {
				System.out.println(value);
			}
		}catch(FileNotFoundException e) {
			e.printStackTrace();
		}catch(IOException e) {
			e.printStackTrace();
		}
	}
}
