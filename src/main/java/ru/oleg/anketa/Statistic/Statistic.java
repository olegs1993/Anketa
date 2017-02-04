package ru.oleg.anketa.Statistic;

import java.util.List;

/**
 * Created by Oleg on 04.02.2017.
 */
public class Statistic {
    private String name;
    private String surename;
    private String qestion1;
    private String question2;



    public Statistic(String name, String surename, String qestion1, String question2) {
        this.name = name;
        this.surename = surename;
        this.qestion1 = qestion1;
        this.question2 = question2;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurename() {
        return surename;
    }

    public void setSurename(String surename) {
        this.surename = surename;
    }

    public String getQestion1() {
        return qestion1;
    }

    public void setQestion1(String qestion1) {
        this.qestion1 = qestion1;
    }

    public String getQuestion2() {
        return question2;
    }

    public void setQuestion2(String question2) {
        this.question2 = question2;
    }
}



