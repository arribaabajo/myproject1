package 형변환;

import java.util.ArrayList;

public class 스키대회 {
	public static void main(String[] args) {
		ArrayList list = new ArrayList();
		list.add("디자이너");
		list.add("프로그래머");
		list.add("DB관리자");
		System.out.println(list);
		
		ArrayList list2 = new ArrayList();
		list2.add("상한우유");
		list2.add("싱싱우유");
		list2.remove(0);
		System.out.println(list2);
		
		ArrayList list3 = new ArrayList();
		list3.add("박스키");
		list3.add("송스키");
		list3.add("김스키");
		list3.add("정스키");
		System.out.println(list3);
		list3.remove(1);
		System.out.println(list3);
		for (int i = 0; i < list3.size(); i++) {
			System.out.println((i+1)+"등"+list3.get(i));
		}
	}
}
