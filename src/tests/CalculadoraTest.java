package tests;

import entities.Calculadora;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;


public class CalculadoraTest {
    @Test
    public void somaDoisNumerosPositivos() {
        Calculadora calculadora = new Calculadora();
        int somaPositivo = calculadora.somar(10, 10);
        Assertions.assertEquals(20, somaPositivo);
    }
}
