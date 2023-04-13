package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
    }

    public static double[] capturaDatos2D(){
        double[] arr2D = new double[2];
        System.out.println("Ingrese el primer dato: ");
        arr2D[0] = ingresarSoloNumero();
        System.out.println("Ingrese el segundo dato: ");
        arr2D[1] = ingresarSoloNumero();
        return arr2D;
    }
    public static double[] capturaDatos3D(){
        double[] arr3D = new double[3];
        System.out.println("Ingrese el primer dato: ");
        arr3D[0] = ingresarSoloNumero();
        System.out.println("Ingrese el segundo dato: ");
        arr3D[1] = ingresarSoloNumero();
        System.out.println("Ingrese el tercer dato: ");
        arr3D[2] = ingresarSoloNumero();
        return arr3D;
    }
    public static boolean comprobarTriangulo(double[] lados) {
        if (lados[0] == 0 || lados[1] == 0 || lados[2] == 0) {
            return false;
        }
        return true;
    }
    public static double perimetroCuadrado(double[] lado){
        return lado[1]*4;
    }
    public static double perimetroRectangulo(double[] lados){
        return lados[0]*2 + lados[1]*2;
    }
    public static double perimetroCirculo(double[] lado){
        return Math.PI*lado[0];
    }
    public static double perimetroEsfera(double[] lados){
        return 2*Math.PI*lados[1];
    }
    public static double perimetroCubo(double[] lado){
        return 12*lado[0];
    }
    public static double perimetroCono(double[]lados){
        return ;
    }
    public static double areaCuadrado(double lado1){
        return Math.pow(lado1, 2);
    }
    public static double areaRectangulo(double[] lados){
        return lados[0]*lados[1];
    }
    public static double areaCirculo(double[] lados){
        return Math.PI*Math.pow(lados[0], 2);
    }
    public static double areaEsfera(double[]lados){
        return 4*Math.PI*Math.pow(lados[0], 2);
    }
    public static double areaCubo(double[] lados){
        return 6*(Math.pow(lados[0], 2));
    }
    public static double areaCono(double[] lados){

    }
    public static double volumenEsfera(double[] lados){

    }
    public static double volumenCubo(double[] lados){
        return Math.pow(lados[0], 3);
    }
    public static double volumenCono(double[] lados){

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
}