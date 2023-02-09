package 복습;

import java.util.Scanner;

public class 제어문정리 {

	public static void main(String[] args) {
		//시작값, 종료값 입력, 시작값부터 종료값까지 모두 더해서 출력
		Scanner sc = new Scanner(System.in);
		System.out.print("시작값");
		int start = sc.nextInt();
		System.out.print("종료값");
		int end = sc.nextInt();

		int sum = 0;
		for(int i = start; i <= end; i++) {
			sum = sum+i;
			
		}
		System.out.println("최종 더한 값은 "+sum);
		
		sc.close();
	}

}
