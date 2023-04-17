package org.example;

import static org.junit.jupiter.api.Assertions.*;

class MainTest {

    double valorPorcentaje1;
    double valorPorcentaje2;
    double valorpotencia1;
    double valorpotencia2;
    double valorpotencia3;
    double valorpotencia4;
    double valorMayor1;
    double valorMayor2;
    double valorMenor1;
    double valorMenor2;
    double valorSuma1;
    double valorSuma2;
    double valorResta1;
    double valorResta2;
    double valorDivision1;
    double valorDivision2;
    double valorMultiplicacion1;
    double valorMultiplicacion2;
    double valorMayorA0;
    double valorIgualA0;
    double valorMenorA0;
    double valorEcDeRecta1;
    double valorEcDeRecta2;
    double valorEcDeRecta3;
    double valorEcDeRecta4;
    double[] listaTestEcRecta= new double[4];
    int valorRango1;
    int valorRango2;
    int valorRango3;
    int valorMaxRango1;
    int valorMaxRango2;
    int valorMaxRango3;
    int valorMinRango1;
    int valorMinRango2;
    int valorMinRango3;
    /*double valorDiscriminante1;
    double valorDiscriminante2;
    double valorDiscriminante3;*/


    @org.junit.jupiter.api.BeforeEach
    void setUp() {
        valorPorcentaje1=-2;
        valorPorcentaje2=0.5;

        valorpotencia1=-9;
        valorpotencia2=3;
        valorpotencia3=9;
        valorpotencia4=3;

        valorMayor1=0;
        valorMayor2=0;

        valorMenor1=-2;
        valorMenor2=-3;

        valorSuma1=1;
        valorSuma2=-2;

        valorResta1=0;
        valorResta2=-3;

        valorDivision1=-4;
        valorDivision2=2;

        valorMultiplicacion1=0;
        valorMultiplicacion2=-2;

        valorMayorA0=3;
        valorIgualA0=0;
        valorMenorA0=-3;

        valorEcDeRecta1=1;
        valorEcDeRecta2=3;
        valorEcDeRecta3=2;
        valorEcDeRecta4=-5;
        listaTestEcRecta[0]=valorEcDeRecta1;
        listaTestEcRecta[1]=valorEcDeRecta2;
        listaTestEcRecta[2]=valorEcDeRecta3;
        listaTestEcRecta[3]=valorEcDeRecta4;

        valorRango1=0;
        valorRango2=-3;
        valorRango3=3;
        valorMaxRango1=3;
        valorMaxRango2=0;
        valorMaxRango3=3;
        valorMinRango1=-3;
        valorMinRango2=-1;
        valorMinRango3=1;
    }

    @org.junit.jupiter.api.Test
    void porcentaje() {
        assertEquals(-0.01,Main.porcentaje(valorPorcentaje1,valorPorcentaje2));
    }

    @org.junit.jupiter.api.Test
    void potencia() {
        assertEquals(-729,Main.potencia(valorpotencia1,valorpotencia2));
        assertEquals(729,Main.potencia(valorpotencia3,valorpotencia4));
    }

    @org.junit.jupiter.api.Test
    void numMayor() {
        assertEquals(0,Main.numMayor(valorMayor1,valorMayor2));
    }

    @org.junit.jupiter.api.Test
    void numMenor() {
        assertEquals(-3,Main.numMenor(valorMenor1,valorMenor2));
    }

    @org.junit.jupiter.api.Test
    void sumar() {
        assertEquals(-1,Main.sumar(valorSuma1,valorSuma2));
    }

    @org.junit.jupiter.api.Test
    void restar() {
        assertEquals(3,Main.restar(valorResta1,valorResta2));
    }

    @org.junit.jupiter.api.Test
    void dividir() {
        assertEquals(-2,Main.dividir(valorDivision1,valorDivision2));
    }

    @org.junit.jupiter.api.Test
    void multiplicar() {
        assertEquals(0,Main.multiplicar(valorMultiplicacion1,valorMultiplicacion2));
    }

    @org.junit.jupiter.api.Test
    void validarMayorA0() {
        assertTrue(Main.validarMayorA0(valorMayorA0));
        assertFalse(Main.validarMayorA0(valorIgualA0));
        assertFalse(Main.validarMayorA0(valorMenorA0));
    }

    @org.junit.jupiter.api.Test
    void validarDistinto0() {
        assertTrue(Main.validarDistinto0(valorMayorA0));
        assertFalse(Main.validarDistinto0(valorIgualA0));
        assertTrue(Main.validarDistinto0(valorMenorA0));
    }

    @org.junit.jupiter.api.Test
    void validarRangoNumero() {
        assertTrue(Main.validarRangoNumero(valorRango1,valorMinRango1,valorMaxRango1));
        assertFalse(Main.validarRangoNumero(valorRango2,valorMinRango2,valorMaxRango2));
        assertTrue(Main.validarRangoNumero(valorRango3,valorMinRango3,valorMaxRango3));
    }

    @org.junit.jupiter.api.Test
    void ecuacionRecta() {
        assertEquals("Y = -8.0X + 11.0",Main.ecuacionRecta(listaTestEcRecta));
    }

    /*@org.junit.jupiter.api.Test
    void calcDiscriminante() {
    }*/
}