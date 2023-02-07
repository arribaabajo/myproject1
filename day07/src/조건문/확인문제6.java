package 조건문;

import javax.swing.JOptionPane;

public class 확인문제6 {
	public static void main(String[] args) {
		String n1 = JOptionPane.showInputDialog("정수1입력");
		String n2 = JOptionPane.showInputDialog("정수2입력");
		
		int n11 = Integer.parseInt(n1);
		int n22 = Integer.parseInt(n2);
		
		if(n11 > n22) {
			System.out.println("첫 번째 입력값이 더 큼");
		} else if(n11 < n22) {
			System.out.println("두 번째 입력값이 더 큼");
		} else {
			System.out.println("두 수가 동일함");
		}
	}

}
