package com.danieska.app;


import java.util.Scanner;

public class App {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        while (true) {
            // Mostrar el menú principal
            System.out.println("MENU PRINCIPAL");
            System.out.println("1. Convertir números");
            System.out.println("2. Realizar operaciones aritméticas");
            System.out.println("3. Salir");
            System.out.print("Seleccione una opción: ");

            // Leer la opción seleccionada por el usuario
            int opcionPrincipal = scanner.nextInt();

            // Realizar la acción correspondiente según la opción seleccionada
            switch (opcionPrincipal) {
                case 1:
                    menuConvertirNumeros();
                    break;
                case 2:
                    menuOperacionesAritmeticas();
                    break;
                case 3:
                    System.out.println("Saliendo del programa...");
                    return;
                default:
                    System.out.println("Opción inválida");
            }
        }
    }

    // Método para el menú de conversión de números
    public static void menuConvertirNumeros() {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            // Mostrar el menú de conversión de números
            System.out.println("\nCONVERTIR NÚMEROS");
            System.out.println("1. Binario");
            System.out.println("2. Decimal");
            System.out.println("3. Hexadecimal");
            System.out.println("4. Octal");
            System.out.println("5. Volver al menú principal");
            System.out.print("Seleccione una opción: ");

            // Leer la opción seleccionada por el usuario
            int opcionConversion = scanner.nextInt();

            // Realizar la conversión correspondiente según la opción seleccionada
            switch (opcionConversion) {
                case 1:
                    System.out.println("Realizar conversión a binario...");
                    // Llamar a método para convertir a binario
                    String binario = scanner.next();
                    int decimalBinario = Integer.parseInt(binario, 2);
                    System.out.println("El nujmero en decimal es:" + decimalBinario);
                    break;
                case 2:
                    System.out.println("Realizar conversión a decimal...");
                    // Llamar a método para convertir a decimal
                    int decimal = scanner.nextInt();
                    System.out.println("El número en decimal es: " + decimal);
                    break;
                case 3:
                    System.out.println("Realizar conversión a hexadecimal...");
                    // Llamar a método para convertir a hexadecimal
                    String hexadecimal = scanner.next();
                    int decimalHexadecimal = Integer.parseInt(hexadecimal, 16);
                    System.out.println("El número en decimal es: " + decimalHexadecimal);
                    break;
                case 4:
                    System.out.println("Realizar conversión a octal...");
                    // Llamar a método para convertir a octal
                    String octal = scanner.next();
                    int decimalOctal = Integer.parseInt(octal, 8);
                    System.out.println("El número en decimal es: " + decimalOctal);

                    break;
                case 5:
                    return; // Volver al menú principal
                default:
                    System.out.println("Opción inválida");
            }
        }
    }

    // Método para el menú de operaciones aritméticas
    public static void menuOperacionesAritmeticas() {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            // Mostrar el menú de operaciones aritméticas
            System.out.println("\nOPERACIONES ARITMÉTICAS");
            System.out.println("1. Suma");
            System.out.println("2. Resta");
            System.out.println("3. Multiplicación");
            System.out.println("4. División");
            System.out.println("5. Volver al menú principal");
            System.out.print("Seleccione una opción: ");

            // Leer la opción seleccionada por el usuario
            int opcionOperacion = scanner.nextInt();

            // Realizar la operación correspondiente según la opción seleccionada
            switch (opcionOperacion) {
                case 1:
                    System.out.println("Ingrese numero: ");
                    int binario1 = scanner.nextInt();
                    System.out.println("Ingrese numero: ");
                    int binario2 = scanner.nextInt();

                    int suma = binario1 + binario2;
                    System.out.println("La suma es: " );
                    // Llamar a método para realizar suma
                    break;
                case 2:
                    System.out.println("Ingrese numero: ");
                    int num1 = scanner.nextInt();
                    System.out.println("Ingrese numero: ");
                    int num2 = scanner.nextInt();
                    System.out.println("La resta es: ");
                    int resta = num1 - num2;
                    // Llamar a método para realizar resta
                    break;
                case 3:
                    System.out.println("Ingrese numero: ");
                    int numero1 = scanner.nextInt();
                    System.out.println("Ingrese numero: ");
                    int numero2 = scanner.nextInt();
                    System.out.println("La multiplicacion es: ");
                    int multiplicacion = numero1 * numero2;

                    // Llamar a método para realizar multiplicación
                    break;
                case 4:
                    System.out.println("Ingrese numero: ");
                    int nume1 = scanner.nextInt();
                    System.out.println("Ingrese numero: ");
                    int nume2 = scanner.nextInt();
                    System.out.println("La division es: ");
                    int divicion = nume1 / nume2;
                    // Llamar a método para realizar división
                    break;
                case 5:
                    return; // Volver al menú principal
                default:
                    System.out.println("Opción inválida");
            }

        }

    }
}