package 복습;

import java.util.Scanner;

public class 제어문정리2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("시작값");
		int start = sc.nextInt();
		System.out.print("종료값");
		int end = sc.nextInt();
		System.out.print("점프값");
		int jump = sc.nextInt();
		
		int sum = 0;
		for (int i = start; i < end; i = i + jump) {
			sum = sum + i;
			if(sum >= 100) {
				System.exit(0);
			}
		}
		System.out.println("최종 더한 값은 " + sum);
		
		sc.close();
	}
	
}
