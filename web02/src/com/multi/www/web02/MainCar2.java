package com.multi.www.web02;

public class MainCar2 {
	public static void main(String[] args) {
		Car car;
		for (int i = 0; i < 1000; i++) {
			car = new Car("빨강", 10, 200);
			System.out.println(car);
		}
		System.out.println("메모리 크기"+1000*12);
	}
}
