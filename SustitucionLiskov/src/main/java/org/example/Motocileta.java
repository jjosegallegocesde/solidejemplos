package org.example;

public class Motocileta extends Vehiculo{

    private int cilindraje;

    public Motocileta() {
    }

    public Motocileta(String marca, String modelo, int cilindraje) {
        super(marca, modelo);
        this.cilindraje = cilindraje;
    }

    @Override
    public void conducir() {
        System.out.println("Montando en moto " + cilindraje + " (¡sin manos!).");
    }



}
