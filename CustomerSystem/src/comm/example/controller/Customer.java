package comm.example.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Customer
 */
@WebServlet("/Customer")
public class Customer extends HttpServlet {
	private static final long serialVersionUID = 1L;

    /**
     * Default constructor. 
     */
    public Customer() {
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}
	
	protected void doProcess(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

		resp.setContentType("text/html");
		
		PrintWriter out = resp.getWriter();
		List<String> l=new ArrayList<String>();
		/*try {
		/*cid = Integer.parseInt(req.getParameter("c"));
		}
		catch(Exception e)
		{
			l.add("id field must benumeric");
		}
		Object cname = req.getParameter("cname");
		if(l.length()<=0)
		{
			l.add("First Name field can't be blank");
		}
		
		try {
			
			= Integer.parseInt(req.getParameter("e_sal"));
			}
			catch(Exception e)
			{
				l.add("salary field must benumeric");
			}*/
		
		if(!l.isEmpty())
		{
			req.setAttribute("ERROR",l );
			RequestDispatcher view=req.getRequestDispatcher("add_customer.jsp");
			view.forward(req, resp);
		}
		else {
			Customer customer = new Customer(cname, cadd, citem);
			cService.createCustomer(customer);
			req.setAttribute("E", customer);
			RequestDispatcher view=req.getRequestDispatcher("Success.jsp");
			view.forward(req, resp);
		}
		
		

	
	

	}
	}
