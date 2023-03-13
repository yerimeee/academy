package thread;

public class Thread1 {

	public static void main(String[] args) {
		Thread1 thr1 = new Thread1();
		//thr1.test1(); //스레드 하나에서 실행되는 거라 a먼저 실행된 후 b가 실행됨
		//thr1.test2(); //스레드 두개에서 실행되는 거라 병렬적으로 작업됨
		//thr1.test3(); //Runnable로 해도 똑같이 병렬 실행
		thr1.test4();
		System.out.println(Thread.currentThread().getName() + " 스레드 종료");
	}
	
	private void test1() { 
	//static 붙으면 객체 생성 안 해도 사용 가능 test1();
	//안 붙이면 무조건 객체 생성 사용 thr1.test1();
		a("#");
		b("^");
	}
	
	private void test2() {
		Thread th1 = new MyThread1();
		Thread th2 = new MyThread2();
		th1.start();
		th2.start();
	}
	//하나의 스레드 클래스로 여러 스레드 만들기
	private void test3() {
		Thread th1 = new Thread(new Foo("&"));
		Thread th2 = new Thread(new Foo("*"));
		//th1.start(); //start하면 무조건 run 호출
		//th2.start();
	
	//배열의 값 여러 스레드 만들기	
		String[] arr = {"!","@","#","$","%","^","&","*","+"};
		for(int i=0; i<arr.length; i++) {
			new Thread(new Foo(arr[i])).start();
			//Tread th = new Thread(new Foo(arr[i]));
			//th.start(); 이걸 한 줄로 줄이면 위에
		}
	}
	
	/*
	 * 스레드 스케줄링
	 * - OS 스케줄링에 따라 임의의 순서 부여됨
	 * - 우선순위 (1~10) 내가 설정 가능
	 * - 10: Thread.MAX_PRIORITY
	 * - 5: Thread.NORM_PRIORITY (순서 설정 안 하면 기본값)
	 * - 1: Thread.MIN_PRIORITY
	 */
	private void test4() {
		Thread th1 = new Thread(new Foo("O"));
		Thread th2 = new Thread(new Foo("X"));
		
		th1.setPriority(3);
		th2.setPriority(Thread.MAX_PRIORITY);
		
		th1.start();
		th2.start();
	}
	
	/*
	 * 2. 스레드 클래스 만들기
	 * - implemants Runnable 사용: run 오버라이딩
	 */
	class Foo implements Runnable {
		private String str;

		public Foo(String str) {
			this.str = str;
		}

		@Override
		public void run() {
			for(int i=0; i<300; i++) {
				System.out.print(str);
			}
		}
	}
	
	/*
	 * 1. 스레드 클래스 만들기
	 * - Tread상속: run 오버라이딩
	 */
	
	//부모를 상속받았기 때문에 부모에서 static을 안 해서 static 사용 불가
	class MyThread1 extends Thread {
		@Override 
		public void run() {
			a("$");
		}
	}
	
	class MyThread2 extends Thread {
		@Override 
		public void run() {
			b("@");
		}
	}
	
	
	public void a(String str) {
		for(int i=0; i<300; i++) {
			System.out.print(str);
		}
	}
	
	public void b(String str) {
		for(int i=0; i<300; i++) {
			System.out.print(str);
		}
	}
}
