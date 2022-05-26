package tests;

import entities.Calculadora;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;


public class CalculadoraTest {
    Calculadora calculadora = new Calculadora();
    @Test
    public void somaDoisNumerosPositivos() {
        int somaPositivo = calculadora.somar(10, 10);
        Assertions.assertEquals(20, somaPositivo);
    }

    @Test
    public void somaUmNumeroPositivoEumNegativo() {
        int somaPositivo = calculadora.somar(10, -20);
        Assertions.assertEquals(-10, somaPositivo);
    }

    @Test
    public void multiplicaDoisNumerosPositivos() {
        int multiplica = calculadora.multiplica(2, 10);
        Assertions.assertEquals(20, multiplica);
    }

    @Test
    public void multiplicaUmNumeroPositivoEumNumeroNegativo() {
        int multiplica = calculadora.multiplica(2, -10);
        Assertions.assertEquals(-20, multiplica);
    }
}
