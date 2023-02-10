package 배열응용;

import javax.swing.JOptionPane;

public class 입력받아평균 {

	public static void main(String[] args) {
		// 입력을 여러번 여러개 받아서 저장공간에 넣고 싶을 때 == > 배열을 사용
		// 1. 배열을 만들자
		int[] jumsu = new int[5];
		
		//배열에 값을 넣을 때는 index가 필요 ==> i가 있는 for문 사용해야함
		for (int i = 0; i < jumsu.length; i++) {
			String data = JOptionPane.showInputDialog("숫자 입력");
			//숫자로 변환한 값을 배열의 해당 인덱스의 값으로 넣자.
			jumsu[i] = Integer.parseInt(data);
		}
		for (int x : jumsu) {
			System.out.print(x + " ");
		
		}
		int sum = 0;
		double avg = sum/jumsu.length;
		int count = 0;
		for (int i = 0; i < jumsu.length; i++) {
			sum = (sum + jumsu[i]);
			avg = sum/jumsu.length;
		}
		for (int i = 0; i < jumsu.length; i++) {
			if (jumsu[i] >= 300) {
				count = count+jumsu[i];
			}
		}
		for (int i = 0; i < jumsu.length; i++) {
			if(jumsu[i] >= 300) {
				//특정한 index에 있는 값이 300이상인 위치를 프린트해보세요.
				System.out.println("300인 값이 저장된 인덱스 : " + i);}
		}
			System.out.println(avg);
			System.out.println(count);
		}
	}
