package org.example.modelos;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import static org.junit.jupiter.api.Assertions.*;

class AnimalTest {

    private Animal animal ;

    @BeforeEach
    public void configurarPrueba(){
        this.animal= Mockito.mock(Animal.class);
    }

    @Test
    public void probarMetodosPadre(){

        //ejecuta
        Mockito.when(animal.getNombre()).thenReturn("Animal Simulado");

        // Verificar el resultado utilizando una aserción JUnit
        String nombreObtenido = animal.getNombre();
        Assertions.assertEquals("Animal Simulado", nombreObtenido);

    }


}