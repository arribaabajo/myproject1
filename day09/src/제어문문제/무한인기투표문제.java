package 제어문문제;

import java.util.Scanner;

import javax.swing.JOptionPane;

public class 무한인기투표문제 {
	// 누적시키는 변수는 반복문 안에 넣지 않는다.
	//new Scanner()반복문 안에 넣지 않는다.
	
	public static void main(String[] args) {
		int korea = 0;
		int japan = 0;
		int china = 0;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("인기투표 시스템");
		System.out.println("=========");
		while (true) {
			System.out.print("1) 한식 2) 일식  3) 중식  4) 종료");
			int choice = sc.nextInt();
			if (choice == 1) {
				korea++;
			} else if (choice == 2) {
				japan++;
			} else if (choice == 3) {
				china++;
			} else if (choice == 4) {
				break;
			} 
		}
			sc. close();
			
			System.out.println("한식을 가장 좋아하는 사람은 " + korea + "명");
			System.out.println("일식을 가장 좋아하는 사람은 " + japan + "명");
			System.out.println("중식을 가장 좋아하는 사람은 " + china + "명");

			
		}
		
	}

