package Taller_6;

import java.util.ArrayList;
import java.util.Scanner;

public class Contador_Numeros {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Ingrese la cantidad de numeros: ");
        int cantidad = sc.nextInt();

        int[] numeros = new int[cantidad];
        int contadorPositivos = 0;
        ArrayList < Integer > guardarPositivo = new ArrayList < > ();
        ArrayList < Integer > guardarNegativos = new ArrayList < > ();
        ArrayList < Integer > guardarCeros = new ArrayList < > ();
        int contadorNegativos = 0;
        int contadorCeros = 0;

        for (int i = 0; i < cantidad; i++) {
            System.out.println("Ingrese el " + (i + 1) + ": ");
            numeros[i] = sc.nextInt();

            if (numeros[i] > 0) {

                guardarPositivo.add(numeros[i]);

                contadorPositivos++;

            } else if (numeros[i] < 0) {

                guardarNegativos.add(numeros[i]);
                contadorNegativos++;

            } else if (numeros[i] == 0) {
                guardarCeros.add(numeros[i]);
                contadorCeros++;
            }
        }
        System.out.println("Numeros Positivos: " + contadorPositivos + ": " + " " + guardarPositivo);
        System.out.println("Numeros Negativos: " + contadorNegativos + ": " + " " + guardarNegativos);
        System.out.println("Numeros Ceros: " + contadorCeros + ": " + " " + guardarCeros);


        sc.close();

    }


}