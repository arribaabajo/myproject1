package 조건문;

public class IF문1 {

	public static void main(String[] args) {
		int x = 0;
		
		if (x == 0) {//조건을 쓸 때는 비교하는 것으로 쓰고, 결과는 무조건 true/false
			System.out.println("내가 실행되겠지요?");
	} else {//false일 때 처리하고 싶은 내용을 쓰면 됨!!
		System.out.println("나는 거짓일 때 실행돼요.");
	}
		if(x == 1) {
			System.out.println("나는 실행될까요?");
		}
	}
}
