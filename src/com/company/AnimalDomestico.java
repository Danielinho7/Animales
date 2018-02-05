package com.company;

abstract public class AnimalDomestico {
    private String nombre;
    private String color;

    public AnimalDomestico(String nombre, String color) {
        this.nombre = nombre;
        this.color = color;
    }

    abstract  public void saludo ();


}
