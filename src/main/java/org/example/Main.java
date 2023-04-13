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
    public static boolean comprobarCero(double[] lados) {
        boolean comprobar = true;
        for (int i = 0; i < lados.length; i++) {
            if (lados[i] == 0) {
                comprobar = false;
                break;
            }
        } return comprobar;
    }
    public static boolean comprobarTriangulo(double[] lados) {
        double hipotenusa = Math.sqrt(Math.pow(lados[0], 2) + Math.pow(lados[1], 2));
        if (hipotenusa == 0) {
            return false;
        }
        return true;
    }
    public static double perimetroCuadrado(double[] lados){
        return lados[1]*4;
    }
    public static double perimetroRectangulo(double[] lados){
        return lados[0]*2 + lados[1]*2;
    }
    public static double perimetroCirculo(double[] lados){
        return Math.PI*lados[0];
    }
    public static double perimetroEsfera(double[] lados){
        return 2*Math.PI*lados[1];
    }
    public static double perimetroCubo(double[] lados){
        return 12*lados[0];
    }
    public static double perimetroCono(double[]lados){
        double hipotenusa = Math.sqrt(Math.pow(lados[0], 2) + Math.pow(lados[1], 2));
        return 2*Math.PI*lados[0] + hipotenusa;
    }
    public static double areaCuadrado(double lados){
        return Math.pow(lados, 2);
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
        double hipotenusa = Math.sqrt(Math.pow(lados[0], 2) + Math.pow(lados[1], 2));
        return Math.PI*lados[0]*(lados[0]+hipotenusa);
    }
    public static double volumenEsfera(double[] lados){
        return (4/3)*Math.PI*Math.pow(lados[0], 3);
    }
    public static double volumenCubo(double[] lados){
        return Math.pow(lados[0], 3);
    }
    public static double volumenCono(double[] lados){
        return (1/3)*lados[1]*Math.PI*Math.pow(lados[0], 3);
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