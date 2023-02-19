package 배열응용;

public class 배열깊은복사 {
public static void main(String[] args) {
	int[] num3 = {100, 200, 300};
	//int[] num4 = num3; //얕은 복사, 주소가 복사
	int[] num4 = num3.clone(); //깊은 복사, 주소가 가리키고 있는 값들 복사
	
	
}
}
