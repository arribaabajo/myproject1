package jdbctest;

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

public class MyPage {
	public static void main(String[] args) {
		JFrame f = new JFrame();
		f.setTitle("마이페이지");
		f.setSize(800,1000);
		f.getContentPane().setBackground(new Color(204, 229, 255));
		
		Font font = new Font("굴림", Font.BOLD, 40);
		Font font1 = new Font("굴림",Font.BOLD, 20);
		
		
		JLabel id1 = new JLabel("아이디");
		JTextField id2 = new JTextField(10);
		JLabel l1 = new JLabel("닉네임");
		JLabel n1 = new JLabel();
		JLabel l2 = new JLabel("소개글");
		JLabel n2 = new JLabel();
		JLabel l3 = new JLabel("찜한책");

		
		JButton b1 = new JButton("찜삭제");
		b1.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				
			}
		});
		JButton b2 = new JButton("찜삭제");
		JButton b3 = new JButton("찜삭제");
		JButton b4 = new JButton("찜삭제");
		JButton b5 = new JButton("회원탈퇴");
		
		
		PageDAO dao = new PageDAO();
		
		
		b5.addActionListener(new ActionListener() {
		    public void actionPerformed(ActionEvent e) {
		        PageDEL pageDEL = new PageDEL();
		    }
		});
		JButton b6 = new JButton("회원정보수정");
		b6.addActionListener(new ActionListener() {
		    public void actionPerformed(ActionEvent e) {
		        PageUI pageUI = new PageUI();
		    }
		});
		JButton b7 = new JButton("회원정보가져오기");
		b7.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				String id = id2.getText();
				PageDAO dao = new PageDAO();
				PageVO result = dao.one(id);
				System.out.println(result.getNICKNAME());
				n1.setText(result.getNICKNAME());
				n2.setText(result.getLET());
			}
		});
		
		ImageIcon[] images = {
		new ImageIcon("a.png"),
		new ImageIcon("b.png"),
		new ImageIcon("c.png"),
		new ImageIcon("d.png"),
		};
		
		JLabel i1 = new JLabel(images[0]);
		JLabel i2 = new JLabel(images[1]);
		JLabel i3 = new JLabel(images[2]);
		JLabel i4 = new JLabel(images[3]);
		
		id1.setFont(font);
		id2.setFont(font);
		l1.setFont(font);
		l2.setFont(font);
		l3.setFont(font);
		n1.setFont(font);
		n2.setFont(font);
		b1.setFont(font1);
		b2.setFont(font1);
		b3.setFont(font1);
		b4.setFont(font1);
		b5.setFont(font1);
		b6.setFont(font1);
		b7.setFont(font1);
		
		f.add(id1);
		f.add(id2);
		f.add(l1);
		f.add(n1);
		f.add(l2);
		f.add(n2);
		f.add(l3);
		f.add(i1);
		f.add(b1);
		f.add(i2);
		f.add(b2);
		f.add(b3);
		f.add(i3);
		f.add(b4);
		f.add(i4);
		f.add(b5);
		f.add(b6);
		f.add(b7);
	
		
		FlowLayout flow = new FlowLayout();
		f.setLayout(flow);
		f.setVisible(true);
	}
}
