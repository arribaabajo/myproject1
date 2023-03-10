package 화면DB연결;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

import 자바DB연결.BBSDAO;

public class BbsUI {

	public static void main(String[] args) {
		JFrame f = new JFrame();
		BBSDAO dao = new BBSDAO();
		f.setTitle("나의 게시판 화면");
		f.setSize(710, 600);
		
		JLabel l1 = new JLabel("<<<< 게시판 글쓰기 화면 >>>>");
		JLabel l2 = new JLabel("게시판 번호");
		JLabel l3 = new JLabel("게시판 제목");
		JLabel l4 = new JLabel("게시판 내용");
		JLabel l5 = new JLabel("게시판 글쓴이");
		
		JTextField t1 = new JTextField(10);
		JTextField t2 = new JTextField(10);
		JTextField t3 = new JTextField(10);
		JTextField t4 = new JTextField(10);
		
		JButton b1 = new JButton("게시판 글쓰기 처리");
		JButton b2 = new JButton("게시판 지우기 처리");
		JButton b3 = new JButton("게시판 수 정 처리");
		JButton b4 = new JButton("게시판 검 색 처리");
		
		b1.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				String no = t1.getText();
				int no2 = Integer.parseInt(no);
				String TITLE = t2.getText();
				String CONTENT = t3.getText();
				String WRITER = t4.getText();
				if(TITLE.equals("")) { //기본형 4가지만 == 로 값을 비교 가능! 
					JOptionPane.showMessageDialog(f, "제목은 필수입력항목입니다.");
				}
				BBSDAO dao = new BBSDAO();
				int result = dao.insert(no2, TITLE, CONTENT, WRITER);//1 or 0
				if(result == 1) {
					JOptionPane.showMessageDialog(f, "글쓰기 성공");
				}else {
					JOptionPane.showMessageDialog(f, "글쓰기 실패, 재입력해주세요.");
				}
				
			}
		});
		b4.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				System.out.println("게시판검색처리");
				String no = t1.getText();
				int no2 = Integer.parseInt(no);
				
				BBSDAO dao = new BBSDAO();
				BbsVO bag = dao.one(no2);
				if (bag != null) {
					t2.setText(bag.getTitle());
					t3.setText(bag.getContent());
					t4.setText(bag.getWriter());
					t2.setBackground(Color.pink);
					t3.setBackground(Color.pink);
					t4.setBackground(Color.pink);
				}
				else {
					t2.setText("");
					t3.setText("");
					t4.setText("");
					System.out.println("결과 없음");
				}
			}
		});
		//f에 위에 있는 요소들을 add로 붙여주어야하는데,
		//붙이는 순서대로 물흐르듯이 붙여주고 싶음.
		//물흐르듯이 붙여주는 부품이 필요
		FlowLayout flow = new FlowLayout();
		
		//폰트를 설정하기 위해 font부품 필요 
		Font font = new Font("굴림", Font.BOLD, 40);
		
		//////////// 필요한 부품(객체)를 ram에 가져다 놓고, 준비 끝 ///////
		///조립을 시작해보자. ///
		f.setLayout(flow);
		
		f.add(l1);
		f.add(l2); f.add(t1);
		f.add(l3); f.add(t2);
		f.add(l4); f.add(t3);
		f.add(l5); f.add(t4);
		f.add(b1); f.add(b2);
		f.add(b3); f.add(b4);
		
		l1.setFont(font);
		l2.setFont(font);
		l3.setFont(font);
		l4.setFont(font);
		l5.setFont(font);
		t1.setFont(font);
		t2.setFont(font);
		t3.setFont(font);
		t4.setFont(font);
		b1.setFont(font);
		b2.setFont(font);
		b3.setFont(font);
		b4.setFont(font);
		
		t1.setBackground(Color.yellow);
		t1.setForeground(Color.red);
		t2.setBackground(Color.yellow);
		t2.setForeground(Color.red);
		t3.setBackground(Color.yellow);
		t3.setForeground(Color.red);
		t4.setBackground(Color.yellow);
		t4.setForeground(Color.red);
		
		b1.setBackground(Color.pink); //배경색
		b1.setForeground(Color.blue); //글자색 
		b2.setBackground(Color.pink);
		b2.setForeground(Color.blue);
		b3.setBackground(Color.pink);
		b3.setForeground(Color.blue);
		b4.setBackground(Color.pink);
		b4.setForeground(Color.blue);
		
		f.getContentPane().setBackground(Color.pink);
		//맨 끝으로~~~~~
		f.setVisible(true);

	}

}