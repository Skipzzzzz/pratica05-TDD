package com.gqs.aula.tdd;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class CalculadoraNotaTest {
    @Test
    void deveSomarAsTresNotas() {
        CalculadoraNota calc = new CalculadoraNota();
        double resultado = calc.calcularNotaFinal(20, 20, 30);
        assertEquals(70, resultado);
    }

    @Test
    void deveAprovarComNota70() {
        CalculadoraNota calc = new CalculadoraNota();
        assertTrue(calc.estaAprovadoPorNota(70));
    }

    @Test
    void deveReprovarComNota69() {
        CalculadoraNota calc = new CalculadoraNota();
        assertFalse(calc.estaAprovadoPorNota(69));
    }

    @Test
    void deveRejeitarA1MaiorQue30() {
        CalculadoraNota calc = new CalculadoraNota();
        assertThrows(IllegalArgumentException.class,
                () -> calc.calcularNotaFinal(35, 20, 30));
    }

    @Test
    void deveRejeitarA2MaiorQue30() {
        CalculadoraNota calc = new CalculadoraNota();
        assertThrows(IllegalArgumentException.class,
                () -> calc.calcularNotaFinal(29, 30.5, 30));
    }

    @Test
    void deveRejeitarA3MaiorQue40() {
        CalculadoraNota calc = new CalculadoraNota();
        assertThrows(IllegalArgumentException.class,
                () -> calc.calcularNotaFinal(28, 20, 42));
    }

    @Test 
    void deveAprovarComNotaEFrequenciaSuficientes() {
        CalculadoraNota calc = new calculadoraNota();
        assertEquals("Aprovado", calc.situacao(80, 90));
    }

    @Test 
    void deveReprovarComNotaBaixa() {
        CalculadoraNota calc = new calculadoranota();
        assertEquals("Reprovado", calc,situacao(60, 90));
    }
    @Test
    void deveReprovarPorFrequenciaMesmoComNotaAlta() {
        CalculadoraNota calc = new CalculadoraNota();
        assertEquals("Reprovado", calc.situacao(95, 74));
    }
    @Test 
    void deveAprovarComFrequenciaExatamente75() {
        CalculadoraNota calc = new CalculadoraNota();
        assertEquals("Aprovado", calc.situacao(70, 75));
    }
}