package Taller_5;

import java.util.Scanner;

public class Promedio_Notas {
    public static void main(String[] args) {
                Scanner scanner = new Scanner(System.in);
        
        System.out.print("¿Cuántas calificaciones vas a ingresar? ");
        int cantidad = scanner.nextInt();
        
        double[] calificaciones = new double[cantidad];
        
        System.out.println("\nIngresa las calificaciones:");
        for (int i = 0; i < cantidad; i++) {
            System.out.print("Calificación " + (i + 1) + ": ");
            calificaciones[i] = scanner.nextDouble();
        }
        
        double suma = 0;
        double notaMasAlta = calificaciones[0];
        double notaMasBaja = calificaciones[0];
        
        for (int i = 0; i < calificaciones.length; i++) {
            // Sumar para el promedio
            suma = suma + calificaciones[i];
            
            // Buscar nota más alta
            if (calificaciones[i] > notaMasAlta) {
                notaMasAlta = calificaciones[i];
            }
            
            // Buscar nota más baja
            if (calificaciones[i] < notaMasBaja) {
                notaMasBaja = calificaciones[i];
            }
        }
        
        //Calcular promedio
        double promedio = suma / cantidad;
        
        System.out.println("\nRESULTADOS :)");
        System.out.println("Cantidad de calificaciones: " + cantidad);
        System.out.printf("Promedio: %.2f%n", promedio);
        System.out.printf("Nota más alta: %.2f%n", notaMasAlta);
        System.out.printf("Nota más baja: %.2f%n", notaMasBaja);
        //%.2f%n muestra dos decimales.
        scanner.close();
    }
}
