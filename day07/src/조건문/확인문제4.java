package 조건문;

import javax.swing.JOptionPane;

public class 확인문제4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String password = JOptionPane.showInputDialog("암호를 대시오."); 
		
		if(password.equals("pass")) {
			System.out.println("들어오세요!");
		} else {
			System.out.println("나가세요!");
		}
	
	}

}
