package product02;

public class Tv1 extends Product {
	Tv1() {
		super(100);
	}
	@Override
	public String toString() {	//최상위 클래스인 Object의 메서드, 부모보다 자식이 접근이 더 커야되기 때문에 public 써야함. 디폴트면 안 됨.
		return "Tv";
	}
	
}
