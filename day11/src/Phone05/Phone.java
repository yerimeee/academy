package Phone05;

public abstract class Phone {

	boolean call;
	
	void call() {
		call = !call;
		if (call)
			System.out.println("전화를 겁니다");
		else 
			System.out.println("전화를 끊습니다");
	}
	
	boolean ansphone;
	
	void ansphone() {
		ansphone = !ansphone;
		if (ansphone)
			System.out.println("전화를 받습니다");
		else 
			System.out.println("전화를 끊습니다");
	}
	abstract void sound();
	abstract void pickUp();
	abstract void pickOut();
}
