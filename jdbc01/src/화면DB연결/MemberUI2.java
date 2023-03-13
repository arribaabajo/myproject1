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

import 자바DB연결.MemberDAO3;

public class MemberUI2 {
	public static void main(String[] args) {
		JFrame f = new JFrame();
		f.setTitle("게시판 수정");
		f.setSize(600, 500);
		MemberDAO3 dao = new MemberDAO3();

		JLabel l1 = new JLabel("회원가입하기");
		JLabel l2 = new JLabel("아이디");
		JLabel l3 = new JLabel("비밀번호");
		JLabel l4 = new JLabel("이름");
		JLabel l5 = new JLabel("전화번호");

		JTextField t1 = new JTextField(10);
		JTextField t2 = new JTextField(10);
		JTextField t3 = new JTextField(10);
		JTextField t4 = new JTextField(10);

		JButton b1 = new JButton("회원가입 하기");
		JButton b2 = new JButton("회원탈퇴 하기");
		JButton b3 = new JButton("회원정보 수정");
		JButton b4 = new JButton("회원정보 검색");

		b1.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				System.out.println("회원가입처리");
				String id = t1.getText();
				String pw = t2.getText();
				String name = t3.getText();
				String tel = t4.getText();
				if(id.equals("")) { //기본형 4가지만 == 로 값을 비교 가능! 
					JOptionPane.showMessageDialog(f, "id는 필수입력항목입니다.");
				}
				MemberDAO3 dao = new MemberDAO3();
				//가방을 만들자.
				MemberVO bag = new MemberVO();
				//가방에 값들을 넣자.
				
				bag.setId(id);
				bag.setPw(pw);
				bag.setName(name);
				bag.setTel(tel);
				//값들이 들어있는 가방을 전달하자.
				int result = dao.insert(bag);//1 or 0
				if(result == 1) {
					JOptionPane.showMessageDialog(f, "회원가입 성공");
				}else {
					JOptionPane.showMessageDialog(f, "회원가입 실패, 재입력해주세요.");
				}
			}
		});

		b2.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				System.out.println("회원탈퇴처리");
				String id = t1.getText();
				MemberVO bag = new MemberVO();
				int result = dao.delete(bag);
				if(result >= 1) {
					JOptionPane.showMessageDialog(f, "회원탈퇴 성공");
				}else {
					JOptionPane.showMessageDialog(f, "회원탈퇴 실패, 재입력해주세요.");
				}
			}
		});

		b3.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				System.out.println("회원정보수정");
				String id = t1.getText();
				String tel = t4.getText();

				MemberVO bag = new MemberVO();
				int result = dao.update(bag);
				if(result == 1) {
					JOptionPane.showMessageDialog(f, "회원정보 수정 성공");
				}else {
					JOptionPane.showMessageDialog(f, "회원정보 수정 실패, 재입력해주세요.");
				}
			}
		});
		b4.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				System.out.println("회원검색처리");
				String id = t1.getText();
				
				MemberDAO3 dao = new MemberDAO3();
				MemberVO bag = dao.one(id);
				if (bag != null) {
					t2.setText(bag.getPw());
					t3.setText(bag.getName());
					t4.setText(bag.getTel());
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
		FlowLayout flow = new FlowLayout();

		Font font = new Font("바탕", Font.BOLD, 40);

		f.setLayout(flow);

		f.add(l1);
		f.add(l2);
		f.add(t1);
		f.add(l3);
		f.add(t2);
		f.add(l4);
		f.add(t3);
		f.add(l5);
		f.add(t4);
		f.add(b1);
		f.add(b2);
		f.add(b3);
		f.add(b4);

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

		f.setVisible(true);
	}
}
