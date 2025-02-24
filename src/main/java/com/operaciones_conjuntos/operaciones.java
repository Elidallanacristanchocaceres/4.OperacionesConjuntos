package com.operaciones_conjuntos;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class operaciones {
        public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // 1.ingrese dos conjuntos de numeros
        Set<Integer> conjunto1 = new HashSet<>();
        Set<Integer> conjunto2 = new HashSet<>();

        System.out.println("Ingrese los números del primer conjunto (escriba 'fin' para terminar):");
        leerConjunto(scanner, conjunto1);

        System.out.println("Ingrese los números del segundo conjunto (escriba 'fin' para terminar):");
        leerConjunto(scanner, conjunto2);

        // 3. union interccion y diferencia
        System.out.println("\n Resultados de las operaciones:");

        Set<Integer> union = new HashSet<>(conjunto1);
        union.addAll(conjunto2);
        System.out.println("✅ Unión: " + union);

        Set<Integer> interseccion = new HashSet<>(conjunto1);
        interseccion.retainAll(conjunto2);
        System.out.println("✅ Intersección: " + interseccion);

        Set<Integer> diferencia = new HashSet<>(conjunto1);
        diferencia.removeAll(conjunto2);
        System.out.println("✅ Diferencia (conjunto1 - conjunto2): " + diferencia);

        scanner.close();
    }

    // leer los numeros
    private static void leerConjunto(Scanner scanner, Set<Integer> conjunto) {
        while (true) {
            System.out.print("Número: ");
            String entrada = scanner.nextLine();
            if (entrada.equalsIgnoreCase("fin")) {
                break;
            }
            try {
                int numero = Integer.parseInt(entrada);
                conjunto.add(numero);
            } catch (NumberFormatException e) {
                System.out.println("⚠ Entrada no válida. Ingrese un número entero.");
            }
        }
    }
}