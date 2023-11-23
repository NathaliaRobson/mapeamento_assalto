package servlet;

import dao.ReportarDao;
import model.Reportar;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

@WebServlet({"/find-all-reportars", "/admin/find-all-reportars"})
public class ListReportarServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        List<Reportar> reportars = new ReportarDao().findAllReportars();

        request.setAttribute("reportars", reportars);

        request.getRequestDispatcher("dashboard.jsp").forward(request, response);

    }
}
