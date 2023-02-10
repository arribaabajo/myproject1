package 배열기본;

import java.util.Random;

public class 많은양만들어보기2 {

	public static void main(String[] args) {
		int[] jumsu = new int[1000];
		Random r = new Random();
		
		for (int i = 0; i < jumsu.length; i++) {
			jumsu[i] = r.nextInt(19)+2;
		}
		for (int i : jumsu) {
			System.out.println(i);
		}
		
		int count = 0;
		int sum = 0;
		for (int i = 0; i < jumsu.length; i++) {
			if(jumsu[i] >= 15) {
				count++; // count = count + 1;
				sum = sum + jumsu[i];
			}
		} System.out.println(count);
		System.out.println(sum);
	}

}
