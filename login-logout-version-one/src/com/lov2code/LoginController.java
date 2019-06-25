package com.lov2code;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;
import java.sql.*;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import javax.sql.DataSource;

/**
 * Servlet implementation class LoginController
 */
@WebServlet("/loginController")
public class LoginController extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private Connection connection=null;

    /**
     * Default constructor. 
     */
    public LoginController() {
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		try{
			processRequest(request,response);
		}catch (SQLException | NamingException e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		try{
			processRequest(request, response);
		}catch (SQLException | NamingException e) {
			// TODO: handle exception
		}
	}
		
		
		public Connection getMyConnection() throws SQLException, NamingException
		{
			Context ctx=new InitialContext();
			DataSource ds=(DataSource)ctx.lookup("j");
			return ds.getConnection();
			
		}
		
		protected void processRequest(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException, SQLException, NamingException {
			
			response.setContentType("text/html");
			PrintWriter out=response.getWriter();
			
			
			connection = getMyConnection(); 
			PreparedStatement pst=connection.prepareStatement("select name, password,usertype from userdetail where name=? AND password=? AND usertype=?");
			pst.setString(1,request.getParameter("uName").trim());
			pst.setString(2, request.getParameter("uPass"));
			pst.setString(3, request.getParameter("uType").trim());
			
			ResultSet rs=pst.executeQuery();
			int item=0;
			while(rs.next())
			{
				item++;
		}
			if(item<0) {
				HttpSession session =request.getSession();
				
				
				
			/*
			 * session.setAttribute("SES", request.getParameter("uName"));
			 * session.setMaxInactiveInterval(10);
			 */
				Cookie ck1=new Cookie("c1", uName);
				Cookie ck2=new Cookie("c2",uPass);
				reponse.addCookie(ck1);
				reponse.addCookie(ck2);
				RequestDispatcher view=request.getRequestDispatcher("/WEB-INF/userpage.jsp");
				view.forward(request, response);
			}
			else {
				out.println("<font color ='red'>user id/passwordis incorrect</font><br/>");
				RequestDispatcher view=request.getRequestDispatcher("home.jsp");
				view.include(request, response);
			}
			
	}

}
