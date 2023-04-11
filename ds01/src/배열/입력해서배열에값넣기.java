package 배열;

import java.util.Scanner;

public class 입력해서배열에값넣기 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] numbers = new int[3];
		for (int i = 0; i < numbers.length; i++) {
			numbers[i] = sc.nextInt();
		}
		sc.close();
		for (int x : numbers) {
			System.out.println(x);
		}
		for (int i = 0; i < numbers.length; i++) {
			if(numbers[i] == 33) {
				System.out.println("위치는 "+i);
			}
		}
	}
}
