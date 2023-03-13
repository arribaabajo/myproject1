package 상속;

import 복습.직원;

public class 직원사용 {
	public static void main(String[] args) {
		직원 work = new 직원(); //f2
		work.name = "홍길동"; //public
		//work.address = "덕소리"; //default
		//==> 디폴트는 같은 패키지에서만 가능
		//work.salary = 100; //protected
		//==> 다른 패키지는 상속관계만 가능
	}
}