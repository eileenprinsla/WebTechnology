import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;

@WebServlet("/WelcomeServlet")
public class WelcomeServlet extends HttpServlet {
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        HttpSession session = request.getSession();
        String username = (String) session.getAttribute("username");

        response.setContentType("text/html");
        PrintWriter out = response.getWriter();

        if (username != null) {
            out.println("<h1>Welcome, " + username + "</h1>");
        } else {
            out.println("<h1>Please login first.</h1>");
        }
    }
}
