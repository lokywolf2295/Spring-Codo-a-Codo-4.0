package com.codoacodo.Project4;

import lombok.Data;
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


	}

}
