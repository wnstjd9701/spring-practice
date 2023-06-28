package com.sample.myall;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class EmpServlet
 */
@WebServlet({ "/EmpServlet", "/emp.do", "*.do" })
public class EmpServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

    /**
     * Default constructor. 
     */
    public EmpServlet() {
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
//		String cmd = request.getParameter("cmd");
		String uri = request.getRequestURI();
		System.out.println(uri);
		String view = "";
		
		if("/WebPrj/a.do".equals(uri)) {
			// a 요청을 처리하는 코드
			System.out.println("a 요청을 처리합니다.");
			EmpDao dao = new EmpDao();
			EmpVO emp = dao.getData(); // biz() 메서드 실행
			
			request.setAttribute("empData", emp); // View(JSP)에서 출력할 데이터를 요청객체에 저장
			view = "result.jsp";
			
		}else if("/WebPrj/b.do".equals(uri)) {
			// b 요청을 처리하는 코드
			System.out.println("b 요청을 처리합니다.");
			view = "result_b.jsp";
			System.out.println("다른 페이지로 redirect 합니다.");
			
//			request.setAttribute("message", "Hello.B");
			HttpSession session = request.getSession();
			session.setAttribute("message", "Hello B");
			
			response.sendRedirect(view);
			return; // 이후의 코드가 실행되면 안됨.
		}
		
		// JSP로 제어를 이동시키는 코드
		RequestDispatcher disp = request.getRequestDispatcher(view); 
		disp.forward(request, response);
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
