package 복습;

public class 자바연산시주의점 {

	public static void main(String[] args) {
		// 자바 연산시 주의점
		int x = 20;
		int y = 30;
		
		System.out.println(x / y);
		//소숫점까지 구하고 싶으면 정수 x
		//정수와 정수의 계산 결과는 무조건 정수 출력
		//계산시 하나라도 실수면 결과는 실수로 나온다.
		
		int x2 = 20;
		double y2 = 30;
		System.out.println(x2/y2);
		
		//정수로 저장된 값을 cpu가 실수로 변환해서 사용 가능
		System.out.println(x/(double)y);
		//강제타입변환 ==> (강제로 바꾸고 싶은 타입)변수명
	}

}
