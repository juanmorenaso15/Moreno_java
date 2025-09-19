package Taller_4;

import java.util.Scanner;

public class Numero_Perfecto {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Ingrese un numero: ");
        int numero = sc.nextInt();
        int suma = 0;

        for (int i = 1; i < numero; i++) {
            if (numero % i == 0) {
                suma += i;
            }
        }

        if (suma == numero) {
            System.out.println(numero + ": Es un numero perfecto.");
        }else{
            System.out.println("No es un numero perfecto");
        }

        sc.close();
    }
}
