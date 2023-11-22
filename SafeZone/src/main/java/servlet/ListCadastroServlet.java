package servlet;

import dao.CadastroDao;
import model.Cadastro;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;


@WebServlet("/find-all-cadastro")
public class ListCadastroServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        List<Cadastro> cadastro = new CadastroDao().findAllCadastro();

        request.setAttribute("cadastro", cadastro);

        request.getRequestDispatcher("login.jsp").forward(request, response);

    }
}
