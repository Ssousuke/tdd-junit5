package tests;

import entities.Calculadora;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;


public class CalculadoraTest {
    Calculadora calculadora = new Calculadora();

    @Test
    // Soma dois números positivos
    public void somaDoisNumerosPositivos() {
        int soma = calculadora.somar(10, 10);
        Assertions.assertEquals(20, soma);
    }

    @Test
    // Soma um número positivo com um número negativo
    public void somaUmNumeroPositivoEumNegativo() {
        int soma = calculadora.somar(10, -20);
        Assertions.assertEquals(-10, soma);
    }
}
