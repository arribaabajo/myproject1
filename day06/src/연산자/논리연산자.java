package 연산자;

public class 논리연산자 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int id = 1111;
		int id2 =2222;
				
		int pw = 3333;
		int pw2 = 3333;
		
		System.out.println(id == id2);
		System.out.println(pw == pw2);
		
		//(&& = and, || = or)
		System.out.println(id == id2 && pw == pw2);
		System.out.println(id == id2 || pw == pw2);
	}

}
