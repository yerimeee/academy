package inheritance03;

class D {
	static int i;
	static int j;
}

class E extends D {
	static String i;
}

public class InheritanceTest04 {

	public static void main(String[] args) {

		D.i = 100;	//static 변수라 객체 생성 안 하고 사용 가능
		E.i = "kh정보교육원";
		D.j = 500;
	}

}
