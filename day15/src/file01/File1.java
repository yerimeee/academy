package file01;

import java.io.File;
import java.io.IOException;

public class File1 {

	public static void main(String[] args) {
		try { //경로를 지정하지 않고 파일 만들면 내 workspace에 생성됨
			File f1 = new File("test.txt");
			f1.createNewFile(); //이 메소드(throw포함되어있음)까지 호출해야만 파일이 만들어짐
			
			//존재하고 있는 폴더에 파일 생성: 경로 지정하면 됨
			//File f2 = new File("d:\\test.txt"); 역슬래시 쓸거면 두 개씀
			File f2 = new File("d:/test.txt");
			f2.createNewFile();
			
			//폴더와 파일 새로 생성
			File tempfolder = new File("D:/temp");
			tempfolder.mkdir();
			File f3 = new File("D:/temp/kyr.txt");
			f3.createNewFile();
			
			System.out.println(f1.exists()); //파일이 존재하는지 여부 확인
			System.out.println(new File("ttt.txt").exists());
			//createNewFile(); 안했으니 없는 파일
			
			System.out.println(f1.isFile()); //파일인지 아닌지 확인
			System.out.println(tempfolder.isFile()); //디렉토리이기 때문에 아님
			System.out.println("--------------------------");
			
			//parent 폴더 만들기
			File folder = new File("parent");
			folder.mkdir();
			File file = new File("parent/person.txt");
			file.createNewFile();
			
			System.out.println("파일명: " + file.getName());
			System.out.println("절대경로: " + file.getAbsolutePath());
			System.out.println("파일용량: " + file.length());
			System.out.println("상위폴더: " + file.getParent());
			
		} catch (IOException e) { //없는 폴더에 생성하라고 할 수 있어서 있는 거
			e.printStackTrace();
		}
	}
}
