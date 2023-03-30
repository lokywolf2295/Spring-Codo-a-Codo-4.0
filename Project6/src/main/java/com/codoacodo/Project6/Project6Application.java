package com.codoacodo.Project6;
import com.codoacodo.Project6.model.Demarcacion;
import com.codoacodo.Project6.model.Equipo;
import com.codoacodo.Project6.model.Futbolista;
public class Project6Application {

	public static void main(String[] args) {
		Futbolista futbolista1=new Futbolista(Demarcacion.DELANTERO, Equipo.REALMADRID);
		Futbolista futbolista2=new Futbolista(Demarcacion.MEDIOCAMPISTA, Equipo.BARCA);
		Futbolista futbolista3=new Futbolista(Demarcacion.ARQUERO, Equipo.SEVILLA);
		Futbolista futbolista4=new Futbolista(Demarcacion.DEFESOR, Equipo.VILLAREAL);

		futbolista1.MostrarEquipo();
		futbolista2.MostrarEquipo();
		futbolista3.MostrarEquipo();
		futbolista4.MostrarEquipo();
	}
}
