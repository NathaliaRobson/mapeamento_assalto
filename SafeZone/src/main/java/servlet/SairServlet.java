package servlet;

import dao.UserDao;
import model.User;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/sair")
public class SairServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        request.getRequestDispatcher("login.jsp").forward(request, response);

    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        String username = req.getParameter("username");
        String password = req.getParameter("password");

        User user = new User(username, password);

        boolean isValidUser = new UserDao().verifyCredentials(user);

        if (isValidUser) {

            req.getSession().setAttribute("loggedUser", username);

            resp.sendRedirect("/find-all-reportars");

        } else {

            req.setAttribute("message", "Invalid credentials!");

            req.getRequestDispatcher("/login.jsp").forward(req, resp);

        }

    }

    }

