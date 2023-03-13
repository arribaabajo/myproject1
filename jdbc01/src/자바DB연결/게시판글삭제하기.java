package 자바DB연결;

import java.util.Scanner;

public class 게시판글삭제하기 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("삭제할 글 제목을 입력하세요");
		
		int no = sc.nextInt();
		
		BBSDAO dao = new BBSDAO();
		dao.delete(no);
	}
}
