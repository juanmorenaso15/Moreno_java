package Talle_4;

import java.util.Scanner;

public class Triangulo_Pascal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Ingrese el número de filas: ");
        int numero = sc.nextInt();

        for (int i = 0; i < numero ; i++) {
            // Espacios para centrar
            for (int j = 0; j < numero - i; j++) {
                System.out.print("  ");
            }

            int valor = 1;
            for (int j = 0; j <= i; j++) {

                if (valor < 10) {
                System.out.print("   "+ valor);
                }else if (valor < 100) {
                    System.out.print("  "+valor);
                }else{
                    System.out.print(" "+valor);
                }

                valor = valor * (i - j) / (j + 1);
            }
            System.out.println();
        }
        sc.close();
    }
}