package 부품사용하기;

import 부품만들기.강아지;

public class 강아지사용하기 {
public static void main(String[] args) {
	강아지 d1 = new 강아지();
	d1.손();
	System.out.println("강아지는 " + d1.meal + "을 먹는다");
	System.out.println("강아지는 " + d1.status + "하다");
}
}
