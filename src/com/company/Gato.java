package com.company;

public class Gato extends AnimalDomestico {

    public Gato (String nombre, String color) {
        super(nombre,color);
    }
    public void saludo() {
        System.out.println("MIAU");
    }
}
