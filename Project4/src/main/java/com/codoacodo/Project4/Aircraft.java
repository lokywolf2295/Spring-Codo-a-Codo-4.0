package com.codoacodo.Project4;

import lombok.Data;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.ArrayList;
import java.util.List;

@SpringBootApplication
@Data
public class Aircraft {

	private String codeA;
	private String model;
	private int ticketCounter;
	private String color;
	private boolean success;
	private List<Passenger> passengers;

	public Aircraft(String codeA, String model, int ticketCounter, String color, boolean success) {
		this.codeA = codeA;
		this.model = model;
		this.ticketCounter = ticketCounter;
		this.color = color;
		this.success = success;
		this.passengers = new ArrayList<>();
	}

	public void fly(){
		String message = (success==true) ? "vuelo exitoso":"error catastrófico";
		System.out.println(message);
		System.out.println(this.codeA + " " +this.model +" "+this.color +" "+this.ticketCounter);
	}

	public void land(){
		String message = (success == true)? "aterrizaje exitoso": "vuelo fatal";
		System.out.println(message);
	}

	public void takeOff(){
		String message = (success == true)? "despegue exitoso": "despegue fatal";
		System.out.println(message);
	}

	public void uploadPassenger(Passenger passenger){
		this.passengers.add(passenger);
	}
	public  void showPassengers(){
		System.out.println("Aca lista de pasajeros ");
		for (Passenger pj : passengers) {
			System.out.println(pj);
		}
	}

	public static void main(String[] args) {

		Aircraft aircraft1 = new Aircraft("3","comercial", 12, "celeste", true);

		List<String> lista = new ArrayList<>();
		lista.add("hola");
		lista.add("que");
		lista.add("tal");
		lista.add("estas");

		Passenger passenger1 = new Passenger("Juan", "Lopez",27942333,"22A");
		Passenger passenger2 = new Passenger("Pedro", "Perez",27942334,"22B");
		Passenger passenger3 = new Passenger("Juana", "Lopez",27942335,"12C");


		aircraft1.uploadPassenger(passenger1);
		aircraft1.uploadPassenger(passenger2);
		aircraft1.uploadPassenger(passenger3);

		aircraft1.showPassengers();



		for (int i = 0; i < lista.size(); i++) {
			System.out.println(lista.get(i));
		}

		for (String cadena : lista) {
			System.out.println(cadena);
		}
	}

}
