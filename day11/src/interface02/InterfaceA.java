package interface02;

public interface InterfaceA {
	public static final int MAX = 100;
	int MIN = 0; //public static final 생략해도 컴파일시 자동으로 붙음
	
	public void methodA();	//구현문이 있는 메소드가 있으면 안 됨
	public void methodA1();
}
