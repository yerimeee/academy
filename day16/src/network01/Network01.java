package network01;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.InetAddress;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
import java.net.UnknownHostException;
import java.util.Arrays;

public class Network01 {

	public static void main(String[] args) {
		//서버에 요청을 위해서 서버의 ip와 port번호가 있어야 됨
		//InetAddress : 네트워크 정보(ip주소 관련)를 확인할 수 있는 클래스
		try {
			InetAddress localhost = InetAddress.getLocalHost(); //static으로 되어있어서 new로 객체 생성 안 함
			System.out.println(localhost); //내 pc명 + 내 ip주소
			System.out.println("내 pc명: " + localhost.getHostName());
			System.out.println("내 ip주소: " + localhost.getHostAddress());
			System.out.println("---------------------------");
			
			//도메인을 통해 그 서버에 관련된 정보 얻기
			InetAddress googleHost = InetAddress.getByName("google.com");
			System.out.println("google 서버명: " + googleHost.getHostName());
			System.out.println("google ip주소: " + googleHost.getHostAddress());
			
			// 도메인을 통해 그 서버에 관련된 정보를 배열로 얻기
			InetAddress[] naverHost = InetAddress.getAllByName("naver.com");//getallbyname이어야 배열 모두 가져올 수 있음.
			System.out.println("네이버 호스트 개수: " + naverHost.length);
			for(InetAddress n : naverHost) {
				System.out.println("naver 서버명: " + n.getHostName());
				System.out.println("naver ip주소: " +n.getHostAddress());
			}
		} catch (UnknownHostException e) {
			e.printStackTrace();
		} 
		/*
		 * url1(); //메인에서 호출해줘야 밑의 메소드가 출력됨
		 * url2();
		 */
		imageDown();
	}
	
	static void url1() {
		try {
			URL url = new URL("https://docs.oracle.com:5000/en/java/javase/18/docs/api/java.base/java/net/InetAddress.html?name=kim&age=25#getByName(java.lang.String)");
			System.out.println("프로토콜: " + url.getProtocol());
			System.out.println("호스트 이름: " + url.getHost());
			System.out.println("포트 번호: " + url.getPort());
			System.out.println("경로: " + url.getPath());
			System.out.println("Query: " + url.getQuery());
			System.out.println("페이지 링크: " + url.getRef());
		} catch (MalformedURLException e) {
			e.printStackTrace();
		}
	}
	// 파일 입력하기
	static void url2() {
		try {
			URL url = new URL("https://docs.oracle.com/en/java/javase/18/docs/api/java.base/java/net/InetAddress.html#getByName(java.lang.String)");
			URLConnection conn = url.openConnection();
			//1. 기반 스트림: 응답을 읽을 입력스트림, 바이트 기반
			/*InputStream is = conn.getInputStream();
			InputStreamReader isr = new InputStreamReader(is); 
			이 두 줄을 밑에서 한 줄로 표현함 */
			
			//2. 보조 스트림: BufferedReader 사용
			BufferedReader br = new BufferedReader(new InputStreamReader(conn.getInputStream()));
			BufferedWriter bw = new BufferedWriter(new FileWriter("InetAddress.html"));
			
			String data = null;
			while((data = br.readLine()) != null) { //한줄씩 읽어와서 data변수에 넣어라
				System.out.println(data);
				bw.write(data); //파일로 만들기
				bw.newLine(); //파일 내용을 개행 처리 해줌
			}
			
		} catch (MalformedURLException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	static void imageDown( ) {
		try {
			URL url = new URL("https://www.google.com/logos/doodles/2023/international-womens-day-2023-6753651837109578-l.png");
			URLConnection conn = url.openConnection();
			
			BufferedInputStream bis = new BufferedInputStream(conn.getInputStream());
			BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream("image.png"));
			
			//한 행 읽어와서 한 행 쓰게 하기
			byte[] data = new byte[8*1024]; //8k Byte
			int len = 0;
			while((len = bis.read(data)) != -1) { //bis에서 읽어온 걸 data 배열에 넣어서 그 배열을 len에
				System.out.println(Arrays.toString(data));
				bos.write(data,0,len);
				
			}
		} catch (MalformedURLException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
