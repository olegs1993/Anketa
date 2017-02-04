package ru.oleg.anketa.Servlets;

import ru.oleg.anketa.Statistic.StatisticList;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * Created by Oleg on 04.02.2017.
 */
public class RedirectedServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        RequestDispatcher requestDispatcher=getServletContext().getRequestDispatcher("/WEB-INF/views/main.jsp");
         req.setAttribute("size", StatisticList.statisticList.size());
        req.setAttribute("statistic",StatisticList.string);
        requestDispatcher.forward(req,resp);
    }
}
