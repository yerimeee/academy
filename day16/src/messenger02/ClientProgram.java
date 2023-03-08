package messenger02;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.InetAddress;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.Scanner;

public class ClientProgram {

	public static void main(String[] args) {
		int port = 3001; // 서버와 포트번호가 동일해야 됨
		BufferedReader br = null; //close()하려면 try에 들어가 지역변수가 되면 안 됨
		PrintWriter pw = null;
		Socket socket = null;
		
		//String ip = "192.168.20.43" 이렇게 직접 써도 되고 아니면 주소 메소드로 불러오기
		try {
			String ip = InetAddress.getLocalHost().getHostAddress();
			System.out.println(ip);
			Scanner sc = new Scanner(System.in);

			//1. 서버에 연결 요청
			socket = new Socket(ip, port);
			System.out.println("서버와 연결 성공");
			
			//2. 보조 스트림으로 입출력
			br = new BufferedReader(new InputStreamReader(socket.getInputStream()));
			pw = new PrintWriter(socket.getOutputStream());
			System.out.println("서버에서 보낸 환영메세지: " + br.readLine());
			
			while(true) {
				System.out.print("클라이언트가 보내는 메세지: ");
				pw.println(sc.nextLine());
				pw.flush();
				
				System.out.println("서버가 보내온 메세지: " + br.readLine());
			}
			
		} catch (UnknownHostException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		try {
			pw.close(); // try 안에 넣어서 닫아도 상관없음 걍 깔끔해 보일라고 넣는 거임
			br.close();
			socket.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
