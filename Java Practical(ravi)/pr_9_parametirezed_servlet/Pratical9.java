
import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Pratical9
 */
@WebServlet("/Pratical9")
public class Pratical9 extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Pratical9() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//create the ref varaible of printwriter
		PrintWriter pw=response.getWriter();
		pw.print("<HTML>");
		pw.print("<head>");
		pw.print("<title>First Servlet Program</title>");
		pw.print("</head>");
		pw.print("<body>");
		pw.print("<h1>This is my first servlet program of HTTP servlet as parametrized servlet</h1>");
		pw.print("</body>");
		pw.print("</HTML>");
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
