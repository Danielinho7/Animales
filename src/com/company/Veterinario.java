package com.company;

public class Veterinario {
    AnimalDomestico animal;

    public Veterinario(AnimalDomestico animal) {

        this.animal = animal;
    }
    public void curar () {
        if(this.animal instanceof  Gato)
            System.out.println("Se cura al gato");
        else
            System.out.println("Se cura al perro");
        this.animal.saludo();


    }


}
