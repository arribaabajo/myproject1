package 배열복습;

import java.util.Arrays;
import java.util.Random;

import javax.swing.JOptionPane;

public class 배열정렬순위 {
	public static void main(String[] args) {
		Random r = new Random(42);
		int[] jumsu = new int[10000];
		for (int i = 0; i < jumsu.length; i++) {
			jumsu[i] = r.nextInt(1000) + 1;
		}//for
		Arrays.sort(jumsu); //오름차순
		//sort(jumsu) ==> jumsu가 바뀌어버림(원본이 파괴)
		//파괴형 함수
		
		String n = JOptionPane.showInputDialog("숫자입력");
		int n2 = Integer.parseInt(n);
		//parseInt(n) ==> ram에 저장된 n이 변경된 건 아님(원본이 비파괴)
		//비파괴형 함수
		
		for (int x : jumsu) {
			System.out.println(x);
		}
		
		System.out.println("최소값"+jumsu[0]);
		System.out.println("최대값"+jumsu[jumsu.length - 1]);
		
		int sum30 = 0;
		for (int i = 7000; i < jumsu.length; i++) {
			sum30 = sum30 + jumsu[i]; //sum += i;
		}
		System.out.println("상위 30% 평균" + (sum30/3000.0));
		
		
		int sum0 = 0;
		for (int i = 0; i < 3000; i++) {
			sum0 += jumsu[i]; //sum += i;
		}
		System.out.println("하위 30% 평균" + (sum0/3000.0));
		String result = Arrays.toString(jumsu);
		System.out.println(result);
	} 
}
