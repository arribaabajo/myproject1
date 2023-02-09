package 배열;

public class 문제2 {

	public static void main(String[] args) {
		// int 크기 5인 배열 생성. 배열의 크기를 프린트
		// 배열의 첫번째 위치에 100을 넣고 마지막에 500을 넣어서 프린트
		// 배열의 3번째 위치에 200을 넣어서 프린트, 배열의 전체 데이터를 프린트.
		//배열의 전체 데이터를 인덱스와 함께 프린트.
		int[] a = new int[5];
		System.out.println(a.length);
		//배열의 크기, 배열의 길이, 배열의 사이즈
		a[0] = 100;
		System.out.println(a[0]);
		a[4] = 500;
		System.out.println(a[4]);
		a[2] = 200;
		System.out.println(a[2]);
		//index 0~4
		for (int i = 0; i < a.length; i++) {
			System.out.println(a[i]);
		}
	}

}
