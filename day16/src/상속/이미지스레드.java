package 상속;

import java.util.Date;

public class 이미지스레드 extends Thread{
	@Override
	public void run() {
		String[] images = {"1.png", "2.png", "3.png", "4.png", "5.png"
				, "1.png", "2.png", "3.png", "4.png", "5.png"
				,"1.png", "2.png", "3.png", "4.png", "5.png"
				,"1.png", "2.png", "3.png", "4.png", "5.png"};
		for (int i = 0; i < images.length; i++) {
			Date date = new Date();
			System.out.println("이미지 >> " +images[i]);
			try {
				Thread.sleep(5000);
			} catch (Exception e) {
				System.out.println("cpu 연결 문제");
			}
		}
	}
}