package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        menuPrincipal();
    }

    public static double[] capturaDatos2D() {
        double[] arr2D = new double[2];
        arr2D[0] = ingresarSoloNumero();
        arr2D[1] = ingresarSoloNumero();
        return arr2D;
    }
    public static double[] capturaDato() {
        double[] arr = new double[1];
        arr[0] = ingresarSoloNumero();
        return arr;
    }
    public static double perimetroCuadrado(double[] lados) {
        return lados[0] * 4;
    }
    public static double perimetroRectangulo(double[] lados) {
        return lados[0] * 2 + lados[1] * 2;
    }
    public static double perimetroCirculo(double[] lados) {
        return Math.PI * lados[0];
    }
    public static double perimetroEsfera(double[] lados) {
        return 2 * Math.PI * lados[0];
    }
    public static double perimetroCubo(double[] lados) {
        return 12 * lados[0];
    }
    public static double perimetroCono(double[] lados) {
        double hipotenusa = Math.sqrt(Math.pow(lados[0], 2) + Math.pow(lados[1], 2));
        return 2 * Math.PI * lados[0] + hipotenusa;
    }
    public static double areaCuadrado(double[] lados) {
        return Math.pow(lados[0], 2);
    }
    public static double areaRectangulo(double[] lados) {
        return lados[0] * lados[1];
    }
    public static double areaCirculo(double[] lados) {
        return Math.PI * Math.pow(lados[0], 2);
    }
    public static double areaEsfera(double[] lados) {
        return 4 * Math.PI * Math.pow(lados[0], 2);
    }
    public static double areaCubo(double[] lados) {
        return 6 * (Math.pow(lados[0], 2));
    }
    public static double areaCono(double[] lados) {
        double hipotenusa = Math.sqrt(Math.pow(lados[0], 2) + Math.pow(lados[1], 2));
        return Math.PI * lados[0] * (lados[0] + hipotenusa);
    }
    public static double volumenEsfera(double[] lados) {
        return (4 * Math.PI * Math.pow(lados[0], 3))/3;
    }
    public static double volumenCubo(double[] lados) {
        return Math.pow(lados[0], 3);
    }
    public static double volumenCono(double[] lados) {
        return (lados[1] * Math.PI * Math.pow(lados[0], 2))/3;
    }
    public static boolean comprobarCero(double[] lados) {
        boolean comprobar = true;
        for (int i = 0; i < lados.length; i++) {
            if (lados[i] == 0) {
                System.out.println("Los lados no pueden ser cero.");
                return false;
            }
        }
        return comprobar;
    }
    public static boolean comprobarMenorCero(double[] lados) {
        boolean comprobar = true;
        for (int i = 0; i < lados.length; i++) {
            if (lados[i] < 0) {
                System.out.println("Los lados no pueden ser menores a cero.");
                return false;
            }
        }
        return comprobar;
    }
    public static boolean comprobarTriangulo(double[] lados) {
        double hipotenusa = Math.sqrt(Math.pow(lados[0], 2) + Math.pow(lados[1], 2));
        if (hipotenusa == 0) {
            return false;
        }
        return true;
    }
    public static boolean validarRangoNumero(int numero, int min, int max) {
        if (numero < min || numero > max) {
            return false;
        }
        return true;
    }
    public static double ingresarSoloNumero() {
        Scanner in = new Scanner(System.in);
        while (!in.hasNextDouble()) {
            System.out.println("Entrada no válida. Ingrese un número: ");
            in.next();
        }
        double numero = in.nextDouble();
        return numero;
    }
    public static int ingresarSoloNumeroInt() {
        Scanner in = new Scanner(System.in);
        while (!in.hasNextInt()) {
            System.out.println("Entrada no válida. Ingrese un número entero:");
            in.next();
        }
        int numero = in.nextInt();
        return numero;
    }
    public static void opcionesMenuPrincipal() {
        System.out.println("¿Que desea hacer?");
        System.out.println("1.-Operaciones aritmeticas");
        System.out.println("2.-Ecuacion cuadratica");
        System.out.println("3.-Figuras geometricas");
        System.out.println("4.-Sistemas de ecuaciones lineales");
        System.out.println("5.-Ecuacion de la recta");
        System.out.println("6.-Salir");
    }
    public static int opcionesMenuFiguras() {
        System.out.println("Qué figura desea calcular?");
        System.out.println("1.-Cuadrado");
        System.out.println("2.-Rectangulo");
        System.out.println("3.-Círculo");
        System.out.println("4.-Esfera");
        System.out.println("5.-Cubo");
        System.out.println("6.-Cono");
        System.out.println("7.-Salir");
        int eleccion = ingresarSoloNumeroInt();
        while (!validarRangoNumero(eleccion, 1, 7)) {
            System.out.println("Ingrese un valor dentro de las opciones: ");
            eleccion = ingresarSoloNumeroInt();
        }
        return eleccion;
    }
    public static int opcionesMenuVolumen() {
        System.out.println("Qué figura desea calcular?");
        System.out.println("1.-Esfera");
        System.out.println("2.-Cubo");
        System.out.println("3.-Cono");
        System.out.println("4.-Salir");
        int eleccion = ingresarSoloNumeroInt();
        while (!validarRangoNumero(eleccion, 1, 4)) {
            System.out.println("Ingrese un valor dentro de las opciones: ");
            eleccion = ingresarSoloNumeroInt();
        }
        return eleccion;
    }
    public static int opcionesMenuOperacion() {
        System.out.println("Qué operación desea realizar?");
        System.out.println("1.-Perímetro");
        System.out.println("2.-Área");
        System.out.println("3.-Volumen");
        System.out.println("4.-Salir");
        int eleccion = ingresarSoloNumeroInt();
        while (!validarRangoNumero(eleccion, 1, 4)) {
            System.out.println("Ingrese un valor dentro de las opciones: ");
            eleccion = ingresarSoloNumeroInt();
        }
        return eleccion;
    }
    public static void menuFiguras() {
        boolean mantenerProgramaActivo = true;
        while (mantenerProgramaActivo) {
        int eleccion2 = opcionesMenuOperacion();
            switch (eleccion2) {
                case 1:
                    int eleccion = opcionesMenuFiguras();
                    switch (eleccion) {
                        case 1:
                            System.out.println("Ingrese el largo del cuadrado: ");
                            double[] lados = capturaDato();
                            if (comprobarCero(lados) && comprobarMenorCero(lados)) {
                                System.out.println("El perimetro del cuadrado es: " + perimetroCuadrado(lados));
                            }
                            break;
                        case 2:
                            System.out.println("Ingrese los lados del rectángulo: ");
                            double[] lados2 = capturaDatos2D();
                            if (comprobarCero(lados2) && comprobarMenorCero(lados2)) {
                                System.out.println("El perimetro del rectángulo es: " + perimetroRectangulo(lados2));
                            }
                            break;
                        case 3:
                            System.out.println("Ingrese el radio del circulo: ");
                            double[] lados3 = capturaDato();
                            if (comprobarCero(lados3) && comprobarMenorCero(lados3)) {
                                System.out.println("El perimetro del circulo es: " + perimetroCirculo(lados3));
                            }
                            break;
                        case 4:
                            System.out.println("Ingrese el radio de la esfera: ");
                            double[] lados4 = capturaDato();
                            if (comprobarCero(lados4) && comprobarMenorCero(lados4)) {
                                System.out.println("El perimetro de la esfera es: " + perimetroEsfera(lados4));
                            }
                            break;
                        case 5:
                            System.out.println("Ingrese el largo del cubo: ");
                            double[] lados5 = capturaDato();
                            if (comprobarCero(lados5) && comprobarMenorCero(lados5)) {
                                System.out.println("El perimetro del cubo es: " + perimetroCubo(lados5));
                            }
                            break;
                        case 6:
                            System.out.println("Ingrese la altura y el radio del cono: ");
                            double[] lados6 = capturaDatos2D();
                            if (comprobarCero(lados6) && comprobarMenorCero(lados6)) {
                                System.out.println("El perimetro del cono es: " + perimetroCono(lados6));
                            }
                            break;
                        default:
                            System.out.println("Saliendo...");
                            break;
                    }
                    break;
                case 2:
                    int eleccion3 = opcionesMenuFiguras();
                    switch (eleccion3) {
                        case 1:
                            System.out.println("Ingrese el largo del cuadrado: ");
                            double[] lados = capturaDato();
                            if (comprobarCero(lados) && comprobarMenorCero(lados)) {
                                System.out.println("El área del cuadrado es: " + areaCuadrado(lados));
                            }
                            break;
                        case 2:
                            System.out.println("Ingrese los lados del rectángulo: ");
                            double[] lados2 = capturaDatos2D();
                            if (comprobarCero(lados2) && comprobarMenorCero(lados2)) {
                                System.out.println("El área del rectángulo es: " + areaRectangulo(lados2));
                            }
                            break;
                        case 3:
                            System.out.println("Ingrese el radio del circulo: ");
                            double[] lados3 = capturaDato();
                            if (comprobarCero(lados3) && comprobarMenorCero(lados3)) {
                                System.out.println("El área del circulo es: " + areaCirculo(lados3));
                            }
                            break;
                        case 4:
                            System.out.println("Ingrese el radio de la esfera: ");
                            double[] lados4 = capturaDato();
                            if (comprobarCero(lados4) && comprobarMenorCero(lados4)) {
                                System.out.println("El área de la esfera es: " + areaEsfera(lados4));
                            }
                            break;
                        case 5:
                            System.out.println("Ingrese el largo del cubo: ");
                            double[] lados5 = capturaDato();
                            if (comprobarCero(lados5) && comprobarMenorCero(lados5)) {
                                System.out.println("El área del cubo es: " + areaCubo(lados5));
                            }
                            break;
                        case 6:
                            System.out.println("Ingrese la altura y el radio del cono: ");
                            double[] lados6 = capturaDatos2D();
                            if (comprobarCero(lados6) && comprobarTriangulo(lados6) && comprobarMenorCero(lados6)) {
                                System.out.println("El área del cono es: " + areaCono(lados6));
                            }
                            break;
                        default:
                            System.out.println("Saliendo...");
                            break;
                    }
                    break;
                case 3:
                    int eleccion4 = opcionesMenuVolumen();
                    switch (eleccion4) {
                        case 1:
                            System.out.println("Ingrese el radio de la esfera: ");
                            double[] lados = capturaDato();
                            if (comprobarCero(lados) && comprobarMenorCero(lados)) {
                                System.out.println("El volumen del esfera es: " + volumenEsfera(lados));
                            }
                            break;
                        case 2:
                            System.out.println("Ingrese el largo del cubo: ");
                            double[] lados2 = capturaDato();
                            if (comprobarCero(lados2) && comprobarMenorCero(lados2)) {
                                System.out.println("El volumen del cubo es: " + volumenCubo(lados2));
                            }
                            break;
                        case 3:
                            System.out.println("Ingrese la altura y el radio del cono: ");
                            double[] lados3 = capturaDatos2D();
                            if (comprobarCero(lados3) && comprobarTriangulo(lados3) && comprobarMenorCero(lados3)) {
                                System.out.println("El volumen del cono es: " + volumenCono(lados3));
                            }
                            break;
                        default:
                            System.out.println("Saliendo...");
                            break;
                    }
                    break;
                case 4:
                    System.out.println("Saliendo...");
                    mantenerProgramaActivo = false;
                    break;
                default:
                    System.out.println("Opción no valida");
                    menuFiguras();
            }
        }

    }
    public static void menuPrincipal() {
        opcionesMenuPrincipal();
        int eleccion = ingresarSoloNumeroInt();
        switch (eleccion) {
            case 3:
                menuFiguras();
                break;
        }
    }
}