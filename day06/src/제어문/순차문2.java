package 제어문;

import javax.swing.JOptionPane;

public class 순차문2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String exe = JOptionPane.showInputDialog("당신이 좋아하는 운동은?");
		String date = JOptionPane.showInputDialog("당신이 운동하기 좋아하는 요일은?");
		
		String result = date + "에 저는 " + exe + "를 합니다.";
				
		System.out.println(result);
				
	}

}
