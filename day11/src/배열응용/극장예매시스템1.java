package 배열응용;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

public class 극장예매시스템1 {
	public static void main(String[] args) {
		JFrame f = new JFrame();
		f.setTitle("극장예매시스템");
		f.setSize(800, 800);
		f.getContentPane().setBackground(Color.green);
		// 배치해주는 부품-FlowLayout
		FlowLayout flow = new FlowLayout();
		f.setLayout(flow);
		JButton[] btn = new JButton[50];
		Font font = new Font("바탕", Font.BOLD, 20);

		JLabel result = new JLabel("결과 보이는 곳");
		result.setForeground(Color.red);
		result.setFont(font);

		// 예약 여부를 저장하는 배열을 만들어주자
		int[] seat = new int[50];

		for (int i = 0; i < btn.length; i++) {
			btn[i] = new JButton(i + "");
			btn[i].setFont(font);
			f.add(btn[i]);

			// 버튼에 액션기능 add해보자.
			// 1) 액션 기능 추가
			// 2) 클릭했을 때 어떤 부품이 담당할지 부품 생성
			// 3) 클릭했을 때 어떻게 처리할지 코딩해주면 됨.
			btn[i].addActionListener(new ActionListener() {

				@Override
				public void actionPerformed(ActionEvent e) {
					// 클릭했을 때 어떻게 처리할지 코딩해주면 됨.
					// e.getActionCommand(); 클릭한 버튼의 글자를 가지고 와줌.
					String text = e.getActionCommand();
					System.out.println(text);
					int no = Integer.parseInt(text);
					if (seat[no] == 1) {// 이미 예약되어 1이 들어있음. 예약불가
						result.setText("예약불가");
						result.setForeground(Color.blue);
					} else { // 아직 예약이 안되어서 0이 들어있음. 예약 가능
						seat[no] = 1;
						result.setText(text + "번 예약 완료");
					}
				}
			});

		}

		f.add(result);
		JButton total = new JButton("전체 예약 내역");
		total.setBackground(Color.blue);
		total.setForeground(Color.yellow);
		total.setFont(font);
		f.add(total);

		total.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// 클릭했을 때 내용 넣기
				// 배열안에 저장된 수 몇개가 1인지 체크해서 카운트
				// 영화예매비 1장당 1만원, 결제금액 출력
				int count = 0;
				for(int x: seat) {
					if(x == 1) {
						count++;
					}//if
				}//for
				JOptionPane.showMessageDialog(f, (count*10000)+ " 원 결제하시면 됩니다.");
			}
		});

		f.setVisible(true);
	}

}