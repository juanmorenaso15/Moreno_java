package Taller_4;

import java.util.Scanner;

public class Analisis_Texto {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingrese una frase: ");
        String frase = sc.nextLine();
        
        int letras = 0;
        int espacios = 0;
        int palabras = 1; // Iniciamos en 1 porque hay una palabra más que espacios
        
        for (int i = 0; i < frase.length(); i++) {
            char c = frase.charAt(i);
            if (Character.isLetter(c)) {
                letras++;
            } else if (c == ' ') {
                espacios++;
                palabras++;
            }
        }
        
        System.out.println("Cantidad de letras: " + letras);
        System.out.println("Cantidad de espacios: " + espacios);
        System.out.println("Cantidad de palabras: " + palabras);
        sc.close();
    }
}
