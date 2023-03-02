package langPackage03.stringMethod01;

import java.util.Arrays;

public class _11_StringEx11 {

	public static void main(String[] args) {
		String text = "홍길동-아무개-이순신-강감찬";
		String[] name = text.split("-");
		System.out.println(Arrays.toString(name));
		
		for(String i : name)
			System.out.print(i + " ");
		System.out.println();
		
		String str = "";
		for(int i=0; i<name.length; i++) {
			if(i < name.length-1)	//4개의 이름값에서 마지막 1개의 이름값만 빼고 이름 3개까지만 콤마 넣기
			System.out.print(name[i] + ",");
			else
				System.out.print(name[i]);
			
			//삼항연산자로 , 넣기
			str += (i==0) ? "" + name[i] : ", " + name[i];
			// name[0] 홍길동 + name[1(0과 달라서 후행문)] , 아무개 + name[2] ,이순신 + ...
		}
		System.out.println();
		System.out.println(str);
		
		text = "홍길동,아무개&이순신-강감찬";
		String[] names = text.split(",|&|-");	//OR연산자로 구분 가능
		System.out.println(Arrays.toString(names));
	}

}
