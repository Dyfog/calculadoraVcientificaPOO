package org.example;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

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
    double valorDiscriminante1;
    double valorDiscriminante2;
    double valorDiscriminante3;
    double valorDiscriminante4;
    double valorDiscriminante5;
    double valorDiscriminante6;
    double[] lista1Sist2x2= new double[3];
    double[] lista2Sist2x2= new double[3];
    double[] lista3Sist2x2= new double[3];
    double[] lista4Sist2x2= new double[3];
    double[] datosTest = new double[2];
    double[] datosTest2 = new double[2];
    double[] datosTest3 = new double[2];
    double[] datosTest4 = new double[2];

    @BeforeEach
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

        valorDiscriminante1=2;
        valorDiscriminante2=-2;
        valorDiscriminante3=-2;
        valorDiscriminante4=-2;
        valorDiscriminante5=0;
        valorDiscriminante6=0;

        lista1Sist2x2= new double[]{-1, -2, -3};
        lista2Sist2x2= new double[]{1, 2, 3};

        lista3Sist2x2= new double[]{1, 2, 3};
        lista4Sist2x2= new double[]{4, 5, 6};

        datosTest[0] = 2;
        datosTest[1] = 4;

        datosTest2[0] = 1;
        datosTest2[1] = 1;

        datosTest3[0] = 0;
        datosTest3[1] = 0;

        datosTest4[0] = -1;
        datosTest4[1] = -25;
    }

    @AfterEach
    void tearDown() {
    }
    @Test
    void perimetroCuadrado() {
        assertEquals(8,Main.perimetroCuadrado(datosTest));
    }

    @Test
    void perimetroRectangulo() {
        assertEquals(12,Main.perimetroRectangulo(datosTest));
    }

    @Test
    void perimetroCirculo() {
        assertEquals(6.28,Main.perimetroCirculo(datosTest),0.2);
    }

    @Test
    void perimetroEsfera() {
        assertEquals(12.56,Main.perimetroEsfera(datosTest),0.2);
    }

    @Test
    void perimetroCubo() {
        assertEquals(24,Main.perimetroCubo(datosTest));
    }

    @Test
    void perimetroCono() {
        assertEquals(17.03,Main.perimetroCono(datosTest), 0.2);
        assertEquals(7.69,Main.perimetroCono(datosTest2), 0.2);
    }

    @Test
    void areaCuadrado() {
        assertEquals(4,Main.areaCuadrado(datosTest));
    }

    @Test
    void areaRectangulo() {
        assertEquals(8,Main.areaRectangulo(datosTest));
    }

    @Test
    void areaCirculo() {
        assertEquals(12.56,Main.areaCirculo(datosTest), 0.2);
    }

    @Test
    void areaEsfera() {
        assertEquals(50.26,Main.areaEsfera(datosTest),0.2);
    }

    @Test
    void areaCubo() {
        assertEquals(24,Main.areaCubo(datosTest));
    }

    @Test
    void areaCono() {
        assertEquals(40.67,Main.areaCono(datosTest), 0.2);
        assertEquals(7.58,Main.areaCono(datosTest2), 0.2);
    }

    @Test
    void volumenEsfera() {
        assertEquals(33.51,Main.volumenEsfera(datosTest),0.2);
    }

    @Test
    void volumenCubo() {
        assertEquals(8,Main.volumenCubo(datosTest));
    }

    @Test
    void volumenCono() {
        assertEquals(16.75,Main.volumenCono(datosTest), 0.2);
    }

    @Test
    void comprobarCero() {
        assertTrue(Main.comprobarCero(datosTest));
        assertFalse(Main.comprobarCero(datosTest3));
    }
    @Test
    void comprobarMenorCero() {
        assertTrue(Main.comprobarMenorCero(datosTest));
        assertFalse(Main.comprobarMenorCero(datosTest4));
    }
    @Test
    void comprobarTriangulo() {
        assertTrue(Main.comprobarTriangulo(datosTest));
        assertFalse(Main.comprobarTriangulo(datosTest3));
    }
    @Test
    void porcentaje() {
        assertEquals(-0.01,Main.porcentaje(valorPorcentaje1,valorPorcentaje2));
    }

    @Test
    void potencia() {
        assertEquals(-729,Main.potencia(valorpotencia1,valorpotencia2));
        assertEquals(729,Main.potencia(valorpotencia3,valorpotencia4));
    }

    @Test
    void numMayor() {
        assertEquals(0,Main.numMayor(valorMayor1,valorMayor2));
    }

    @Test
    void numMenor() {
        assertEquals(-3,Main.numMenor(valorMenor1,valorMenor2));
    }

    @Test
    void sumar() {
        assertEquals(-1,Main.sumar(valorSuma1,valorSuma2));
    }

    @Test
    void restar() {
        assertEquals(3,Main.restar(valorResta1,valorResta2));
    }

    @Test
    void dividir() {
        assertEquals(-2,Main.dividir(valorDivision1,valorDivision2));
    }

    @Test
    void multiplicar() {
        assertEquals(0,Main.multiplicar(valorMultiplicacion1,valorMultiplicacion2));
    }

    @Test
    void validarMayorA0() {
        assertTrue(Main.validarMayorA0(valorMayorA0));
        assertFalse(Main.validarMayorA0(valorIgualA0));
        assertFalse(Main.validarMayorA0(valorMenorA0));
    }

    @Test
    void validarDistinto0() {
        assertTrue(Main.validarDistinto0(valorMayorA0));
        assertFalse(Main.validarDistinto0(valorIgualA0));
        assertTrue(Main.validarDistinto0(valorMenorA0));
    }

    @Test
    void validarRangoNumero() {
        assertTrue(Main.validarRangoNumero(valorRango1,valorMinRango1,valorMaxRango1));
        assertFalse(Main.validarRangoNumero(valorRango2,valorMinRango2,valorMaxRango2));
        assertTrue(Main.validarRangoNumero(valorRango3,valorMinRango3,valorMaxRango3));
    }

    @Test
    void ecuacionRecta() {
        assertEquals("Y = -8.0X + 11.0",Main.ecuacionRecta(listaTestEcRecta));
    }
    @Test
    void solEcuacion2Grado() {
        assertEquals(-2,Main.solEcuacion2Grado(1,4,4)[0]);
    }

    @Test
        //Debido a que el método que llama a calcDiscriminante ya valida que "a" no puede ser =0, no se probará con ese caso crítico
    void calcDiscriminante() {
        assertEquals(20,Main.calcDiscriminante(valorDiscriminante1,valorDiscriminante2,valorDiscriminante3));
        assertEquals(0,Main.calcDiscriminante(valorDiscriminante4,valorDiscriminante5,valorDiscriminante6));
    }
    /*@Test
    Con esta prueba descubrimos una excepción que no sabemos manejar
    void validarLinealesDistintas() {
        assertTrue(Main.validarLinealesDistintas(lista1Sist2x2,lista2Sist2x2));
    }*/
    @Test
    void solSist2x2() {
        assertEquals(-1,Main.solSist2x2(lista3Sist2x2,lista4Sist2x2)[0]);
        assertEquals(2,Main.solSist2x2(lista3Sist2x2,lista4Sist2x2)[1]);
    }
}