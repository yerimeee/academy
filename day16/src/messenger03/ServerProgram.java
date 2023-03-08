package messenger03;

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
			// ServerSocket 객체 생성시 포트 결합
			try(ServerSocket server = new ServerSocket(port)) { //이렇게 쓰면 close 안 해도 됨
				System.out.println("클라리언트의 요청을 기다리고 있음");
				Socket socket = server.accept();
				System.out.println(socket.getInetAddress().getHostAddress() + "가 연결요청함");
				
				// 보조 스트림(기반 스트림을 인자로 넣음)
				try(BufferedReader br = new BufferedReader(new InputStreamReader(socket.getInputStream()));
					PrintWriter pw = new PrintWriter(socket.getOutputStream())) {
				//원래 위에 try문에 ;으로 연결해서 쓸 수 있는데 socket을 try후에 만들었기 때문에 try 새로써서 close 안 해도 됨
					
					pw.println("환영합니다😊😊");
					pw.flush();
					
					while(true) {
						System.out.println("클라이언트가 보낸 메세지: " + br.readLine());
						
						System.out.println("서버: ");
						pw.println(sc.nextLine());
						pw.flush();
					}
				}
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
