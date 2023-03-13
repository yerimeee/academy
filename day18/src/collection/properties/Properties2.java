package collection.properties;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class Properties2 {
	public static void main(String[] args) {
		Properties prop = new Properties();
		
		try {
			//load(InputStream is)
			prop.load(new FileInputStream("test.properties"));
			
			//loadFromXML
			prop.loadFromXML(new FileInputStream("test.xml"));
		} catch (IOException e) {
			e.printStackTrace();
		}
		System.out.println(prop);
	}
	/*
	 * .properties 파일을 사용하는 경우
	 * 프로그램상에 필요한 기본 환경설정(서버의 ip주소, DBMS 경로...등)과 관련된 구문을 기술
	 * =>모두 문자열이기 때문에 일반 관리자가 해당 문서를 파악하여 쉽게 수정 가능
	 *
	 * .xml 파일의 경우
	 * 프로그래밍 언어들 사이에서 호환이 쉽다
	 * 
	 */
}
