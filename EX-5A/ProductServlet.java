import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/ProductServlet")
public class ProductServlet extends HttpServlet {
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();

        out.println("<h1>Stationary Shop Products</h1>");
        out.println("<ul>");
        out.println("<li>Notebook - ₹50.00</li>");
        out.println("<li>Pen - ₹10.00</li>");
        out.println("<li>Eraser - ₹5.00</li>");
        out.println("<li>Marker - ₹30.00</li>");
        out.println("<li>Ruler - ₹20.00</li>");
        out.println("</ul>");
    }
}
