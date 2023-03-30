package com.codoacodo.Project6.model;

public class Futbolista {
    private Demarcacion demarcacion;
    private Equipo equipo;

    /*Creo el constructor de la clase*/
    public Futbolista(Demarcacion demarcacion, Equipo equipo) {
        this.demarcacion = demarcacion;
        this.equipo = equipo;
    }

    /*Creo los Metodos Getter*/
    public Demarcacion getDemarcacion() {
        return demarcacion;
    }

    public Equipo getEquipo() {
        return equipo;
    }

    /*Creo el metodo que muestra el equipo y su puesto en la liga*/
    public void MostrarEquipo()
    {
        System.out.println("Mostrar Equipo: "+this.equipo.getNombreClub()+", que se encuentra en el Puesto: " +this.equipo.getPuestoLiga() + " de la Liga");
    }
}
