package 반복문;

public class 반복문에서스킵 {
	public static void main(String[] args) {
		for(int i =1; i <= 10; i++) {
			if(i == 8) {
				//break;
				System.exit(0); // 0: 정상종료, 다른 값: 비정상종료
			}
			if(i%2!=0){	
				continue; 
			}
			System.out.println(i);
		}
		System.out.println("휴~for문 다 끝냈다~~");
	}
}
