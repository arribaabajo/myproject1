package 제어문문제;

import java.util.Random;

public class 복권번호생성기 {
	public static void main(String[] args) {
		 //아무값이나 발생시키는 부품의 이름 = Random
		Random r = new Random();
		for (int i = 0; i < 6; i++) {
			System.out.println("복권 번호:"+r.nextInt(10)); // 0~9
		}
	}

}
