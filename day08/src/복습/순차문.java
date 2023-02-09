package 복습;

import javax.swing.JOptionPane;

public class 순차문 {
	public static void main(String[] args) {
		// 입력 --> 처리 --> 출력
		// 두 개의 숫자 입력을 받아서 처리해서 출력
		// 프로그래밍은 손으로 치는 값은 모두다 스트링으로 취급(문자열)
		// 램에 저장공간을 만드는 것 ==> 선언!
		
		String n1 = JOptionPane.showInputDialog("숫자1입력");
		String n2 = JOptionPane.showInputDialog("숫자2입력");
	
		//처리. 정수로 바꾸고 싶으면 정수로 바꾸는 부품을 사용해야함.
		int n11 = Integer.parseInt(n1);
		int n22 = Integer.parseInt(n2);

		//출력 - 자바언어는 정수와 정수의 연산의 결과는 무조건 정수. 하나라도 실수이면 결과는 무조건 실수
		System.out.printf("%,3f", (double)n11/n22);
	}
}
