package servlet;

import dao.CadastroDao;
import model.Cadastro;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/create-cadastro")
public class CreateCadastroServlet extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
        String cadId = request.getParameter("cad_id");
        String cadUserName = request.getParameter("cad_username");
        String cadEmail = request.getParameter("cad_email");
        String cadPassword = request.getParameter("cad_password");
        String cadPasswordConf = request.getParameter("cad_passwordconf");


        CadastroDao cadastroDao = new CadastroDao();
        Cadastro cadastro = new Cadastro(cadId, cadUserName, cadEmail,cadPassword, cadPasswordConf);

        //new ReportarDao().createReportar(reportar);

        //request.getRequestDispatcher("reportar.jsp").forward(request,response);


        if(cadId.isBlank()){
            cadastroDao.createCadastro(cadastro);
        } else{
            cadastroDao.updateCadastro(cadastro);
        }


        response.sendRedirect("/find-all-cadastro");

    }
}
