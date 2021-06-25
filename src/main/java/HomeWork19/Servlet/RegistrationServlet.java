package HomeWork19.Servlet;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

import static HomeWork19.Servlet.InMemoryStorage.createUser;
import static HomeWork19.Servlet.InMemoryStorage.userExist;

@WebServlet("/registration")
public class RegistrationServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        String name = req.getParameter("name");
        String username = req.getParameter("username");
        String password = req.getParameter("password");

        User user = createUser(name, username, password);

        if (userExist(user)){
           resp.getWriter().println("User exist");
        } else {
            resp.getWriter().println("User registered");
        }


    }
}
