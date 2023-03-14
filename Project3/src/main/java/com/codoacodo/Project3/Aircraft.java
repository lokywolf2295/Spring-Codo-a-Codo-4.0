package com.codoacodo.Project3;

import lombok.Data;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@Data
public class Aircraft {

	private String codeA;
	private String model;
	private int ticketCounter;
	private String color;
	private boolean success;

	public Aircraft(String codeA, String model, int ticketCounter, String color, boolean success) {
		this.codeA = codeA;
		this.model = model;
		this.ticketCounter = ticketCounter;
		this.color = color;
		this.success = success;
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

	public static void main(String[] args) {

		Aircraft aircraft1 = new Aircraft("3","comercial", 12, "celeste", true);
		aircraft1.fly();
		aircraft1.land();
		aircraft1.takeOff();

		System.out.println();

		Aircraft aircraft2 = new Aircraft("6","comercial", 20, "rojo", false);
		aircraft2.fly();
		aircraft2.land();
		aircraft2.takeOff();

		System.out.println();

		American aircraft3 = new American("9","comercial", 8, "negro", true);
		aircraft3.fly();
		aircraft3.land();
		aircraft3.takeOff();

		aircraft3.numberOfFlights(20);
		aircraft3.numberOfFlights(10.5);
		aircraft3.numberOfFlights(1.5,7);
	}

}
