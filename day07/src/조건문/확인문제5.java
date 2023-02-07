package 조건문;

import javax.swing.JOptionPane;

public class 확인문제5 {

	public static void main(String[] args) {
		String dinner = JOptionPane.showInputDialog("당신이 먹고 싶은 저녁 메뉴는?");
		if(dinner.equals("자장면")) {
			System.out.println("중국집으로 가요.");
		} else if(dinner.equals("라면")) {
			System.out.println("분식집으로 가요");
		} else if(dinner.equals("회")) {
			System.out.println("횟집으로 가요");
		} else {
			System.out.println("그냥 안먹어요");
		}
		
	}

}
