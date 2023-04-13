package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

    }
    //revisar que b sea mayor o igual a 0
    public static double porcentaje(double a, double b){
        return a*b/100;
    }
    //revisar que a!=0 && b !=0 en simultaneo
    public static double potencia(double a, double b){
        return Math.pow(a,b);
    }
    public static double numMayor(double a, double b){
        if (a>b){
            return a;
        } else {
            return b;
        }
    }
    public static double numMenor(double a, double b){
        if (a<b){
            return 1;
        } else {
            return 2;
        }
    }
    public static double sumar(double a, double b){
        return a+b;
    }
    public static double restar(double numeroBase, double valorResta) {
        return numeroBase-valorResta;
    }
    //revisar que divisor =!0
    public static double dividir(double dividendo, double divisor) {
        return dividendo / divisor;
    }
    public static double multiplicar(double a, double b) {
        return a * b;
    }
    //verificar a=!0
    public static double[] ecuacion2Grado(int a, int b, int c) {
        double discriminante = calcDiscriminante(a,b,c);
        double[] soluciones = new double[0];
        if (discriminante >= 0) {
            if(discriminante == 0){
                soluciones = new double[1];
                soluciones[0] = (-b)/(2 * a);
            }else{
                soluciones = new double[2];
                soluciones[0] = ((-b) + Math.sqrt(calcDiscriminante(a,b,c))) / (2 * a);
                soluciones[1] = ((-b) - Math.sqrt(calcDiscriminante(a,b,c)) / (2 * a));
            }
        }
        return soluciones;
    }
    public static double ingresarSoloNumeroDouble() {
        Scanner in = new Scanner(System.in);
        while (!in.hasNextDouble()) {
            System.out.println("Entrada no válida. Ingrese un número:");
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
    public static boolean validarMayorA0(double numero) {
        if (numero <= 0) {
            System.out.println("Numero ingresado no valido, se requiere de un valor mayor a 0");
            return false;
        }
        return true;
    }
    public static boolean validarDistinto0(double numero){
        if (numero == 0){
            return false;
        }
        return true;
    }
    //a*e!=b*d
    public static double[] sistDosxDos(double[] listaCoeficientes){
        double[] listaSoluciones=new double[2];
        double A=listaCoeficientes[0];
        double B=listaCoeficientes[1];
        double C=listaCoeficientes[2];
        double D=listaCoeficientes[3];
        double E=listaCoeficientes[4];
        double F=listaCoeficientes[5];

        double determinanteSistema = A * E - B * D;
        double determinanteX = C * E - B * F;
        double determinanteY = A * F - C * D;

        listaSoluciones[0] = determinanteX / determinanteSistema;
        listaSoluciones[1] = determinanteY / determinanteSistema;
        return listaSoluciones;
        /*System.out.println("La solución del sistema es:");
        System.out.println("x = " + x);
        System.out.println("y = " + y);*/
    }
    public static String ecuaRecta(double[] listaCoeficientes){
        double X=listaCoeficientes[0];
        double Y=listaCoeficientes[1];
        double x=listaCoeficientes[2];
        double y=listaCoeficientes[3];
        double m = (y - Y) / (x - X);
        double b = Y - m * X;
        String ecuacion= String.valueOf("Y = " + m + "X + " + b);
        //System.out.println("La ecuación de la recta es: Y = " + m + "X + " + b);
        return ecuacion;
    }

    public static double calcDiscriminante(double a, double b, double c){
        return (Math.pow(b,2)-4*a*c);
    }

    public static void opcionesMenuPrincipal(){
        System.out.println("¿Que desea hacer?");
        System.out.println("1.-Operaciones aritmeticas");
        System.out.println("2.-Ecuacion cuadratica");
        System.out.println("3.-Figuras geometricas");
        System.out.println("4.-Sistemas de ecuaciones lineales");
        System.out.println("5.-Ecuacion de la recta");
        System.out.println("6.-Salir");
    }

    public static void menuPrincipal(){
        opcionesMenuPrincipal();
        int eleccion = ingresarSoloNumeroInt();
        switch (eleccion){
            case 1:
                menuAritmeticas();

        }

    }

    public static void opcionesMenuAritmeticas(){
        System.out.println("Dentro de estas operaciones aritmeticas, que desea hacer?");
        System.out.println("1.-Sumar");
        System.out.println("2.-Restar");
        System.out.println("3.-Multiplicar");
        System.out.println("4.-Dividir (ingrese un dividendo distinto de 0)");
        System.out.println("5.-Determinar mayor entre 2 numeros");
        System.out.println("6.-Determinar menor entre 2 numeros");
        System.out.println("7.-Potencia de un numero (ambos números deben ser distintos de 0)");
        System.out.println("8.-Calcular porcentaje de un numero (el porcentaje debe ser un número positivo)");
        System.out.println("9.-Salir");
    }

    public static void menuAritmeticas(){
        opcionesMenuAritmeticas();
        int eleccion=ingresarSoloNumeroInt();
        switch (eleccion){
            case 1:
                double primerValor=ingresarSoloNumeroDouble();
                double segundoValor=ingresarSoloNumeroDouble();
                sumar(primerValor,segundoValor);
        }
    }
}
