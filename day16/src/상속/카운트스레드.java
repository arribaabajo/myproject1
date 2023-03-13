package 상속;

import java.util.Date;

public class 카운트스레드 extends Thread {

	@Override
	public void run() {
		for (int i = 1000; i > 0; i--) {
			Date date = new Date();
			System.out.println("타이머 >> "+i);

			try {
				Thread.sleep(2000); //2초 재우기!
			}catch(Exception e) {
				System.out.println("cpu 연결 문제 생김");
			}
		}
	}
}
