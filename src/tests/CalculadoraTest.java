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

    @Test
    public void divideDoisNumerosInteiros() {
        int divide = calculadora.divisao(10, 2);
        Assertions.assertEquals(5, divide);
    }

    @Test
    public void divideUmNumeroPositivoEumNegativo() {
        int divide = calculadora.divisao(20, -10);
        Assertions.assertEquals(-2, divide);
    }

    @Test
    public void subtraiUmNumeroPositivoEumNegativo() {
        int divide = calculadora.subtracao(2, -1);
        Assertions.assertEquals(3, divide);
    }
}
