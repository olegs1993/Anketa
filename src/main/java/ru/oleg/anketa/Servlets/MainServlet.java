package ru.oleg.anketa.Servlets;

import ru.oleg.anketa.Statistic.Statistic;
import ru.oleg.anketa.Statistic.StatisticList;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * Created by Oleg on 03.02.2017.
 */
public class MainServlet extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String name=req.getParameter("name");
        String surname=req.getParameter("surename");
        String qestion1=req.getParameter("java");
        String qestion2=req.getParameter("python");
        StatisticList.statisticList.add(new Statistic(name,surname,qestion1,qestion2));
        StatisticList.getStatistic();
        RequestDispatcher requestDispatcher=getServletContext().getRequestDispatcher("/WEB-INF/views/main.jsp");
        resp.sendRedirect("/Anketa_war_exploded/redirect");


    }


}
