package Taller_4;

import java.util.Scanner;

public class Numero_Capicua {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingrese un número: ");
        int numero = sc.nextInt();
        int original = numero;
        int reverso = 0;

        while (numero != 0) {
            int digito = numero % 10;
            reverso = reverso * 10 + digito;
            numero /= 10;
        }

        if (original == reverso) {
            System.out.println(original + " es un número capicúa.");
        } else {
            System.out.println(original + " NO es un número capicúa.");
        }
        sc.close();
    }
}