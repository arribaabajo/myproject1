package 조건문;

import java.util.Scanner;

public class 콘솔입력1 {
	public static void main(String[] args) {
		//Scanner
		Scanner sc = new Scanner(System.in);//컴퓨터.키보드
		//자바프로그램과 콘솔간의 통로를 만든다
		//연결통로 == 강물(스트림, Stream)
		//Stream은 내가 닫아주지 않으면 계속 가지고 있게 됨.
		//Stream을 반드시 닫아주자.!!
		System.out.print("요일 입력: 주중1) 주말2)");
		int data = sc.nextInt(); 
		if (data == 1) {
			System.out.println("열심히 달리자!");
		}else {
			System.out.println("푹 쉬자!");
		}
	}
}
