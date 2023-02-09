package 조건문;

import java.util.Scanner;

public class 문제1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("나의 이름 입력");
		String name = sc.next();
		System.out.println("나의 나이 입력");
		int age = sc.nextInt();
		System.out.println("나의 취미  입력");
		String hobby = sc.next();
		
		
		System.out.println("나의 이름은 " + name + "입니다.");
		System.out.println("나의 나이는" + age + "입니다.");
		System.out.println("나의 취미는 " + hobby + "입니다.");
	}

}
