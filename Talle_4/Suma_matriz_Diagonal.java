package Talle_4;

import java.util.Scanner;

public class Suma_matriz_Diagonal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][] matriz = new int[3][3];

        System.out.println("Ingrese los elementos de la matriz 3x3:");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print("Elemento [" + i + "][" + j + "]: ");
                matriz[i][j] = sc.nextInt();
            }
        }

        int diagonalPrincipal = 0;
        int diagonalSecundaria = 0;

        for (int i = 0; i < 3; i++) {
            diagonalPrincipal += matriz[i][i];
            diagonalSecundaria += matriz[i][2 - i];
        }

        System.out.println("Suma diagonal principal: " + diagonalPrincipal);
        System.out.println("Suma diagonal secundaria: " + diagonalSecundaria);
        sc.close();
    }

    // 5. Triángulo de Pascal (primeras n filas)
    public static void trianguloPascal() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingrese el número de filas: ");
        int n = sc.nextInt();

        for (int i = 0; i < n; i++) {
            // Espacios para centrar
            for (int j = 0; j < n - i; j++) {
                System.out.print(" ");
            }

            int valor = 1;
            for (int j = 0; j <= i; j++) {
                System.out.print(valor + " ");
                valor = valor * (i - j) / (j + 1);
            }
            System.out.println();
        }
        sc.close();
    }
}