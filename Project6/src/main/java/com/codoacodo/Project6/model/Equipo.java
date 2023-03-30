package com.codoacodo.Project6.model;

/*Creo el enum de los equipos agregando cada equipo y su puesto en la liga*/
public enum Equipo { BARCA("FC Barcelona",1), REALMADRID("Real MAdrid",2),SEVILLA("Sevilla",4),VILLAREAL("Villareal",3);
    private String nombreClub;
    private int puestoLiga;

    /*Creo el constructor de la clase equipo*/
    private Equipo(String nombreClub, int puestoLiga) {
        this.nombreClub=nombreClub;
        this.puestoLiga=puestoLiga;
    }

    /*Creo los metodos get de cada parametro*/
    public String getNombreClub() {
        return nombreClub;
    }

    public int getPuestoLiga() {
        return puestoLiga;
    }
}
