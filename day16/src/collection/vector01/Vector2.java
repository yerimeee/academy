package collection.vector01;

import java.util.Vector;

public class Vector2 {

	public static void main(String[] args) {
		Vector v = new Vector(); //매개변수로 어떠한 객체든 다 받겠다. 권장x, 
		//Vector는 쓰레드가 여러개라 동기화가 필요할 때 씀
		//ArrayList v = new ArrayList();로도 똑같이 가능, 더 권장!
		
		v.add(1);
		v.add(3.98);
		v.add("487");
		v.add(new Integer(8));
		v.add(new Double(6.89)); //버전 9부터 사라진다네요
		v.add(new String("kh"));
		
		Object obj = v.get(0);
		int i = (int)v.get(0); //정수로 넣어도 무조건 객체형임 그래서 Object로 변환가능
		System.out.println(i);
		
		double d = (double)v.get(1);
		System.out.println(d);
		
		int i3 = Integer.parseInt((String)v.get(2)); //String을 가져올땐 Integer로 변환
		System.out.println(i3*8);
	}

}
