import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;

@WebServlet("/CounterServlet")
public class CounterServlet extends HttpServlet {
    private int counter = 0;

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();

        counter++;
        out.println("<h1>Stationary Shop</h1>");
        out.println("<p>Page Visits: " + counter + "</p>");
    }
}
