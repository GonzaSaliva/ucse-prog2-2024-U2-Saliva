package org.example;

import org.example.Avion;
import org.example.AvionPrivado;
import org.example.CalculadorCombustible;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class CalculadorCombustibleTest {

    @Test
    public void testCalcularCombustible() {

        CalculadorCombustible calculador = CalculadorCombustible.getInstance();
        Avion avion = mock(Avion.class);

        when(avion.volar(10)).thenReturn(75);

        int resultado = calculador.calcularCombustible(avion, 10);

        Assertions.assertEquals(calculador.calcularCombustible(avion,10), resultado);
    }
}