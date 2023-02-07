package 순차문;

import javax.swing.JOptionPane;

public class 순차문2 {

	public static void main(String[] args) {
		// 기본 순차문 = 입력 --> 처리 --> 출력
		// 입력 -> 부품사용, 망치같은 언제나 바로 사용할 수 있는 것! 사용해보자!
		String data1 = JOptionPane.showInputDialog("정수를 입력하시오-1.");
		String data2 = JOptionPane.showInputDialog("정수를 입력하시오-2");
		//처리 -> 글자연결(+연산자이용, 결합연산자)
				//더해지는 데이터가 하나라도 string이면 결과는 string으로 나옴
		int data11 = Integer.parseInt(data1);
		int data22 = Integer.parseInt(data2);
		//String result = data1 + data2; //결과는 string
		
		int result = data11 + data22;
		
		//출력 -> 모니터 화면에 보이고 싶음.
		System.out.println(result);
		
	}

}
