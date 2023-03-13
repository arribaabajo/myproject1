package 복습;

import java.util.ArrayList;

public class 형변환확인문제 {
	public static void main(String[] args) {
		ArrayList me = new ArrayList();
		me.add(1000);
		me.add(189.1);
		me.add(false);
		me.add('남');

		System.out.println(me);
		int money = (int) me.get(0);
		double height = (double) me.get(1);
		boolean food = (boolean) me.get(2);
		char gender = (char) me.get(3);

		System.out.println(money + 2000);
		System.out.println(height + 10);
		if (food) {// if(조건):조건이 true이면,
			System.out.println("배불러요");
		} else {
			System.out.println("배고파요");
		}
	}
}
