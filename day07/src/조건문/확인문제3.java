package 조건문;

import java.util.Date;

public class 확인문제3 {

	public static void main(String[] args) {
		Date date = new Date();
		int year = date.getYear()+1900; //2023
		int day = date.getDay(); // 0: 일요일 1: 월요일 ...6: 토요일
		int month = date.getMonth()+1;
		switch(month) {
		case 2: 
			System.out.println("28일까지");
			break;
		case 4: case 6: case 9: case 11:
			System.out.println("30일까지");
			break;
		default: 
			System.out.println("31일까지");
			break;
		}

	}

}
