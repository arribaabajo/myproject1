package 배열복습;

public class 스트링과배열1 {
	public static void main(String[] args) {
		String s = "나는 프로그래머프야";
		String s2 = "진짜!!";
		System.out.println(s+s2);
		System.out.println(s.concat(s2));
		System.out.println(s.charAt(0));
		char c = s.charAt(0);//한 문자만 추출
		System.out.println(s.endsWith("야")); //true, false
		boolean result = s.endsWith("야");
		String result2 = s.substring(3); //인덱스 3부터 끝까지 추출 => 프로그래머프야
		String result3 = s.substring(3, 8); //인덱스 3번부터 7번까지 추출 =>프로그래머프야
		boolean result4 = s.contains(s2);
		int index = s.lastIndexOf("프"); //8
		System.out.println(s.toUpperCase());
		System.out.println(s.toLowerCase());
		System.out.println(s.length());
		s.replace("나", "너"); //비파괴함수, cpu에서만 변경이 되고 ram에는 반영이 되지 않았음.
		System.out.println(s);
	}
}
