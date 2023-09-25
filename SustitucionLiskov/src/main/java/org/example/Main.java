package org.example;

public class Main {
    public static void main(String[] args) {

        Vehiculo vehiculo = new Vehiculo("Desconocida", "Desconocido");
        Automovil automovil = new Automovil("Toyota", "Corolla", 4);
        Motocileta moto =new Motocileta("bmw","ask",250);

        /*vehiculo.conducir();
        automovil.conducir();
        moto.conducir();*/

        vehiculo=automovil;
        vehiculo.conducir();

        vehiculo=moto;
        vehiculo.conducir();

    }
}