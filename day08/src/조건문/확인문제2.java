package 조건문;

import java.util.Scanner;

import javax.xml.bind.ParseConversionEvent;

public class 확인문제2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("사과 개수를 입력");
		String apple = sc.next();
		System.out.print("사과 가격을 입력");
		String price = sc.next();
		System.out.print("딸기 개수를 입력");
		String straw = sc.next();
		System.out.print("딸기 가격을 입력");
		String price2 = sc.next();
		
		int n1 = Integer.parseInt(apple);
		int n2 = Integer.parseInt(price);
		int n3 = Integer.parseInt(straw);
		int n4 = Integer.parseInt(price2);
		
		System.out.println("사과 구매 가격은 " + (n1*n2) + "입니다.");
		System.out.println("딸기 구매 가격은 " + (n3*n4) + "입니다.");
		System.out.println("전체 구매 가격은 " + ((n1*n2)+(n3*n4)) + "입니다.");
		
	}

}
