package 배열응용;

import java.util.Scanner;

public class 확인문제2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String[] words = new String[3];
		for (int i = 0; i < words.length; i++) {
			System.out.println("과목 입력 >> ");
			words[i] = sc.next();
		}
		System.out.println(words[0] + "보다는 " + words[1]);
		sc.close();
	}
}
