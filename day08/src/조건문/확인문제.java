package 조건문;

import java.util.Scanner;

import javax.swing.JOptionPane;

public class 확인문제 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("아이디 입력");
		String id = sc.next();
		System.out.print("비밀번호 입력");
		String pass = sc.next();
		
		if(id.equals("root") && pass.equals("1234")) {
			System.out.println("로그인 성공");
		}else {
			System.out.println("로그인 실패");
		}
		
	}

}
