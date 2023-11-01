package servlet;

import dao.ReportarDao;
import model.Reportar;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/create-reportar")
public class CreateReportarServlet extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
        String repId = request.getParameter("id");
        String repName = request.getParameter("rep-name");
        String repEmail = request.getParameter("rep-email");
        String repZona = request.getParameter("rep-zona");
        String repBairro = request.getParameter("rep-bairro");
        String repAnonimo = request.getParameter("rep-anonimo");
        String repMensagem = request.getParameter("rep-mensagem");

        ReportarDao reportarDao = new ReportarDao();
        Reportar reportar = new Reportar(repId,repName,repEmail, repZona, repBairro, repAnonimo, repMensagem);

        if(repId.isBlank()){
            reportarDao.createReportar(reportar);
        } else{
            reportarDao.updateReportar(reportar);
        }


        response.sendRedirect("/find-all-reportars");
    }

}
