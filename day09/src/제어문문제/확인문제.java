package 제어문문제;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class 확인문제 {
	public static void main(String[] args) {
		JFrame f = new JFrame();
		f.setSize(700, 900);
		FlowLayout flow = new FlowLayout();
		f.setLayout(flow);
		
		Font font1 = new Font("굴림", 1, 20);
		Font font2 = new Font("바탕", 1, 20);
		JLabel l1 = new JLabel();
		l1.setText("인기투표 시스템");
		l1.setFont(font2);
		
		JLabel l2 = new JLabel();
		l2.setText("뉴진스");
		l2.setFont(font1);
		JLabel l3 = new JLabel();
		l3.setFont(font2);
		l3.setForeground(Color.pink);
		JLabel l4 = new JLabel();
		l4.setText("태양");
		l4.setFont(font1);
		JLabel l5 = new JLabel();
		l5.setFont(font2);
		JLabel l6 = new JLabel();
		l5.setForeground(Color.pink);
		l6.setText("윤하");
		l6.setFont(font1);
		JLabel l7 = new JLabel();
		l7.setFont(font2);
		l7.setForeground(Color.pink);
		JButton b1 = new JButton();
		JButton b2 = new JButton();
		JButton b3 = new JButton();
		ImageIcon icon1 = new ImageIcon("1.jpg");	
		ImageIcon icon2 = new ImageIcon("2.jpg");
		ImageIcon icon3 = new ImageIcon("3.jpg");
		
		b1.setIcon(icon1);
		b2.setIcon(icon2);
		b3.setIcon(icon3);
		
		f.add(l1);
		f.add(b1);
		f.add(l2);
		f.add(l3);
		f.add(b2);
		f.add(l4);
		f.add(l5);
		f.add(b3);
		f.add(l6);
		f.add(l7);
		
		b1.addActionListener(new ActionListener() {
			int newJeans = 0;
			@Override
			public void actionPerformed(ActionEvent e) {
				// 버튼 클릭할 때마다 처리할 내용을 써주세요.
				newJeans++;
				l3.setText(newJeans + "표");
			}
		});
		b2.addActionListener(new ActionListener() {
			int sun = 0;
			@Override
			public void actionPerformed(ActionEvent e) {
				// 버튼 클릭할 때마다 처리할 내용을 써주세요.
				sun++;
				l5.setText(sun + "표");
			}
		});
		b3.addActionListener(new ActionListener() {
			int yoon = 0;
			@Override
			public void actionPerformed(ActionEvent e) {
				// 버튼 클릭할 때마다 처리할 내용을 써주세요.
				yoon++;
				l7.setText(yoon + "표");
			}
		});
		f.setVisible(true);
	}
}
