import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/ProductSearchServlet")
public class ProductSearchServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();

        String product = request.getParameter("product").toLowerCase();
        out.println("<h1>Product Search Results</h1>");
        if (product.contains("notebook")) {
            out.println("<p>Notebook - ₹50.00</p>");
        } else if (product.contains("pen")) {
            out.println("<p>Pen - ₹10.00</p>");
        } else {
            out.println("<p>Product not found!</p>");
        }
    }
}
