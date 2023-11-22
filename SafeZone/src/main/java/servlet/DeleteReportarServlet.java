package servlet;

import dao.ReportarDao;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/delete-reportar")
public class DeleteReportarServlet extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws IOException {

        String repId = req.getParameter("id");

        new ReportarDao().deleteReportarById(repId);

        resp.sendRedirect("/find-all-reportars");

    }

}