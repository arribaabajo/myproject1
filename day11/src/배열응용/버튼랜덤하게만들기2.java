package 배열응용;

import java.awt.Color;
import java.util.Random;

import javax.swing.JButton;
import javax.swing.JFrame;

public class 버튼랜덤하게만들기2 {
	public static void main(String[] args) {
		JFrame f = new JFrame();
		f.setSize(1100, 700);
		JButton[] buttons = new JButton[500];
		for (int i = 0; i < buttons.length; i++) {
			buttons[i] = new JButton("버튼" + i);
		}
		f.setLayout(null);
		Random r = new Random();
		Color[] colors = {Color.red, Color.cyan, Color.green, Color.gray, 
				Color.white, Color.pink, Color.orange};

		for (int i = 0; i < buttons.length; i++) {
			int x = r.nextInt(900);
			int y = r.nextInt(600);
			buttons[i].setBounds(x, y, 100, 50);
			buttons[i].setBackground(colors[r.nextInt(colors.length)]);
			f.add(buttons[i]);
		}

		f.setVisible(true);
	}
}
