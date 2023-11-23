package servlet;

import dao.CadastroDao;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/delete-cadastro")
public class DeleteCadastroServlet extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws IOException {

        String cadId = req.getParameter("cad_id");

        new CadastroDao().deleteCadastroById(cadId);

        resp.sendRedirect("/find-all-cadastro");

    }
}
