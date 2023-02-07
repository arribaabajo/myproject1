package 조건문;

public class IF문5 {

	public static void main(String[] args) {
		String ssn = "1011111";
			
		if(ssn.equals("1011111")) {
			System.out.println("동일한 지역에서 태어나셨군요!");
		} else {
			System.out.println("동일한 지역에서 태어나지 않으셨군요!");
		}
		
		char gender = ssn.charAt(0); //첫번째 자리에 있는 문자 하나씩 추출
		
		switch(gender) {
		case '1': case '3':
			System.out.println("남자");
			break;
		case'2': case'4':
			System.out.println("여자");
			break;
		}
	}

}
