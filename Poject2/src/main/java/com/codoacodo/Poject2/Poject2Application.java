package com.codoacodo.Poject2;

import lombok.Getter;
import lombok.Setter;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Scanner;

@Getter
@Setter
@SpringBootApplication
public class Poject2Application {
    private String nombre;
    private int edad;

    public Poject2Application() {
    }
    public Poject2Application(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }

    public void ingresarDatos(){
        Scanner sc = new Scanner(System.in);

        System.out.print("Ingrese su nombre: ");
        nombre = sc.nextLine();

        System.out.print("Ingrese su edad: ");
        edad = sc.nextInt();
    }

    public void mostrarDatos(){

        System.out.println("Su nombre es: "+ nombre + " y su edad es: " + edad);

    }

    public static void main(String[] args) {
        SpringApplication.run(Poject2Application.class, args);

        Poject2Application project = new Poject2Application();

        project.ingresarDatos();

        project.mostrarDatos();
    }
}
