package Taller_4;

import java.util.Scanner;
public class Piramide_Asterisco {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingrese la altura de la pirámide: ");
        int altura = sc.nextInt();

        for (int i = 1; i <= altura; i++) {
            // Espacios en blanco
            for (int j = 1; j <= altura - i; j++) {
                System.out.print(" ");
            }
            // Asteriscos
            for (int k = 1; k <= (2 * i - 1); k++) {
                System.out.print("*");
            }
            System.out.println();
        }
        sc.close();
    }

}