import java.io.*;
import javax.servlet.*;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;
@WebServlet("/LoginServlet")
public class LoginServlet extends HttpServlet {
    public void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();

        String username = request.getParameter("username");
        String password = request.getParameter("password");

        // Simple validation (You can replace with DB check)
        if(username.equals("admin") && password.equals("1234")) {
            // Forward to WelcomeServlet
            RequestDispatcher rd = request.getRequestDispatcher("WelcomeServlet");
            rd.forward(request, response);
        } else {
            // Include error.html
            RequestDispatcher rd = request.getRequestDispatcher("error.html");
            rd.include(request, response);
        }
    }
}
