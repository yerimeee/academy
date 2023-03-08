package messenger04;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

public class ServerProgram {

	public static void main(String[] args) {
		int port = 3001;
		Scanner sc = new Scanner(System.in);
		try {
			try(ServerSocket server = new ServerSocket(port)) {
				System.out.println("클라이언트의 요청을 기다리고 있음");
				Socket socket = server.accept();
				System.out.println(socket.getInetAddress().getHostAddress() + "가 연결요청함");
				
				try(BufferedReader br = new BufferedReader(new InputStreamReader(socket.getInputStream()));
					PrintWriter pw = new PrintWriter(socket.getOutputStream())) {

					pw.println("환영합니다😊😊");
					pw.flush();
					
					//클라이언트에서 끝내기
					String msg = null;
					while((msg = br.readLine()) != null) {
						if(msg.equals("끝")) {
							System.out.println("통신을 종료합니다.");
							break;
						}
						
						System.out.println("클라이언트가 보낸 메세지: " + msg);
						System.out.println("서버: ");
						//서버 측에서 끝내기
						String sendMsg = sc.nextLine();
						pw.println(sendMsg);
						pw.flush();
						
						if(sendMsg.equals("끝"))
							break;
					}
					System.out.println(socket.getInetAddress().getHostAddress() + "와 연결을 해제");
				}
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
