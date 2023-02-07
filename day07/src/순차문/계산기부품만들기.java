package 순차문;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class 계산기부품만들기 {

	public static void main(String[] args) {
		// 필요한 부품 10개
		JFrame f = new JFrame();
		f.setSize(300, 500);
		
		ImageIcon icon = new ImageIcon("010.png");
	
		JLabel label1 = new JLabel();
		label1.setIcon(icon);
		JLabel label2 = new JLabel();
		label2.setText("숫자1");
		JLabel label3 = new JLabel();
		label3.setText("숫자2");
		
		// JTextField 2개
		JTextField text1 = new JTextField(10);
		JTextField text2 = new JTextField(10);
		
		//Font, Flowlayout
		Font font = new Font("바탕", 1, 30);
		FlowLayout flow = new FlowLayout();
		f.setLayout(flow);
		
		//JButton
		JButton b = new JButton();
		b.setText("+");
		JButton b2 = new JButton();
		b2.setText("-");
		JButton b3 = new JButton();
		b3.setText("*");
		JButton b4 = new JButton();
		b4.setText("/");
		
		
		label2.setFont(font);
		label3.setFont(font);
		text1.setFont(font);
		text2.setFont(font);
		b.setFont(font);
		b2.setFont(font);
		b3.setFont(font);
		b4.setFont(font);
		
		
		f.add(label1);
		f.add(label2);
		f.add(text1);
		f.add(label3);
		f.add(text2);
		f.add(b);
		f.add(b2);
		f.add(b3);
		f.add(b4);
		
		label2.setForeground(Color.blue);
		label3.setForeground(Color.green);
		
		f.setVisible(true);
	}

}
