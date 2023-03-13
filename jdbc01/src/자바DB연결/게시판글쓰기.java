package 자바DB연결;

import java.util.Scanner;

public class 게시판글쓰기 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("글 번호, 제목, 내용, 작성자순으로 입력");
		
		String no = sc.next();
		int no2 = Integer.parseInt(no);
		String TITLE = sc.next();
		String CONTENT = sc.next();
		String WRITER = sc.next();
		
		BBSDAO dao = new BBSDAO();
		dao.insert(no2, TITLE, CONTENT, WRITER);
	}
}
