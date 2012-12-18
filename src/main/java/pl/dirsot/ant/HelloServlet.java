
package pl.dirsot.ant;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@javax.servlet.annotation.WebServlet(urlPatterns = { "/hello" })
public class HelloServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        request.setAttribute("hello_string", "Hello WebApp! z ant i pom");

        request.getRequestDispatcher("/hello.jsp").forward(request, response);

    }
}