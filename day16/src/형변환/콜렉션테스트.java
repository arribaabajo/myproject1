package 형변환;

import java.util.ArrayList;

public class 콜렉션테스트 {
	public static void main(String[] args) {
		//많은 양의 데이터를 다루는 부품류를 콜렉션이라고 부른다. ==> 종류가 많다
		//==> 많은 양의 데이터들도 특징이 있고 특징에 따라 콜렉션의 종류가 많다.
		//==> 배열 + 사이즈 조절 + 타입 아무거나 넣을 수 있는 ArrayList
		ArrayList list = new ArrayList(); //참조형 변수
		list.add("홍길동");
		list.add(100);
		list.add(11.2);
		list.add(true);
		System.out.println(list);
		System.out.println(list.get(0));
		System.out.println(list.get(1));
		System.out.println(list.get(2));
		System.out.println(list.get(3));
		//중간에 삽입
		list.add(0, "김길동");
		System.out.println(list);
		//제거
		list.remove(1); //파괴함수
		System.out.println(list); 
		//변경
		list.set(0, "정길동"); //파괴함수
		System.out.println(list); 
		
		//index 위치 확인
		int index = list.indexOf(true);
		System.out.println(index);
		
		//포함여부 확인
		boolean result = list.contains(11.2);
		System.out.println(result);
	}
}
