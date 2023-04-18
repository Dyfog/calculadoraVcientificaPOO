package org.example;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MainTest {
    double[] datosTest = new double[2];
    double[] datosTest2 = new double[2];
    double[] datosTest3 = new double[2];
    double[] datosTest4 = new double[2];
    @BeforeEach

    void setUp() {
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
}