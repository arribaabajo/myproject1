package 반복문;

import javax.swing.JOptionPane;

public class 누적 {

	public static void main(String[] args) {
		//i = i+1;
		// sum = sum + i
		
		// 숫자누적 - 1~1000원까지 더하기
		int sum = 0; //변수의 초기화를 반드시 진행하자.
		for (int i = 1; i <= 1000; i++) {
			sum=sum+i;
			//System.out.println("현재까지의 합>> "+ sum);
		}
		System.out.println("전체 합은" + sum);
		// 글자누적
		String sum2 = ""; //String의 초기값은 ""
		for (int i = 0; i < 3; i++) {
			String data = JOptionPane.showInputDialog("가고 싶은 곳 입력");
			sum2 = sum2 + data + " ";
		}
		System.out.println(sum2);
	}

}
