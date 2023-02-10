package 배열응용;

import java.util.Scanner;

public class 확인문제 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int x[] = new int[5];
		for (int i = 0; i < x.length; i++) {
			System.out.println("성적을 입력 >> ");
			x[i] = sc.nextInt();
		}
		
		for (int i = 0; i < x.length; i++) {
			System.out.println(x[i] + " ");
		}
		int sum = 0;
				for (int i = 0; i < x.length; i++) {
					sum = sum + x[i];
				}
				
			System.out.println(x[0]+x[2]);
	
	}
	
	
}
	