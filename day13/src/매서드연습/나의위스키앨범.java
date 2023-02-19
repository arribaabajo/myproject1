package 매서드연습;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class 나의위스키앨범 {

	static int index = 2;

	public static void main(String[] args) {
		String[] title = { "Wild Turkey 101 Proof", "Bulleit Bourbon", "Buffalo Trace", "Maker's Mark",
				"1792 Small Batch" };
		String[] img = { "001.jpg", "002.jpg", "003.jpg", "004.jpg", "005.jpg" };
		double[] jumsu = { 75.00, 79.56, 90.00, 75.31, 82.03 };

		JFrame f = new JFrame();
		f.setSize(700, 900);
		f.getContentPane().setBackground(Color.WHITE);

		Font font = new Font("굴림", Font.BOLD, 40);

		JLabel top = new JLabel("위스키 이름");
		top.setHorizontalAlignment(0);
		top.setForeground(Color.green);
		top.setFont(font);
		f.add(top, BorderLayout.NORTH);

		JLabel center = new JLabel();
		center.setFont(font);
		ImageIcon icon = new ImageIcon(img[2]);
		center.setIcon(icon);
		f.add(center, BorderLayout.CENTER);

		JLabel under = new JLabel(String.valueOf(jumsu[2]));
		under.setHorizontalAlignment(0);
		under.setForeground(Color.blue);
		under.setFont(font);
		f.add(under, BorderLayout.SOUTH);

		// 액션처리 하는 방법 1) 액션기능을 add
		JButton left = new JButton("왼쪽");
		left.setBackground(Color.YELLOW);
		left.setFont(font);
		f.add(left, BorderLayout.WEST);
		left.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				top.setText(title[index - 1]);
				ImageIcon icon = new ImageIcon(img[index - 1]);
				center.setIcon(icon);
				under.setText(jumsu[index - 1] + "");
				index--;

			}
		});

		JButton right = new JButton("오른쪽");
		right.setBackground(Color.YELLOW);
		right.setFont(font);
		f.add(right, BorderLayout.EAST);

		right.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				top.setText(title[index + 1]);
				ImageIcon icon = new ImageIcon(img[index + 1]);
				center.setIcon(icon);
				under.setText(jumsu[index + 1] + "");
				index++;

			}
		});

		// 프로그램이 끝나면 자동으로 exit
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		f.setVisible(true);
	}
}
