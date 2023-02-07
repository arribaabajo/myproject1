package 조건문;

import java.util.Date;

public class 확인문제1 { // 2000년 이상이면 밀레니엄 세대시군요라고 출력, 미만이면 아니시라고 출력

	public static void main(String[] args) {
		Date date = new Date();
		int year = date.getYear()+1900; //2023
		int day = date.getDay(); // 0: 일요일 1: 월요일 ...6: 토요일
		int month = date.getMonth()+1;
		
		if(year >= 2000) {
			System.out.println("밀레니엄 세대시군요!");
		}else {
			System.out.println("밀레니엄 세대가 아니시군요!");
		}
	}

}
