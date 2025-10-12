/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.mycompany.estructurasrepetitivas;

/**
 *
 * @author David-Code
 */
public class EstructurasRepetitivas {

    public static void main(String[] args) {
        // Estructuras Repetitivas (Bucles) en Java

// 1. FOR: Ideal cuando se conoce el número exacto de iteraciones.
// Se inicializa, se condiciona, y se incrementa en una sola línea.
        System.out.println("--- BUCLE FOR ---");
        for (int i = 1; i <= 5; i++) {
            System.out.println("Número: " + i);
        }
// Salida: Número: 1, Número: 2, ..., Número: 5

// 2. WHILE: Se ejecuta MIENTRAS la condición sea verdadera.
// La inicialización va antes, la condición se comprueba al inicio, y el incremento dentro.
        System.out.println("\n--- BUCLE WHILE ---");
        int i = 1;
        while (i <= 5) {
            System.out.println("Contador: " + i);
            i++;
        }
// Salida: Contador: 1, Contador: 2, ..., Contador: 5

// 3. DO-WHILE: Se ejecuta al menos UNA VEZ, luego verifica la condición.
// La condición se evalúa al final del bloque 'do'.
        System.out.println("\n--- BUCLE DO-WHILE ---");
        int j = 1; // Usamos j para evitar conflicto con la variable anterior
        do {
            System.out.println("Iteración: " + j);
            j++;
        } while (j <= 5);
// Salida: Iteración: 1, Iteración: 2, ..., Iteración: 5
    }
}
