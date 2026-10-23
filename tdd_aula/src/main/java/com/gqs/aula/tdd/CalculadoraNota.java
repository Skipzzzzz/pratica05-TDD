package com.gqs.aula.tdd;

import static org.junit.jupiter.api.Assertions.assertThrows;

public final class CalculadoraNota {

    public double calcularNotaFinal(double a1, double a2, double a3) {
        return 70;
    }

    public boolean estaAprovadoPorNota(double notaFinal) {
        return notaFinal >= 70;
    }

    
}