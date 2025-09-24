package Taller_6;

import java.util.Scanner;

public class invertir_Texto {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Ingrese la frase: ");
        String frase = sc.nextLine();
        System.out.println("La frase es: "+frase);

        String[] palabra = frase.split(" ");

        String resultado = "";

        for (int i = 0; i < palabra.length; i++) {
            String palabraOriginal= palabra[i];
            String palabraInvertida = "";

            for (int j = palabraOriginal.length() -1; j >= 0; j--) {

                palabraInvertida += palabraOriginal.charAt(j);
            }

            resultado += palabraInvertida;  

            if (i < palabra.length-1) {
                resultado+= " ";
            }

        }

        System.out.println("\n La palabra invertidas es: "+ resultado);



        sc.close();
    }
}