package 복습;

public class 배열만들기 {
	public static void main(String[] args) {
		//1. 배열 만들기 - 이미 값을 알고 있는 경우
		String[] hobby = {"run", "book", "swim", "walk"};
		//hobby: 참조형변수, 주소가 들어있음.
		System.out.print(hobby);
		System.out.println(hobby[0]);
		System.out.println("1"+hobby[1]);
		System.out.println(hobby.length);
		System.out.println(hobby[hobby.length-1]);
		
		for (int i = 0; i < hobby.length; i++) {
			System.out.println(i+" "+hobby[i]);
		}
		for(String x: hobby) {
			System.out.println(x);
		}
		//2. 배열 만들기 - 값을 모르고 있는 경우, 공간부터 만들어두자.
		String[] jobs = new String[5];
		System.out.println(jobs);
		jobs[0] = "백엔드 프로그래머";
		jobs[1] = "카페주인";
		System.out.println(jobs[0]);
		System.out.println(jobs[1]);
	}
}
