package 복습;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class 부품조립하기 {

	public static void main(String[] args) {
		//1. 자주써서 ram에 언제든 사용할 수 있도록 준비되어있음.
		// 망치. 부품명.기능()
		
		//2. 쓸때마다 제공되는 툴을 이용해서 찍어내어 여러개 만들어 ram에 넣어두고 사용
		// 벽돌
		// 벽돌b1 = new 벽돌();
		// 벽돌b2 = new 벽돌();
		
		JFrame f = new JFrame();
		f.setSize(300, 500);
		
		f.getContentPane().setBackground(Color.pink);
		
		JLabel l = new JLabel();
		l.setText("당신이 생각한 숫자를 입력하세요!");
		
		JTextField text = new JTextField(20);
		JButton b = new JButton();
		FlowLayout flow = new FlowLayout();
		Font font = new Font("D2Cording", 1, 15);
		Font font2 = new Font("D2Cording", 1, 25);
		
		f.setLayout(flow);
		f.add(l); //f라는 부품위에 조립해서 올려놓기
		f.add(text);
		f.add(b);
		
		l.setFont(font);
		l.setForeground(Color.cyan);
		
		b.setBackground(Color.YELLOW);
		b.setForeground(Color.gray);
		b.setFont(font2);
		b.setText("숫자 맞추기 게임");
		
		f.setLayout(flow);
		
		f.setVisible(true);
	}

}
