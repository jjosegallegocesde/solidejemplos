package org.example.modelos;

public class Domestico extends Animal{

    public Domestico() {
    }

    public Domestico(String nombre) {
        super(nombre);
    }

    @Override
    public void hacerSonido() {
        System.out.println(getNombre() + " hace ladridos: ¡Guau, guau!");
    }
}
