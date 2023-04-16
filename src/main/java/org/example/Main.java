package org.example;

import javax.management.StringValueExp;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        menuPrincipal();
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
    public static double dividir(double dividendo, double divisor) {
        return dividendo / divisor;
    }
    public static double multiplicar(double a, double b) {
        return a * b;
    }
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
    public static boolean validarRangoNumero(int numero, int min, int max) {
        if (numero < min || numero > max) {
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
    public static String ecuacionRecta(double[] listaCoordenadas){
        String ecuacion = "";
        double X=listaCoordenadas[0];
        double Y=listaCoordenadas[1];
        double x=listaCoordenadas[2];
        double y=listaCoordenadas[3];
        double m = (y - Y) / (x - X);
        double b = Y - m * X;
        if (!validarDistinto0(m)){
            ecuacion = String.valueOf("Y = " + b);
        }else {
            ecuacion = String.valueOf("Y = " + m + "X + " + b);
        }
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
                break;
            case 5:
                ejecucuionEcuacionDeLaRecta();
                break;
        }
    }

    public static void ejecucuionEcuacionDeLaRecta(){
        double[] arregloCoordenadas = new double [4];
        System.out.println("El orden de ingrese de las coordenadas es: 1era X, 1era Y, 2da X, 2da Y");
        for (int i = 0 ; i < arregloCoordenadas.length ; i++){
            System.out.println("Ingrese un valor para la coordenada " + (i+1));
            arregloCoordenadas[i]=ingresarSoloNumeroDouble();
        }
        while (restar(arregloCoordenadas[0],arregloCoordenadas[2])==0){
            System.out.println("La resta entre las X no puede ser 0, ingrese nuevamente una segunda X con la que no ocurra esto:");
            arregloCoordenadas[2]=ingresarSoloNumeroDouble();
        }
        System.out.println("La ecuacion de la recta es: " + ecuacionRecta(arregloCoordenadas));
    }

    public static int opcionesMenuAritmeticas(){
        System.out.println("Dentro de estas operaciones aritmeticas, que desea hacer?");
        System.out.println("1.-Sumar");
        System.out.println("2.-Restar");
        System.out.println("3.-Multiplicar");
        System.out.println("4.-Dividir (ingrese un divisor distinto de 0)");
        System.out.println("5.-Determinar mayor entre 2 numeros");
        System.out.println("6.-Determinar menor entre 2 numeros");
        System.out.println("7.-Potencia de un numero (ambos números deben ser distintos de 0)");
        System.out.println("8.-Calcular porcentaje de un numero (el porcentaje debe ser un número positivo)");
        System.out.println("9.-Salir");
        int eleccion = ingresarSoloNumeroInt();
        while (!validarRangoNumero(eleccion,1,9)){
            System.out.println("Ingrese un valor dentro de las opciones: ");
            eleccion = ingresarSoloNumeroInt();
        }
        return eleccion;
    }

    public static void menuAritmeticas(){
        int eleccion = opcionesMenuAritmeticas();
        switch (eleccion){
            case 1:
                System.out.println("ingrese su primer valor");
                double primerValorSuma=ingresarSoloNumeroDouble();
                System.out.println("ingrese el 2do valor");
                double segundoValorSuma=ingresarSoloNumeroDouble();
                System.out.println("la suma de de sus numeros es: " + sumar(primerValorSuma,segundoValorSuma));
                break;
            case 2:
                System.out.println("ingrese su numero base");
                double primerValorResta=ingresarSoloNumeroDouble();
                System.out.println("ingrese el valor que restará al primero");
                double segundoValorResta=ingresarSoloNumeroDouble();
                System.out.println("la resta de sus numeros es: "+restar(primerValorResta,segundoValorResta));
                break;
            case 3:
                System.out.println("ingrese el primer factor");
                double primerValorMultiplicacion = ingresarSoloNumeroDouble();
                System.out.println("ingrese el segundo factor");
                double segundoValorMultiplicacion = ingresarSoloNumeroDouble();
                System.out.println("la multiplicacion de ambos números es: " + multiplicar(primerValorMultiplicacion,segundoValorMultiplicacion));
                break;
            case 4:
                System.out.println("ingrese el dividendo");
                double primerValorDivision = ingresarSoloNumeroDouble();
                System.out.println("ingrese el divisor");
                double segundoValorDivision = ingresarSoloNumeroDouble();
                while (!validarDistinto0(segundoValorDivision)){
                    System.out.println("El divisor debe ser distinto de 0, ingréselo nuevamente");
                    segundoValorDivision = ingresarSoloNumeroDouble();
                }
                System.out.println("La división de los números es: " + dividir(primerValorDivision,segundoValorDivision));
                break;
            case 5:
                System.out.println("ingrese el primer número: ");
                double primerValorMayor = ingresarSoloNumeroDouble();
                System.out.println("ingrese el segundo número a comparar: ");
                double segundoValorMayor = ingresarSoloNumeroDouble();
                System.out.println("El número mayor de entre los dos ingresados es: " + numMayor(primerValorMayor,segundoValorMayor));
                break;
            case 6:
                System.out.println("ingrese el primer número: ");
                double primerValorMenor = ingresarSoloNumeroDouble();
                System.out.println("ingrese el segundo número a comparar: ");
                double segundoValorMenor = ingresarSoloNumeroDouble();
                System.out.println("El número menor de entre los dos ingresados es: " + numMenor(primerValorMenor,segundoValorMenor));
                break;
            case 7:
                System.out.println("ingrese el número base: ");
                double base = ingresarSoloNumeroDouble();
                System.out.println("ingrese el exponente: ");
                double exponente = ingresarSoloNumeroDouble();
                while (!validarDistinto0(exponente) && (!validarDistinto0(base))){
                    System.out.println("La base y el exponente no pueden ser 0 al mismo tiempo, ingrese otro exponente: ");
                    exponente = ingresarSoloNumeroDouble();
                }
                System.out.println("La potencia da como resultado: " + potencia(base,exponente));
                break;
            case 8:
                System.out.println("Ingrese el número del que se obtendrá el porcentaje: ");
                double numeroPorcentaje = ingresarSoloNumeroDouble();
                while (!validarDistinto0(numeroPorcentaje)){
                    System.out.println("El número ingresado debe ser distinto de cero, ingreselo nuevamente: ");
                    numeroPorcentaje = ingresarSoloNumeroDouble();
                }
                System.out.println("Ingrese el porcentaje: ");
                double porcentaje = ingresarSoloNumeroDouble();
                while (!validarMayorA0(porcentaje)){
                    System.out.println("El porcentaje debe ser mayor a 0, ingreselo nuevamente: ");
                    porcentaje = ingresarSoloNumeroDouble();
                }
                System.out.println("El porcentaje obtenido es: " + porcentaje(numeroPorcentaje,porcentaje));
                break;
            case 9:
                System.out.println("Saliendo...");
                break;
        }
    }
}
