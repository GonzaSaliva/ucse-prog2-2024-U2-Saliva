package org.example;

import org.example.AvionComercial;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class AvionComercialTest {

    //Avion comercial
    AvionComercial avionComercial = new AvionComercial(2000, 15);

    @Test
    public void volar() {
        Assertions.assertEquals(450, avionComercial.volar(30));
    }

    @Test
    public void getCapacidadCombustible() {
        int capacidad = avionComercial.getCapacidadCombustible();
        Assertions.assertEquals(2000, avionComercial.getCapacidadCombustible());
    }

    @Test
    public void getCapacidadComercial() {
        int capacidad = avionComercial.getCapacidadCombustible();
        Assertions.assertEquals(15, avionComercial.getConsumoCombustible());
    }
}