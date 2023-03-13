package thread;

public class Thread2 {
	/*
	 * 스레드 생명 주기
	 * - New 생성
	 * - RUNNABLE 실행/실행대기
	 * -WAITING / TIMED_WAITING / BLOKED
	 * - TERMINATED 제거
	 * 
	 */
	public static void main(String[] args) {
		Thread2 thr2 = new Thread2();
		thr2.test1();
	}
	
	private void test1() {
		new Thread(new SleepThread(), "밀리초스레드").start();
	}
	// Sleep(millseconds): 지정한 시간동안 일시정지
	class SleepThread implements Runnable {
		@Override
		public void run() {
			for(int i=1; i<=10; i++) {
				try {
					Thread.sleep(1000); // ms라 1초 = 1000
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
				System.out.println("[" + Thread.currentThread().getName() + "] " + i);
			}
		}
	}
}
