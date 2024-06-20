package org.example;

import org.example.AvionPrivado;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class AvionPrivadoTest {

    //Avion comercial
    AvionPrivado avionPrivado = new AvionPrivado(1000, 10);

    @Test
    public void volar() {
        Assertions.assertEquals(600, avionPrivado.volar(10));
    }

    @Test
    public void getCapacidadCombustible(){
        int capacidad = avionPrivado.getCapacidadCombustible();
        Assertions.assertEquals(1000, avionPrivado.getCapacidadCombustible());
    }

    @Test
    public void getConsumoCombustible(){
        int capacidad = avionPrivado.getCapacidadCombustible();
        Assertions.assertEquals(10, avionPrivado.getConsumoCombustible());
    }
}