package 반복문;

import javax.swing.JOptionPane;

public class for2 {

	public static void main(String[] args) {
		for (; ;) { //무한 루프(반복)
			System.out.println("잘쓰지 않음.");
			String data = JOptionPane.showInputDialog("종료할까요?");
			if(data.equals("y")) {
			System.out.println("안녕히가세요!!");
			break;
			}else {
				System.out.println("계속");
			}
		}

	}

}
