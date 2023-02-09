package 제어문문제;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class 부품만들기 {
		public static void main(String[] args) {
			
			JFrame f = new JFrame();
				f.setSize(500, 700);
				
				FlowLayout flow = new FlowLayout();
				
				f.setLayout(flow);
				
				JButton b = new JButton();
				b.setText("로그인");
				
				JLabel text1 = new JLabel();
				text1.setText("아이디");
				
				JLabel text2 = new JLabel();
				text2.setText("패스워드");
				
				JLabel text3 = new JLabel();
				
				//글자 넣는 곳..
				JTextField input1 = new JTextField(10);
				JTextField input2 = new JTextField(10);
				
				Font font = new Font("궁서", 1, 20);
				
				text1.setFont(font);
				input1.setFont(font);
				text2.setFont(font);
				input2.setFont(font);
				text3.setFont(font);
				b.setFont(font);
				
				b.setBackground(Color.cyan);
				b.setForeground(Color.white);
				text3.setForeground(Color.red);
			
				
			
				f.add(text1);
				f.add(input1);
				f.add(text2);
				f.add(input2);
				f.add(b);
				f.add(text3);
				
				b.addActionListener(new ActionListener() {
					
					@Override
					public void actionPerformed(ActionEvent e) {
						// 클릭했을 때 
						String id = input1.getText();
						String pw = input2.getText();
						if(id.equals("root") && pw.equals("1234")) {
							ImageIcon icon = new ImageIcon("ok.jpg");
							text3.setIcon(icon);
						} else {
							ImageIcon icon = new ImageIcon("no.png");
							text3.setIcon(icon);
						}
						
					}
				});
				
				
				f.setVisible(true);

		}


	}

