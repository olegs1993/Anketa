package ru.oleg.anketa.Statistic;

import java.util.LinkedList;
import java.util.List;

/**
 * Created by Oleg on 04.02.2017.
 */
public class StatisticList {
    public static String string;
    public static List<Statistic> statisticList=new LinkedList<Statistic>();
    public static void   getStatistic(){
        int x=0;
        int y=0;
        for (Statistic stat:statisticList) {
            if ("yes".equals(stat.getQestion1())){
                x++;
            }
            if ("yes".equals(stat.getQuestion2())){
                y++;
            }
        }

        string="На первый вопрос ответили "+x+" раз,на второй вопрос ответили "+y+" раз";
    }
}
