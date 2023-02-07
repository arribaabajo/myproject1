package 조건문;

public class 확인문제7 {
	public static void main(String[] args) {
		String no = "A100EX";
		char ch = no.charAt(0); //'A'
		switch(ch) {
		case 'A':
		System.out.println("기획부");
		break;
		case 'B':
		System.out.println("총무부");
		break;
		case 'C':
		System.out.println("개발부");
		break;
		default:
		System.out.println("부서없음");
		break;
		}
	}
}
