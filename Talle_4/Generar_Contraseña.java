package Talle_4;

import java.util.Random;

public class Generar_Contraseña {
    public static void main(String[] args) {
        String caracteres = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789!@#$%^&*";
        Random random = new Random();
        StringBuilder contrasena = new StringBuilder();

        for (int i = 0; i < 8; i++) {
            int index = random.nextInt(caracteres.length());
            contrasena.append(caracteres.charAt(index));
        }

            System.out.println(" Contraseña generada: " + contrasena.toString());
    }
}