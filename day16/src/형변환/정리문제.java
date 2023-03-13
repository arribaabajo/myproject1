package 형변환;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;


//1. 한번 갔던 여행지는 가지 않으려고 합니다. 
// 가고 싶은 여행지 5곳을 컬렉션으로 만들어서 전체 프린트(set)
//2. 각 방에 물건 배치입니다. 안방에는 TV, 거실에는 쇼파, 부엌에는 냉장고, 
//현관에는 신발의 정보를 컬렉션으로 만들어서 1)전체 프린트, 2)현관에는 무엇이 있나요?, 
//3) 거실에 책상으로 변경하여 전체 프린트(map)
//3. 오늘 내가 할일 우선순위 5개 목록을 만들어서 1)전체 프린트, 
//2)첫번째 할 일과 마지막 할 일 프린트, 3) 2번째 할 일을 “청소”로 변경해서 전체 프린트(list)
public class 정리문제 {
	public static void main(String[] args) {
		HashSet tour = new HashSet();
		tour.add("일본");
		tour.add("대만");
		tour.add("홍콩");
		tour.add("터키");
		tour.add("프랑스");
		System.out.println(tour);
		
		HashMap map = new HashMap();
		map.put("안방", "TV");
		map.put("거실", "쇼파");
		map.put("부엌", "냉장고");
		map.put("현관", "신발");
		System.out.println(map);
		System.out.println(map.get("현관"));
		map.put("거실", "책상");
		
		ArrayList doList = new ArrayList();
		doList.add("자바공부");
		doList.add("점심");
		doList.add("자바복습");
		doList.add("자바스터디");
		doList.add("쉬기");
		System.out.println(doList);
		System.out.println(doList.get(0));
		System.out.println(doList.get(doList.size()-1));
		doList.set(1, "청소");
		System.out.println(doList);
	}
}
