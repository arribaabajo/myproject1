package 배열응용;

import java.util.Random;

public class 성적변동2 {
	public static void main(String[] args) {
		Random r = new Random(43);
		
		int[] n1 = new int[10000];
		int[] n2 = new int[10000];
		
		for (int i = 0; i < n2.length; i++) {
			n1[i] = r.nextInt(101);
			n2[i] = r.nextInt(101);
		}
		
		int count = 0; //동일한 갯수 누적
		int count2 = 0; //동일하지 않은 갯수 누적
		int count3 = 0; //2학기 성적이 더 큰 경우
		int count4 = 0; //1학기 성적이 더 큰 경우
		
		
		for (int i = 0; i < n2.length; i++) {
			System.out.println(n1[i] == n2[i]);
			if (n1[i] == n2[i]) {
				count++;
			} else {
				count2++;
				if(n1[i] > n2[i]) {
					count4++;
				}else {
					count3++;
				}
			}
		}//for
		System.out.println("1-2학기 성적이 동일한 학생수>> " + count + "명");
		System.out.println("1-2학기 성적이 동일하지 않은 학생수>> " + count2 + "명");
		System.out.println("2학기 성적이 높은 학생의 수는>> " + count4 + "명");
		System.out.println("1학기 성적이 높은 학생의 수는>> " + count3 + "명");
		
		
	//2학기에 성적이 더 오른 학생은 몇명?? 누구?? 
	//1학기 성적이 더 좋았던 학생은 몇명?? 누구??
	}
}
