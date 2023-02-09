package 조건문;

import javax.swing.JOptionPane;

public class 배부른사람문제 {

	public static void main(String[] args) {
		int full = 0;
		int nofull = 0;
		
		for (int i = 0; i < 10; i++) {
			String date = JOptionPane.showInputDialog("배부른가요? 1) 배부름 2)안배부름");
			if(date.equals("1")) {
				full++; // = full = full+1; 같은 의미
			}
			else if(date.equals("2")) {
				nofull++;
			}
		}
		System.out.println("배부른 사람 몇 명? " + full + " 명" );
		System.out.println("안배부른 사람 몇 명? " + nofull + " 명" );
		}

}
