package inheritance03;

class AA {
	int i, j;
	void setIJ(int x, int y) {	//보통 값을 넣을 때는 set, 값을 얻어올 때는 get 키워드 사용
		i = x;
		j = y;
	}
}

class BB extends AA {
	int total;
	int sum() {
		total = i + j;	//AA 상속받아서 사용가능.
		return total;
	}
}

public class InheritanceTest02 {

	public static void main(String[] args) {

		BB b1 = new BB();	//BB가 AA를 상속받았기 때문에 AA의 i,j의 객체 저장공간도 자동으로 생성됨. 그래야 사용가능하니까.
		b1.setIJ(30, 70);
		System.out.println(b1.sum());
	}

}
