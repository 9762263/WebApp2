

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;


@WebServlet("/Servlet1")
public class Servlet1 extends HttpServlet {
	private static final long serialVersionUID = 1L;
	 public void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
	        getServletContext().getRequestDispatcher("/hello.jsp").forward(req, resp);
	        
	    }
	/*
	List<String> list1=new ArrayList<String>();
	List<String> list2=new ArrayList<String>();
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String name=request.getParameter("name");
		String surname =request.getParameter("surname");
		String knopka1=request.getParameter("далее");
		
		if(name!=null){
			list1.add(name);
			response.sendRedirect("Surname.html");
		}
		if(surname!=null){
		list2.add(surname);
		response.sendRedirect("Name.html");
		}
		System.out.println(knopka1);
		System.out.println(list1);
		System.out.println(list2);
		response.setContentType("text/html;charset=utf-8");
		
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
	}
*/
}
