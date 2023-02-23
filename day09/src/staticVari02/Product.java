package staticVari02;

public class Product {

	static int count;	//만약 static 없이 선언했다면 객체가 각각 따로 만들어지고 count 저장공간에 0으로 기본값 할당되기 때문에 20230001만 출력됨.
	int proNo = 20230000;
	
	/* 초기화 블럭 보다는 밑의 생성자를 많이 쓰긴 함
	 * { ++count; proNo = count; }
	 */
	
	Product() {
		++count;
		proNo += count;
	}
}
