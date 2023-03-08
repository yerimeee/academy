package messenger04;

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
		int port = 3001; 
		try {
			String ip = InetAddress.getLocalHost().getHostAddress();
			System.out.println(ip);
			Scanner sc = new Scanner(System.in);

			try(Socket socket = new Socket(ip, port)) {
			System.out.println("서버와 연결 성공");
			
				try(BufferedReader br = new BufferedReader(new InputStreamReader(socket.getInputStream()));
				PrintWriter pw = new PrintWriter(socket.getOutputStream())) {
					/*
					System.out.println("서버에서 보낸 환영메세지: " + br.readLine());
				
					while(true) {
						System.out.println("클라이언트가 보낸 메세지: ");
						String sendMsg = sc.nextLine(); //보낸 메세지를 저장해놔야 끝을 낼 수 있음
						pw.println(sendMsg);
						pw.flush();
						
						if(sendMsg.equals("끝")) //String이라서 ==안되고 equals
							break;
						System.out.println("서버: " + br.readLine());
					}
					*/
				
					String msg = null;
					while((msg = br.readLine()) != null) {
						System.out.println("서버: " + msg);
						//서버측에서 끝내기
						if(msg.equals("끝")) {
							System.out.println("통신을 종료합니다.");
							break;
						}
						//클라이언트에서 끝내기
						System.out.println("클라이언트가 보낸 메세지: ");
						String sendMsg = sc.nextLine();
						pw.println(sendMsg);
						pw.flush();
						
						if(sendMsg.equals("끝")) 
							break;
					}
					System.out.println("서버와 연결을 해지함");
				}
			}
		} catch (UnknownHostException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
