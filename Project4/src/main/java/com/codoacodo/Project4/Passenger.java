package com.codoacodo.Project4;

import lombok.Data;

@Data
public class Passenger {
	private String name;
	private String lastName;
	private int dni;
	private String entry;

	public Passenger(String name, String lastName, int dni, String entry) {
		this.name = name;
		this.lastName = lastName;
		this.dni = dni;
		this.entry = entry;
	}

	
}
