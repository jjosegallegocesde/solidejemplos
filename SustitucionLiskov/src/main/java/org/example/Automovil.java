package org.example;

public class Automovil extends Vehiculo {

    private int puertas;

    public Automovil() {
    }

    public Automovil(String marca, String modelo, int puertas) {
        super(marca, modelo);
        this.puertas = puertas;
    }

    @Override
    public void conducir() {
        System.out.println("Conduciendo un automóvil de marca " + this.getMarca() + " modelo " + this.getModelo() + " con " + puertas + " puertas.");
    }

}
