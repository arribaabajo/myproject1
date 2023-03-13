package 자바DB연결;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import 화면DB연결.BbsVO;
import 화면DB연결.MemberVO;

public class BBSDAO {
	private int result;
	public BbsVO one(int no) {
		ResultSet rs = null; //항목명+결과 데이터를 담고 있는 테이블
		//기본형 정수/실수/문자/논리만 값으로 초기화. 나머지 데이터(참조형)주소가 들어가있음.
		//참조형 변수를 초기화할 때는 null(주소가 없다는 의미)
		BbsVO bag = null;
		try {
			// 1. 오라클 11g와 연결한 부품 설정
			Class.forName("oracle.jdbc.driver.OracleDriver");
			System.out.println("1. 오라클과 자바 연결할 부품 설정 성공");
			// 2. 오라클 11g에 연결해보자.(java --- oracle)
			String url = "jdbc:oracle:thin:@localhost:1521:xe";
			String user = "system";
			String password = "oracle";
			Connection con = DriverManager.getConnection(url, user, password);
			System.out.println("2. 오라클 연결 성공.");

			//ipaddress ==> InetAddress
			//String url = "http://www.naver.com";
			//URL u = new URL(url);
			//자바는 부품조립식이여서 String에 넣은 문자열을 부품으로 인식하지 못함.
			//특정한 부품으로 인식하려면 그 부품으로 즉, SQL부품으로 만들어주어야 한다.
			//PreparedStatement가 SQL부품
			String sql = "select*from hr.BBS where NO =? "; 
			PreparedStatement ps = con.prepareStatement(sql);
			//con부품으로 sql스트링에 있는 것 SQL부품으로 만들기
			ps.setInt(1, no);
			System.out.println("3. SQL문 부품(객체)으로 만들어주기");
			
			rs = ps.executeQuery();
			System.out.println("4. SQL문 오라클로 보내기 성공");
			if (rs.next()) {//검색결과가 있는지 여부는 rs.next
				//true이면 있다 ,false면 없다.
				System.out.println("검색 결과 있음");
				int no2 = rs.getInt(1);
				String title = rs.getString(2);
				String content = rs.getString(3);
				String writer = rs.getString(4);
				System.out.println(no2+" "+title+" "+content+" "+writer);
				//검색결과를 검색화면 ui부분을 주어야 함.
				bag = new BbsVO();
				bag.setNo(no2);
				bag.setTitle(title);
				bag.setContent(content);
				bag.setWriter(writer);
			}else {
				System.out.println("검색 결과 없음");
			}
			//System.out.println(result);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			//insert가 제대로 안된 경우, 위험한 상황이라고 판단하고
			//catch가 실행
			//실행된 Row수가 없으므로 Result에 0을 넣어주자.!
			e.printStackTrace();
		}
		return bag;
	}
	public void delete(int no) {
		try {
			// 1. 오라클 11g와 연결한 부품 설정
			Class.forName("oracle.jdbc.driver.OracleDriver");
			System.out.println("1. 오라클과 자바 연결할 부품 설정 성공");
			// 2. 오라클 11g에 연결해보자.(java --- oracle)
			String url = "jdbc:oracle:thin:@localhost:1521:xe";
			String user = "system";
			String password = "oracle";
			Connection con = DriverManager.getConnection(url, user, password);
			System.out.println("2. 오라클 연결 성공.");

			//ipaddress ==> InetAddress
			//String url = "http://www.naver.com";
			//URL u = new URL(url);
			//자바는 부품조립식이여서 String에 넣은 문자열을 부품으로 인식하지 못함.
			//특정한 부품으로 인식하려면 그 부품으로 즉, SQL부품으로 만들어주어야 한다.
			//PreparedStatement가 SQL부품
			String sql = "delete from hr.BBS where no = ? "; 
			PreparedStatement ps = con.prepareStatement(sql);
			//con부품으로 sql스트링에 있는 것 SQL부품으로 만들기
			ps.setInt(1, no);
			System.out.println("3. SQL문 부품(객체)으로 만들어주기");
			
			ps.executeUpdate();
			System.out.println("4. SQL문 오라클로 보내기 성공");
			//System.out.println(result);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	public void update(int NO, String CONTENT) {
		try {
			// 1. 오라클 11g와 연결한 부품 설정
			Class.forName("oracle.jdbc.driver.OracleDriver");
			System.out.println("1. 오라클과 자바 연결할 부품 설정 성공");
			// 2. 오라클 11g에 연결해보자.(java --- oracle)
			String url = "jdbc:oracle:thin:@localhost:1521:xe";
			String user = "system";
			String password = "oracle";
			Connection con = DriverManager.getConnection(url, user, password);
			System.out.println("2. 오라클 연결 성공.");

			//ipaddress ==> InetAddress
			//String url = "http://www.naver.com";
			//URL u = new URL(url);
			//자바는 부품조립식이여서 String에 넣은 문자열을 부품으로 인식하지 못함.
			//특정한 부품으로 인식하려면 그 부품으로 즉, SQL부품으로 만들어주어야 한다.
			//PreparedStatement가 SQL부품
			String sql = "update hr.BBS set CONTENT=? where NO =?";
			PreparedStatement ps = con.prepareStatement(sql);
			//con부품으로 sql스트링에 있는 것 SQL부품으로 만들기
			ps.setString(1, CONTENT);
			ps.setInt(2, NO);
			System.out.println("3. SQL문 부품(객체)으로 만들어주기");
			
			ps.executeUpdate();
			System.out.println("4. SQL문 오라클로 보내기 성공");
			//System.out.println(result);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	public int insert(int no2, String TITLE,
			String CONTENT, String WRITER) {
		try {
			// 1. 오라클 11g와 연결한 부품 설정
			Class.forName("oracle.jdbc.driver.OracleDriver");
			System.out.println("1. 오라클과 자바 연결할 부품 설정 성공");
			// 2. 오라클 11g에 연결해보자.(java --- oracle)
			String url = "jdbc:oracle:thin:@localhost:1521:xe";
			String user = "system";
			String password = "oracle";
			Connection con = DriverManager.getConnection(url, user, password);
			System.out.println("2. 오라클 연결 성공.");

			//ipaddress ==> InetAddress
			//String url = "http://www.naver.com";
			//URL u = new URL(url);
			//자바는 부품조립식이여서 String에 넣은 문자열을 부품으로 인식하지 못함.
			//특정한 부품으로 인식하려면 그 부품으로 즉, SQL부품으로 만들어주어야 한다.
			//PreparedStatement가 SQL부품
			String sql = "insert into hr.BBS values(?, ?, ?, ?)";
			PreparedStatement ps = con.prepareStatement(sql);
			
			//con부품으로 sql스트링에 있는 것 SQL부품으로 만들기
			ps.setInt(1, no2);
			ps.setString(2, TITLE);
			ps.setString(3, CONTENT);
			ps.setString(4, WRITER);
			
			System.out.println("3. SQL문 부품(객체)으로 만들어주기");
			
			result = ps.executeUpdate();
			System.out.println("4. SQL문 오라클로 보내기 성공");
			//System.out.println(result);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return result;
	}
	
}

