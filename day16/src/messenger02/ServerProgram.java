package messenger02;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

/*
 * TCP(TransmissionControlProtocol)
 * - 서버, 클라이언트 간의 1:1 소켓 통신
 * - 서버와 클라이언트 간의 연결해야 통신 가능
 * - 신뢰성 있는 데이터 전달
 * 
 * Socket
 * - 프로세스간의 통신을 담당
 * - Input/Output Stream을 가지고 있음(이 스트림에서 입출력 진행)
 * 
 * ServerSocket
 * - 포트와 연결(Bind)되어 외부의 연결 요청을 기다리다 연결요청이 오면 수락의 용도
 * 	수락 -> 통신할 Socket 생성
 */
public class ServerProgram {

	public static void main(String[] args) {
		//1. 포트 지정
		int port = 3001;
		Scanner sc = new Scanner(System.in);
		
		BufferedReader br = null; //입력용 스트림
		PrintWriter pw = null; //출력용 스트림
		
		ServerSocket server = null;
		
		
		try {
			//2. ServerSocket 객체 생성시 포트 결합
			server = new ServerSocket(port);
			
			//3. 클라이언트로 부터 연결 요청이 오면 수락하고, 통신 가능한 소켓 객체 생성
			System.out.println("클라이언트의 요청을 기다리고 있음");
			Socket socket = server.accept();
			System.out.println(socket.getInetAddress().getHostAddress() + "가 연결요청함");
			//InetAddress에서 HostAddress만을 가져옴
			
			//4. 기반 스트림
			//InputStream is = socket.getInputStream();
			//OutputStream os = socket.getOutputStream();
			
			//5. 보조 스트림
			//br = new BufferedReader(new InputStreamReader(is)); 4번과 함께 한 줄로 쓰면 밑에처럼
			br = new BufferedReader(new InputStreamReader(socket.getInputStream()));
			pw = new PrintWriter(socket.getOutputStream());
			
			pw.println("환영합니다😊😊");
			pw.flush(); //버퍼에 있는 스트림을 다 차기 전에 강제로 보내고 버퍼 비움 그래야 실시간으로 클라이언트가 받음
			
			while(true) {
				System.out.println("클라이언트가 보낸 메세지: " + br.readLine());
				
				//서버에서 클라이언트 측으로 보내는 메세지
				System.out.println("서버: ");
				pw.println(sc.nextLine());
				pw.flush();
			}
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			pw.close();
			try {
				br.close();
				server.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}

}
