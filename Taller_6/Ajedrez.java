package Taller_6;

import java.util.Scanner;

public class Ajedrez {

    static int n;
    static int[] tablero;
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Ingresa el tamaño del tablero (N): ");
        n = scanner.nextInt();
        
        tablero = new int[n];
        
        System.out.println("\nBuscando solución para " + n + " reinas...");
        
        if (resolverReinas(0)) {
            System.out.println("¡Solución encontrada!");
            mostrarTablero();
        } else {
            System.out.println("No hay solución para " + n + " reinas.");
        }
        
        scanner.close();
    }
    
    // Función principal del backtracking
    static boolean resolverReinas(int fila) {
        // Caso base: si llegamos a la última fila, encontramos solución
        if (fila == n) {
            return true;
        }
        
        // Probar cada columna en esta fila
        for (int columna = 0; columna < n; columna++) {
            if (esSeguro(fila, columna)) {
                tablero[fila] = columna;  // Colocar reina
                
                if (resolverReinas(fila + 1)) {  // Recursión
                    return true;
                }
                
                // Si no funciona, quitar reina (backtrack)
                tablero[fila] = -1;
            }
        }
        
        return false;  // No hay solución en esta fila
    }
    
    // Verificar si es seguro colocar una reina
    static boolean esSeguro(int fila, int columna) {
        for (int i = 0; i < fila; i++) {
            // Verificar misma columna
            if (tablero[i] == columna) {
                return false;
            }
            
            // Verificar diagonales
            if (Math.abs(tablero[i] - columna) == Math.abs(i - fila)) {
                return false;
            }
        }
        return true;
    }
    
    // Mostrar el tablero
    static void mostrarTablero() {
        System.out.println("\nTablero " + n + "x" + n + ":");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (tablero[i] == j) {
                    System.out.print("R ");
                } else {
                    System.out.print(". ");
                }
            }
            System.out.println();
        }
        
        System.out.println("\nPosiciones de las reinas:");
        for (int i = 0; i < n; i++) {
            System.out.println("Fila " + (i+1) + ", Columna " + (tablero[i]+1));
        }
    }
    }

