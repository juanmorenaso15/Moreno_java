package Talle_4;

import java.util.Scanner;

public class Conversion_binario {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingrese un número entero positivo: ");
        int numero = sc.nextInt();

        if (numero < 0) {
            System.out.println("El número debe ser positivo.");
        } else {
            String binario = "";

            if (numero == 0) {
                binario = "0";
            } else {
                while (numero > 0) {
                    binario = (numero % 2) + binario;
                    numero /= 2;
                }
            }

            System.out.println("El número en binario es: " + binario);
        }
        sc.close();
    }
}