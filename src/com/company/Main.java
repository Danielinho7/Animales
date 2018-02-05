package com.company;

public class Main {


    public static void main(String[] args) {
        AnimalDomestico gat = new Gato("Perro","Azul");
        AnimalDomestico pero = new Perro("Pancho","Verde");
        Veterinario vet = new Veterinario(pero);
        gat.saludo();
        pero.saludo();
        vet.curar();




    }
}
