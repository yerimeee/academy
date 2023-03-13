package collection.map;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.Entry;
import java.util.Set;

public class Map1 {
	public static void main(String[] args) {
		HashMap<String, Snack> hm = new HashMap();
		
		//계층구조 : List계열, Set계열 => Collection 구현한 클래스
		// => 객체를 추가할 때 add() 메소드 사용
		
		//Map계열은 Collection 상속받아서 구현한 클래스가 아니다
		// => 추가하고자 할 때 put() 메소드 사용(이때, key+value 쌍으로 담아야됨)
		
		//1. put(A key, B value)
		/*
		 * Snack sn = new Snack("오리지널", 2600); 
		 * hm.put("감자칩", "오리지널"); 
		 * 한 줄로하려면 밑에
		 */
		hm.put("감자칩", new Snack("오리지널", 2600));
		hm.put("빈츠", new Snack("초코맛", 1000));
		hm.put("새우깡", new Snack("매운맛", 2300));
		System.out.println(hm);
		
		//key는 중복을 허용하지 않아 덮어쓰기 하고 값은 중복 허용 
		hm.put("감자칩", new Snack("양파맛", 3000));
		System.out.println(hm);
		hm.put("버터링", new Snack("오리지널", 2300));
		System.out.println(hm);
		
		// 2. get(Object key): 해당 key값의 value를 반환시켜주는 메소드
		// Object ob = hm.get("빈츠"); 
		//Snack에 값을 넣고 싶다면 밑처럼 형변환 해줘야됨, 제네릭했을 땐 형변환 필요X
		Snack sn = (Snack) hm.get("빈츠");
		System.out.println(sn);
		
		// 3. size(): 담겨져있는 객체의 개수 반환
		System.out.println("객체의 수: " + hm.size());
		
		// 4. replace(A key, B value) => 해당 key를 찾아서 value값을 변경함
		hm.replace("버터링", new Snack("초코맛", 2500));
		System.out.println(hm);
		
		//Map안의 모든 key값과 value값을 출력하려면 Map을 Set으로 변경
		
		//for(어디부터; 어디까지; 무엇을) Map이 규칙성이 없기 때문에 반복을 돌릴 수X
		
		//Iterator 반복자 => List, Set에서만 사용하는 메서드
		//Iterator it = ((Object) hm).iterator();
		
		//Map을 Set으로 변경하는 메소드(2개)
		//1. keySet()
			//Map -> Set -> Iterator
		
			// 1) hm에 있는 key들만 Set에 담기(키들의 집합 형태)
			// hm.ketSet() -> Set으로 변경
		Set ks = hm.keySet();
		
			//2) keySet을 Iterator에 담기
		Iterator ik = ks.iterator();
		
			//3) 반복문을 이용하여 값 얻어오기, 1~2)번에서 제네릭하면 형변환 필요X
		while(ik.hasNext()) {
			String ky = (String) ik.next();
			Snack val = (Snack) hm.get(ky);
			System.out.println(ky + " = " + val);
		}
		System.out.println("------------------------");
		//2. entrySet()
			// 1) hm.entrySet(): key + 값
		Set es = hm.entrySet();
		//Set<Entry<String,Snack>> es = hm.entrySet();
			
			//2) entrySet.Iterator()에 담기
		Iterator it1 = es.iterator();
		//Iterator<Entry<String, Snack>> it1 = es.iterator();
		
			//3) 반복문으로 가져옴
		while(it1.hasNext()) {
			Entry ent = (Entry) it1.next(); //Entry도 Object형임
			//Entry<String,Snack> ent = it1.next();
			String ky1 = (String) ent.getKey();
			Snack val1 = (Snack) ent.getValue();
			System.out.println(ky1 + " = " + val1);
		}
	}

}
