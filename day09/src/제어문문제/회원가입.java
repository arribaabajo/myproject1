package 제어문문제;

import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class 회원가입 {

	public static void main(String[] args) {
		JFrame f = new JFrame();
		f.setSize(500, 600);
		
		FlowLayout flow = new FlowLayout();
		
		f.setLayout(flow);
		
		JButton b = new JButton();
		b.setText("회원가입하기");
		
		JLabel text1 = new JLabel();
		text1.setText("아이디");
		
		JLabel text2 = new JLabel();
		text2.setText("패스워드");
		
		JLabel text3 = new JLabel();
		text3.setText("이름");
		
		JLabel text4 = new JLabel();
		text4.setText("전화번호");
		
		JTextField input1 = new JTextField(10);
		JTextField input2 = new JTextField(10);
		JTextField input3 = new JTextField(10);
		JTextField input4 = new JTextField(10);
		
		
		f.add(text1);
		f.add(input1);
		f.add(text2);
		f.add(input2);
		f.add(text3);
		f.add(input3);
		f.add(text4);
		f.add(input4);
		f.add(b);
		
		
		f.setVisible(true);
	}

}
