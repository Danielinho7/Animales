package com.company;

public class Perro extends AnimalDomestico {

    public Perro (String nombre, String color) {
        super(nombre,color);
    }
    public void saludo() {
        System.out.println("GUAU");
    }
}
