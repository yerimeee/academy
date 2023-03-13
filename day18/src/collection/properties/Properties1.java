package collection.properties;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

public class Properties1 {
	public static void main(String[] args) {
		// properties: Map 계열의 컬렉션 => key+value쌍으로 저장
		// HashMap과의 차이: 객체면 아무거나 할 수 있지만 properties는 반드시!! 모두 String 값이어야 됨
		Properties prop = new Properties();
		
		/*
		// Map계열이기 때문에 put메소드로 key+value쌍으로 담기 가능
		prop.put("감자칩", new Snack("양파맛", 3200));
		prop.put("버터링", new Snack("오리지널", 3100));
		System.out.println(prop);
		System.out.println(prop.get("버터링"));
		
		//properties를 사용하는 경우는 주로 파일로 입력 또는 출력할 때 사용
		//즉, store()[파일로 저장(내보내기)], load()[파일을 읽어오기] 메소드 사용
		
		//파일로 내보내기(저장)
		try {
			//환경설정 같은 것을 확장자 properties로 만들어 비개발자가 볼 수 있도록 파일로 내보냄
			prop.store(new FileOutputStream("test.properties"), "propertiesTest임");
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} //String으로 해야되는데 객체를 생성해놔서 형변환 할 수 없다고 오류남
		*/
		
		//properties를 파일로 내보내려면 String이어야됨
		//1. setProperties(String key, String value)
		prop.setProperty("List", "ArrayList");
		prop.setProperty("Set", "HachSet");
		prop.setProperty("Map", "HashMap");
		prop.setProperty("Map", "porperties");
		System.out.println(prop);
		
		//2. getProperties(String key)
		System.out.println(prop.getProperty("List"));
		System.out.println(prop.getProperty("Integer"));
		
		try {
			//properties 파일로 출력
			prop.store(new FileOutputStream("test.properties"), "propertiesTest임");
			
			//storeToXML (소스가 태그로 이루어짐)
			prop.storeToXML(new FileOutputStream("test.xml"), "propertiesTest임");
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
