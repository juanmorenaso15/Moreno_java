package Taller_7;

import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese un numero: ");
        int numero = scanner.nextInt();
        long factorial = 1;
        for (int i = 1; i <= numero; i++) {
            factorial *= i;
        }
        System.out.println("El factorial de: " + numero + " es " + factorial);
        scanner.close();
    }
}