package Taller_7;

import java.util.Scanner;

public class Inverso_Lista {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Cuantos numero quier eingresar: ");
        int cantidad = sc.nextInt();
        int[] numero = new int[cantidad];

        System.out.println("\ningrese los numeros");

        for (int i = 0; i < cantidad; i++) {
            System.out.println("\nNumero: " + (i +1)+": ");
            numero[i]=sc.nextInt();


        }

        System.out.println("\nLista original");
        for (int i = 0; i < cantidad; i++) {
            System.out.println(numero[i] + " ");
        }

        System.out.println("Lista invertida: ");
        for (int i = cantidad -1; i >=0; i--) {
            System.out.println(numero[i]+" ");
        }



        sc.close();
    }
}