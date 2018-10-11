package pak.vincent;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import sapcontrol.ArrayOfJ2EEWebSession2Type;
import sapcontrol.J2EEWebSession2Type;
import sapcontrol.SAPControl;
import sapcontrol.SAPControlPortType;

/**
 * Servlet implementation class SAPControlClientServlet
 */
public class SAPControlClientServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public SAPControlClientServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
        PrintWriter out = response.getWriter();
        out.println("<p>Current users on the server</p>");
        
        sapcontrol.SAPControl service = new SAPControl();
        SAPControlPortType port = service.getSAPControl();
        List<J2EEWebSession2Type> webSessionList2 = port.j2EEGetWebSessionList2().getItem();
        for (J2EEWebSession2Type webSession2: webSessionList2){
        	String userName = webSession2.getUser().getValue();
        	out.println("<p>"+userName+"</p>");
        }        

	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	}

}
