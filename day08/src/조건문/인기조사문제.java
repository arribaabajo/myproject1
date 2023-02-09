package 조건문;

import javax.swing.JOptionPane;

public class 인기조사문제 {

	public static void main(String[] args) {
		
		int korea = 0;
		int japan = 0;
		int china = 0;
		
		for (int i = 0; i < 10; i++) {
			String date = JOptionPane.showInputDialog("가장 좋아하는 메뉴는? 1. 한식 2. 일식 3. 중식");
			if(date.equals("1")) {
				korea++;
			}
			if(date.equals("2")) {
				japan++;
			}
			if(date.equals("3")) {
				china++;
			}
			
		}
		System.out.println("한식을 가장 좋아하는 사람은 " + korea + "명");
		System.out.println("일식을 가장 좋아하는 사람은 " + japan + "명");
		System.out.println("중식을 가장 좋아하는 사람은 " + china + "명");
	}

}
