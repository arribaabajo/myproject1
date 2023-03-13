package 자바DB연결;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

import 화면DB연결.MemberVO;

public class MemberDAO3 {
	public int delete(MemberVO bag) {
		int result = 0;
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
			String sql = "delete from hr.MEMBER where id =? "; 
			PreparedStatement ps = con.prepareStatement(sql);
			//con부품으로 sql스트링에 있는 것 SQL부품으로 만들기
			ps.setString(1, bag.getId());
			System.out.println("3. SQL문 부품(객체)으로 만들어주기");
			
			result = ps.executeUpdate();
			System.out.println("4. SQL문 오라클로 보내기 성공");
			if (result >= 1) {
				System.out.println("삭제 성공");
			}
			//System.out.println(result);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return result;
	}
	
	public ArrayList<MemberVO> list() {
		ResultSet rs = null; //항목명+결과 데이터를 담고 있는 테이블
		//가방을 넣어줄 큰 컨테이너 역할의 객체가 필요하다
		//ArrayList
		ArrayList<MemberVO> list = new ArrayList<>();
		MemberVO bag = null;
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
			String sql = "select*from hr.MEMBER where id =? "; 
			PreparedStatement ps = con.prepareStatement(sql);
			//con부품으로 sql스트링에 있는 것 SQL부품으로 만들기
			System.out.println("3. SQL문 부품(객체)으로 만들어주기");
			
			rs = ps.executeQuery();
			System.out.println("4. SQL문 오라클로 보내기 성공");
			while (rs.next()) {//검색결과가 있는지 여부는 rs.next
				//true이면 있다 ,false면 없다.
				System.out.println("검색 결과 있음");
				String id2 = rs.getString(1);
				String pw = rs.getString(2);
				String name = rs.getString(3);
				String tel = rs.getString(4);
				//System.out.println(id2+" "+pw+" "+name+" "+tel);
				//검색결과를 검색화면 ui부분을 주어야 함.
				bag = new MemberVO();
				bag.setId(id2);
				bag.setPw(pw);
				bag.setName(name);
				bag.setTel(tel);
				list.add(bag);
			}
			//System.out.println(result);
			ps.close();
			rs.close();
			con.close();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			//insert가 제대로 안된 경우, 위험한 상황이라고 판단하고
			//catch가 실행
			//실행된 Row수가 없으므로 Result에 0을 넣어주자.!
			e.printStackTrace();
		}
		return list;
	}
	public int update(MemberVO bag) {
		int result = 0;
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
			String sql = "update hr.MEMBER set tel=? where id =?";
			PreparedStatement ps = con.prepareStatement(sql);
			//con부품으로 sql스트링에 있는 것 SQL부품으로 만들기
			ps.setString(1, bag.getTel());
			ps.setString(2, bag.getId());
			System.out.println("3. SQL문 부품(객체)으로 만들어주기");
			
			result = ps.executeUpdate();
			System.out.println("4. SQL문 오라클로 보내기 성공");
			if (result ==  1) {
				System.out.println("수정 성공");
			}
			//System.out.println(result);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return result;
	}
	public int insert(MemberVO bag) {
		int result = 0;
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
			String sql = "insert into hr.MEMBER values(?, ?, ?, ?)";
			PreparedStatement ps = con.prepareStatement(sql);
			//con부품으로 sql스트링에 있는 것 SQL부품으로 만들기
			ps.setString(1, bag.getId());
			ps.setString(2, bag.getPw());
			ps.setString(3, bag.getName());
			ps.setString(4, bag.getTel());
			
			System.out.println("3. SQL문 부품(객체)으로 만들어주기");
			
			result = ps.executeUpdate();
			System.out.println("4. SQL문 오라클로 보내기 성공");
			if(result == 1) {
				System.out.println("회원 가입 성공!");
			}
			//System.out.println(result);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println(result);
		return result;
	}

	public MemberVO one(String id) {
		return null;
		// TODO Auto-generated method stub
		
	}
}

