package com.codoacodo.Project4;

import java.util.Date;

public class American extends Aircraft{

    private String route;
    private int repetition;
    private Date date;

    public American(String codeA, String model, int ticketCounter, String color, boolean success) {
        super(codeA, model, ticketCounter, color, success);
        this.route = route;
        this.repetition = repetition;
        this.date = date;
    }

    public void numberOfFlights(int v){
        System.out.println(v);
    }

    public void numberOfFlights(double x){
        System.out.println("Esta es la sobrecarga: "+x);
    }

    public void numberOfFlights(double y, int x){
        System.out.println("Esta es la segunda sobrecarga" + y + " "+x);
    }
}
