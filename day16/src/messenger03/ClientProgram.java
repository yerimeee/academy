package messenger03;

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
				System.out.println("서버에서 보낸 환영메세지: " + br.readLine());
				
					while(true) {
						System.out.print("클라이언트가 보내는 메세지: ");
						pw.println(sc.nextLine());
						pw.flush();
						
						System.out.println("서버가 보내온 메세지: " + br.readLine());
					}
				}
			}
		} catch (UnknownHostException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
}
