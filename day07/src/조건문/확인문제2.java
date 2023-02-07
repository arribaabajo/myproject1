package 조건문;

import java.util.Date;

public class 확인문제2 {

	public static void main(String[] args) {
		Date date = new Date();
		int year = date.getYear()+1900; //2023
		int day = date.getDay(); // 0: 일요일 1: 월요일 ...6: 토요일
		int month = date.getMonth()+1;
		
		switch (day) {
		case 0: case 6:
		System.out.println("쉬~~~자");
		break;
		default:
			System.out.println("열심히 공부하자");
			break;
		}

	}

}
