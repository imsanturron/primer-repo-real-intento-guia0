package com.company;

import java.io.PrintStream;
import java.util.Scanner;
import java.util.Random;
import java.util.ArrayList;

public class Main {
    //Scanner scannn = new Scanner(System.in);

    public static void main(String[] args) {
        int menu = 99;
        int menuint;
        Scanner menuScanner = new Scanner(System.in);

        while (menu != 0) {
            System.out.println("ingrese seccion de la guia a resolver, o 0 si desea salir" +
                    "(1:introduccion 2:arreglos/listas 3:cadenas 4:recursividad)...");
            menuint = 99;
            menu = menuScanner.nextInt();
            switch (menu) {
                case 0:
                    System.out.println("ejecucion finalizada.");
                    break;
                case 1:
                    while (menuint != 0) {
                        System.out.println("ingrese el ejercicio a resolver, o 0 si desea salir:");
                        menuint = menuScanner.nextInt();
                        switch (menuint) {
                            case 0:
                                System.out.println("saliendo de la guia 1...");
                                break;
                            case 1:
                                System.out.println("ejercicio 1:");
                                haciendoElEjercicio1guiaIntro();
                                break;
                            case 2:
                                System.out.println("ejercicio 2:");
                                haciendoElEjercicio2guiaIntro();
                                break;
                            case 3:
                                System.out.println("ejercicio 3:");
                                haciendoElEjercicio3guiaIntro();
                                break;
                            case 4:
                                System.out.println("ejercicio 4:");
                                haciendoElEjercicio4guiaIntro();
                                break;
                            case 5:
                                System.out.println("ejercicio 5:");
                                haciendoElEjercicio5guiaIntro();
                                break;
                            case 6:
                                System.out.println("ejercicio 6:");
                                haciendoElEjercicio6guiaIntro();
                                break;
                            case 7:
                                System.out.println("ejercicio 7:");
                                haciendoElEjercicio7guiaIntro();
                                break;
                            case 8:
                                System.out.println("ejercicio 8:");
                                haciendoElEjercicio8guiaIntro();
                                break;
                            case 9:
                                System.out.println("ejercicio 9:");
                                haciendoElEjercicio9guiaIntro();
                                break;
                            case 10:
                                System.out.println("ejercicio 10:");
                                haciendoElEjercicio10guiaIntro();
                                break;
                            case 11:
                                System.out.println("ejercicio 11:");
                                haciendoElEjercicio11guiaIntro();
                                break;
                            case 12:
                                System.out.println("ejercicio 12:");
                                haciendoElEjercicio12guiaIntro();
                                break;
                            case 13:
                                System.out.println("ejercicio 13:");
                                haciendoElEjercicio13guiaIntro();
                                break;
                            case 14:
                                System.out.println("ejercicio 14:");
                                haciendoElEjercicio14guiaIntro();
                                break;
                            case 15:
                                System.out.println("ejercicio 15:");
                                haciendoElEjercicio15guiaIntro();
                                break;
                            case 16:
                                System.out.println("ejercicio 16:");
                                haciendoElEjercicio16guiaIntro();
                                break;
                            case 17:
                                System.out.println("ejercicio 17:");
                                haciendoElEjercicio17guiaIntro();
                                break;
                            case 18:
                                System.out.println("ejercicio 18:");
                                haciendoElEjercicio18guiaIntro();
                                break;
                            case 19:
                                System.out.println("ejercicio pruebas:");
                                haciendoPruebasguiaIntro();
                                break;
                            default:
                                System.out.println("ejercicio no valido!");
                                break;
                        }
                    }
                case 2:
                    while (menuint != 0) {
                        System.out.println("ingrese el ejercicio a resolver, o 0 si desea salir:");
                        menuint = menuScanner.nextInt();
                        switch (menuint) {
                            case 0:
                                System.out.println("saliendo de la guia 2...");
                                break;
                            case 1:
                                System.out.println("ejercicio 1:");
                                haciendoElEjercicio1guiaArlist();
                                break;
                            case 2:
                                System.out.println("ejercicio 2:");
                                haciendoElEjercicio2guiaArlist();
                                break;
                            case 3:
                                System.out.println("ejercicio 3:");
                                haciendoElEjercicio3guiaArlist();
                                break;
                            case 4:
                                System.out.println("ejercicio 4:");
                                haciendoElEjercicio4guiaArlist();
                                break;
                            case 5:
                                System.out.println("ejercicio 5:");
                                haciendoElEjercicio5guiaArlist();
                                break;
                            case 6:
                                System.out.println("ejercicio 6:");
                                haciendoElEjercicio6guiaArlist();
                                break;
                            case 7:
                                System.out.println("ejercicio 7:");
                                haciendoElEjercicio7guiaArlist();
                                break;
                            case 8:
                                System.out.println("ejercicio 8:");
                                haciendoElEjercicio8guiaArlist();
                                break;
                            case 9:
                                System.out.println("ejercicio 9:");
                                haciendoElEjercicio9guiaArlist();
                                break;
                            case 10:
                                System.out.println("ejercicio 10:");
                                haciendoElEjercicio10guiaArlist();
                                break;
                            case 11:
                                System.out.println("ejercicio 11:");
                                haciendoElEjercicio11guiaArlist();
                                break;
                            default:
                                System.out.println("ejercicio invalido!");
                                break;
                        }
                    }
                case 3:
                    while (menuint != 0) {
                        System.out.println("ingrese el ejercicio a resolver, o 0 si desea salir:");
                        menuint = menuScanner.nextInt();
                        switch (menuint) {
                            case 0:
                                System.out.println("saliendo de la guia 3...");
                                break;
                            case 1:
                                System.out.println("ejercicio 1:");
                                haciendoElEjercicio1guiaCadenas();
                                break;
                            case 2:
                                System.out.println("ejercicio 2:");
                                haciendoElEjercicio2guiaCadenas();
                                break;
                            case 3:
                                System.out.println("ejercicio 3:");
                                haciendoElEjercicio3guiaCadenas();
                                break;
                            case 4:
                                System.out.println("ejercicio 4:");
                                haciendoElEjercicio4guiaCadenas();
                                break;
                            default:
                                System.out.println("ejercicio invalido!");
                                break;
                        }
                    }
                case 4:
                    while (menuint != 0) {
                        System.out.println("ingrese el ejercicio a resolver, o 0 si desea salir:");
                        menuint = menuScanner.nextInt();
                        switch (menuint) {
                            case 0:
                                System.out.println("saliendo de la guia 4...");
                                break;

                            default:
                                System.out.println("parte de la guia inexistente");
                                break;
                        }
                    }
            }
        }
        menuScanner.close();
    }

    private static void haciendoElEjercicio1guiaIntro() {
        int N = 5;
        double A = 2.33;
        char C = 'a';

        System.out.println((String.format("N:%s / A:%s / C:%s", N, A, C)));
        System.out.println(String.format("N+A: %s", N + A));
        System.out.println(String.format("A-N: %s", A - N));
        System.out.println(String.format("C: %s", Integer.valueOf(C)));
        System.out.println("--ahora sin string format--");
        System.out.printf("N: %i / A: %d / C: %c", N, A, C);
        System.out.printf("N+A: %d", N + A);
        System.out.printf("A-N: %d", A - N);
    }

    private static void haciendoElEjercicio2guiaIntro() {
        int X = 10;
        int Y = 2;
        double N = 3.33;
        double M = 0.5;
        System.out.println(String.format("X + Y: %s", X + Y));
        System.out.println(String.format("X/N: %s", X / N));
        System.out.println(String.format("Y*M+X: %s", Y * M + X));
    }

    private static void haciendoElEjercicio3guiaIntro() {
        int n = 5;
        n = (n + 77 - 3) * 2;
        System.out.println(n);
    }

    private static void haciendoElEjercicio4guiaIntro() {
        int A = 3;
        int B = 7;
        int C = 12;
        int D = 21;
        B = C;
        C = A;
        A = D;
        D = B;
        System.out.println(String.format("A:%s / B:%s / C:%s / D:%s", A, B, C, D));
    }

    private static void haciendoElEjercicio5guiaIntro() {
        int a = 7;
        if (a % 2 == 0)
            System.out.println("la variable 'a' es par");
        else
            System.out.println("la variable 'a' es impar");
    }

    private static void haciendoElEjercicio6guiaIntro() {
        int B = 3;
        if (B > 0)
            System.out.println("la variable es mayor a 0");
        else if (B < 0)
            System.out.println("la variable es menor a 0");
        else
            System.out.println("el valor es neutro");
    }

    private static void haciendoElEjercicio7guiaIntro() {
        int C = 4;

        if (C > 0) {
            System.out.println("la variable es mayor a 0");
            if (C > 100)
                System.out.println("la variable es mayor a 100");
            else if (C < 100)
                System.out.println("la variable es menor a 100");
            else
                System.out.println("la variable es 100");
        } else if (C < 0)
            System.out.println("la variable es menor a 0");
        else
            System.out.println("el valor es neutro");

        if (C % 2 == 0)
            System.out.println("la variable es par");
        else
            System.out.println("la variable es impar");

        if (C % 5 == 0)
            System.out.println("la variable es multiplo de 5");
        else
            System.out.println("la variable no es multiplo de 5");

        if (C % 10 == 0)
            System.out.println("la variable es multiplo de 10");
        else
            System.out.println("la variable no es multiplo de 10");
    }

    private static void haciendoElEjercicio8guiaIntro() {
        String nombre;
        Scanner scanstr = new Scanner(System.in);
        System.out.println("ingrese el nombre que desee:");
        nombre = scanstr.nextLine();
        System.out.println(nombre);
    }

    private static void haciendoElEjercicio9guiaIntro() {
        int a;
        Scanner scanent = new Scanner(System.in);
        System.out.println("ingrese un entero:");
        a = scanent.nextInt();
        /// de esta forma si, de otra?
        System.out.println(a);
        System.out.println("doble de la variable: " + (a * 2));
        System.out.println("triple de la variable: " + (a * 3));
    }

    private static void haciendoElEjercicio10guiaIntro() {
        double fahr, celsius;
        Scanner scanfahr = new Scanner(System.in);
        System.out.println("ingrese grados fahrenheit:");
        fahr = scanfahr.nextDouble();
        celsius = (fahr - 32) / 1.8;
        System.out.println("fahrenheit:" + fahr);
        System.out.println("celsius:" + celsius);
    }

    private static void haciendoElEjercicio11guiaIntro() {
        double radio, area, longitud;
        Scanner scanradio = new Scanner(System.in);
        System.out.println("ingrese radio de la circunferencia:");
        radio = scanradio.nextDouble();
        area = Math.PI * (radio * radio);
        longitud = (2 * (Math.PI)) * radio;
    }

    private static void haciendoElEjercicio12guiaIntro() {
        double velocidad;
        Scanner scanvel = new Scanner(System.in);
        System.out.println("ingrese velocidad en km/h:");
        velocidad = scanvel.nextDouble();
        System.out.print("velocidad en km/h:" + velocidad);
        velocidad = velocidad * 1000 / 3600;
        System.out.println("  //  velocidad en m/s: " + velocidad);

    }

    private static void haciendoElEjercicio13guiaIntro() {
        double cat1, cat2, hipotenusa;
        Scanner scancat = new Scanner(System.in);
        System.out.println("ingrese long del cateto1:");
        cat1 = scancat.nextDouble();
        System.out.println("ingrese long del cateto2:");
        cat2 = scancat.nextDouble();
        hipotenusa = Math.sqrt((cat1 * cat1) + (cat2 * cat2));
        System.out.println("longitud de hipotenusa:" + hipotenusa);
    }

    private static void haciendoElEjercicio14guiaIntro() {
        double volumen = 5;
        int rad = 2;
        volumen = 4 / 3 * Math.PI * (rad * rad * rad);
        System.out.println("el volumen es " + volumen);
    }

    private static void haciendoElEjercicio15guiaIntro() {
        // Scanner.reset(); ///para que
        Scanner Scanner = new Scanner(System.in);

        System.out.println("Ingrese el 1er lado: ");
        double l1 = Scanner.nextDouble(); ///yo hago un paso mas en todos lados

        System.out.println("Ingrese el 2do lado: ");
        double l2 = Scanner.nextDouble();

        System.out.println("Ingrese el 3er lado: ");///hacer reset en medio
        double l3 = Scanner.nextDouble();

        double P = (l1 + l2 + l3) / 2;
        double A = Math.sqrt((P * (P - l1) * (P - l2) * (P - l3)));

        System.out.println("El area del triangulo es: " + A + ".");
    }

    private static void haciendoElEjercicio16guiaIntro() {
        Scanner scanint = new Scanner(System.in);
        System.out.println("ingrese  numero de 3 digitos");
        int n = scanint.nextInt();

        String number = String.valueOf(n);
        char[] digits = number.toCharArray();
        System.out.println(digits[0] + " " + digits[1] + " " + digits[2]);
    }

    private static void haciendoElEjercicio17guiaIntro() {
        Scanner scanint = new Scanner(System.in);
        System.out.println("ingrese  numero de 5 digitos");
        int n = scanint.nextInt();
        String number = String.valueOf(n);
        char[] digits = number.toCharArray();
        for (int i = 0; i < 5; i += 2) {/////////////////que pasa
            System.out.println(digits[i]);
        }
    }

    private static void haciendoElEjercicio18guiaIntro() {
        int H, M, S;
        Scanner scanint = new Scanner(System.in);
        System.out.println("ingrese  hora/s");
        H = scanint.nextInt();

        System.out.println("ingrese  minuto/s");
        M = scanint.nextInt();

        System.out.println("ingrese segundo/s");
        S = scanint.nextInt();

        if ((0 <= H && H < 24) && (0 <= M && M < 60) && (0 <= S && S < 60))
            System.out.println("hora valida");
        else
            System.out.println("error! hora invalida");
    }

    private static void haciendoPruebasguiaIntro() {
        int j = 4;
        Integer o = 5;
        String pp;
        pp = "jamon";

        System.out.println(j);
        System.out.println(o.byteValue());
        System.out.println(o.compareTo(5));
        System.out.println(o.toString());
        System.out.println(o.floatValue());
        System.out.println(o.getClass());
        System.out.println(pp);
        System.out.println(pp.compareTo("zzzzzzzz"));
        System.out.println(pp.indexOf(9));
    }

    private static void haciendoElEjercicio1guiaArlist() {
        int mes;
        String[] nombre = {"enero", "febrero", "marzo", "abril", "mayo", "junio", "julio"
                , "agosto", "septiembre,", "octubre", "noviembre", "diciembre"};
        int[] cant = {30, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        Scanner scan = new Scanner(System.in);
        System.out.println("ingrese n° de mes:");
        mes = scan.nextInt();
        if (mes >= 0 && mes < 13) {
            System.out.println(nombre[(mes - 1)]);
            System.out.println(cant[(mes - 1)]);
        } else
            System.out.println("mes invalido!");
    }

    private static void haciendoElEjercicio2guiaArlist() {
        int i = 0;
        while (i <= 100) {
            System.out.print(i + ",");
            i++;
        }
    }

    private static void haciendoElEjercicio3guiaArlist() {
        int i = 0;
        do {
            System.out.print(i + ",");
        } while (i < 100);

    }

    private static void haciendoElEjercicio4guiaArlist() {
        int[] arr = new int[101];///googlear para inicialziar fill   Arrays.fill(array, 30);
        for (int i = 0; i < 101; i++)
            arr[i] = i + 2;

        for (int i = 0; i < 101; i++)
            System.out.print(arr[i]);

        System.out.println("\n");

        for (int i : arr) ///preg
            System.out.print(i);
    }

    private static void haciendoElEjercicio5guiaArlist() {
        Random rand = new Random();
        int posit = 0, negati = 0, ceros = 0;
        int[] arr = new int[10];
        for (int i = 0; i < 10; i++)
            arr[i] = rand.nextInt();

        for (int i = 0; i < 10; i++) {
            System.out.print(arr[i]);
            System.out.print(",");
        }
        for (int i = 0; i < 10; i++) {
            if (arr[i] > 0)
                posit++;
            else if (arr[i] < 0)
                negati++;
            else
                ceros++;
        }
        System.out.println("\npositivos:" + posit + " negativos:" + negati + " ceros:" + ceros);
    }

    private static void haciendoElEjercicio6guiaArlist() {
        int[] arr = new int[15];
        Random rand = new Random();
        for (int i = 0; i < 10; i++)
            arr[i] = rand.nextInt();
    }

    private static void haciendoElEjercicio7guiaArlist() {
        int[] arr = new int[10];
        for (int i = 0; i < 20; i++) {
            if ((i % 2) == 0)
                arr[i] = i;
        }
        for (int i = 0; i < 13; i++)
            System.out.println(arr[i]);///rotoooooooooooooooo
    }

    private static void haciendoElEjercicio8guiaArlist() {
        Scanner scanalt = new Scanner(System.in);
        int cont = 0;
        double altura = 0;
        do {
            System.out.println("ingrese altura estudiante:");
            altura += scanalt.nextDouble();
            cont++;
        } while (cont < 4);
        System.out.println("el promedio de altura es " + (altura / cont));
    }

    private static void haciendoElEjercicio9guiaArlist() {
        Scanner scannum = new Scanner(System.in);
        double[] arrnums = new double[20];
        int cont = 0;
        int mayorigual = 0, menor = 0;
        double total = 0;

        do {
            System.out.println("ingrese un numero al arreglo:");
            arrnums[cont] = scannum.nextDouble();
            cont++;
        } while ((cont < 20) || (arrnums[cont - 1] != -99)); ////malllllllllllllllllllllllllllllllllllllllll

        for (int i = 0; i < cont; i++) {
            total += arrnums[i];
        }
        System.out.print("suma total:" + total + "media:" + (total / cont));

        for (int i = 0; i < cont; i++) {
            if (arrnums[i] >= (total / cont))
                mayorigual++;
            else
                menor++;
        }
        System.out.println(" numeros mayores a la media:" + mayorigual + " menores:" + menor);

    }

    private static void haciendoElEjercicio10guiaArlist() {
        ArrayList<String> cars = new ArrayList<String>();
        cars.add("Volvo");
        cars.add("BMW");
        cars.add("Ford");
        cars.add("Mazda");
        System.out.println(cars);
        cars.set(0, "Opel");
        System.out.println(cars.get(0));
        cars.remove(0);
        System.out.println(cars);
        System.out.println(cars.size());
        cars.clear();
        System.out.println(cars);
    }

    private static void haciendoElEjercicio11guiaArlist() {
        ArrayList<String> cars = new ArrayList<String>();
        cars.add("Volvo");
        cars.add("BMW");
        cars.add("Ford");
        cars.add("Fordeeeee");
        cars.add("Mazda");
        String mayor = cars.get(0);
        for (int i = 1; i < cars.size(); i++) {
            if (cars.get(i).compareTo(mayor) > 0)
                mayor = cars.get(i);
        }
        System.out.println("el mayor es (compara de izq a der): " + mayor);
    }

    public static void haciendoElEjercicio1guiaCadenas() {
        String frase = "habia una vex un ciempies";
        //myStr
    }

    public static void haciendoElEjercicio2guiaCadenas() {

    }

    public static void haciendoElEjercicio3guiaCadenas() {

    }

    public static void haciendoElEjercicio4guiaCadenas() {

    }
}