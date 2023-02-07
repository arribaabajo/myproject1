package 순차문;

import javax.swing.JOptionPane;

public class 확인문제1 {

	public static void main(String[] args) {
	String data1 = JOptionPane.showInputDialog("당신의 이름은?");
	String data2 = JOptionPane.showInputDialog("당신의 나이는?");
	String data3 = JOptionPane.showInputDialog("당신의 소속은?");
	
	String result = data1 + "의 나이는 " + data2 + "이고 소속은 " + data3;
	System.out.println(result);
	
}
}
