package com.learn.task2.ex_5;

public class CompanyStaff {
    static CustomList employees;

    public static CustomList initialize() {

        Workers[] staff = {new Workers(new Lawyer(), "lawyer"),
                new Workers(new Accountant(),"accountant"),
                new Workers(new Director(),"director"),
                new Workers(new DeputyDirector(),"deputyDirector"),
        new Workers(new SeniorManager(),"seniorManager"),
        new Workers(new JuniorManager(),"juniorManager"),
        new Workers(new TeamLid(),"teamLid"),
        new Workers(new Seniors(),"seniors"),
        new Workers(new Middles(),"middles"),
        new Workers(new Juniors(),"juniors"),};

        employees = new CustomList(staff);
        return employees;
    }


    public String iterateEmployees() {
        StringBuilder staff = new StringBuilder();
        for(Workers worker : employees) staff.append(worker.getPosition()).append(" ");
        return staff.toString();
    }





}
