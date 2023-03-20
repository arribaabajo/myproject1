package multi;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/check.do")
public class Check extends HttpServlet {
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String today = request.getParameter("today");
		String result = "";
		if(today.equals("맑음")) {
			result = "나가자";
		}else if(today.equals("흐림")) {
			result="코딩";
		}else if(today.equals("비옴")) {
			result="쇼핑";
		}
		response.setContentType("text/html;charset=utf-8");
		PrintWriter out = response.getWriter();
		out.print(result);
		out.close();
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		request.setCharacterEncoding("utf-8");
		
		String pass = request.getParameter("pass");
		String result = "들어올 수 없습니다.<img src='no.jpg'>";
		if (pass.equals("나는왕이다")) {
			result = "들어오세요.<img src='yes.jpg'>";
		} 
		// setContentType은 out만들기 전에 설정!!
		response.setContentType("text/html;charset=utf-8");
		PrintWriter out = response.getWriter();
		out.print(result);
		out.close();
	}
}