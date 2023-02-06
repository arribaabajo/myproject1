package 제어문;

import javax.swing.JOptionPane;

public class 문제풀이1 {

	public static void main(String[] args) {
		
		String date = JOptionPane.showInputDialog("오늘은 무슨 요일인가요?");
		String doing = JOptionPane.showInputDialog("수업끝나고 뭐하실 건가요?");
		
		String result = "오늘 " + date + "에  수업 후 나는 " + doing + "를 할 예정.";
				
		System.out.println(result);
	}

}
