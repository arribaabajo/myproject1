package 배열응용;

import java.util.Random;

public class 수능만점자문제 {
//	수능 10000명의 점수를 처리!
//	랜덤으로 10000명의 넣어주세요.
//	0~450
//	1) 만점자가 몇 명인지?? 누구인지(인덱스)
//	2) 0점이 몇 명인지??
//	3) 평균은 어떻게 되었는지?? 합계를 먼저 구해야함.
//	4) 심화)) 평균보다 +-50점 인 학생 카운트(포함)
	
	public static void main(String[] args) {
		int test[] = new int[10000];
		Random r = new Random(42);
		for (int i = 0; i < test.length; i++) {
			test[i] = r.nextInt(451);
		}
		for (int i : test) {
			System.out.println(i);
		}
		int maxCount = 0;
		for (int x : test) {
			if(x == 450) {
				maxCount++; // maxCount = maxCount + 1;
			} // if
		} //for
		int zeroCount = 0;
		for (int x : test) {
			if(x == 0) {
				zeroCount++; 
		} //if
			
		
	}//for

		System.out.println("수능 만점자: " + maxCount);
		System.out.println("수능 0점자: " + zeroCount);
		
		int sum = 0;
		for (int x : test) {
			sum = sum + x;
		}
	
			double avg = (double)sum / test.length;
	
		System.out.println("평균은 " + avg);
		
		int avgPlusMinus = 0;
		for(int x : test) {
			if((avg-50 <= x) && (x<= avg+50)) {
				avgPlusMinus++;
			}//if
		} //for
		System.out.println("평균 범위에 있는 수험생 수는 " + avgPlusMinus);
}
}
