package myservlets;

import java.io.IOException;
import java.io.PrintWriter;
import myejbs.*;

import javax.ejb.EJB;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class ShowInterest
 */
@WebServlet("/ShowInterest")
public class ShowInterest extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
	@EJB
	AccountCalculator obj;
	
    public ShowInterest() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		PrintWriter out=response.getWriter();
		response.setContentType("text/html");
		
		String actype;
		double amount,interest;
		
		actype=request.getParameter("typ");
		amount=Double.parseDouble(request.getParameter("amt"));
		interest=obj.calcInterest(actype, amount);
		out.println("Interest will be : "+interest);
		
	}

}
