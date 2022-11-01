package loops;

/*
Faça um programa que peça N números inteiros,
calcule e mostre a quantidade de números pares e
a quantidade de impares.
 */

import java.util.Scanner;

public class Ex4_ParEImpar {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int quantNumeros;
        int numero;
        int quantPares = 0, quantImpares = 0;

        System.out.println("Quantidade de números: ");
        quantNumeros = scan.nextInt();

        int count = 1;
        do {
            System.out.println("Número " + count + ": ");
            numero = scan.nextInt();

            if (numero % 2 == 0) quantPares++; // Se o resto da divisão for = 0, então o número é par. quantidade de pares + 1.
            else quantImpares++;                // Caso não, impar.

            count++;
        } while (count <= quantNumeros);    // Enquanto o valor digitado pelo usuário for menor que o contador, irá repetir o código.

        System.out.println("Quantidade Par: " + quantPares);
        System.out.println("Quantidade Impares: " + quantImpares);
    }
}