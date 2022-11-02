package arrays;

import java.util.Random;

/*
Faça um programa que leia 20 números aleatórios (entre 0 e 100) armazene-os num vetor.
Ao final mostre os números e os seus sucessores.
 */
public class Ex3_NumerosAleatorios {
    public static void main(String[] args) {
        Random random = new Random();       // Anunciando Classe para Gerar números aleatórios

        int[] numerosAleatorios = new int[20];

        for (int i = 0; i < numerosAleatorios.length; i++) {
            int numero = random.nextInt(100); // Irá gerar números aleatórios até o i ser igual a 20. //(bound: 100) = número limite 100
            numerosAleatorios[i] = numero;      // Irá armazenar os números gerados na posição do valor do i: 0, 1, 2, 3 ...
        }

        System.out.print("\nAntecessores dos Números Aleatórios: ");
        for (int numero : numerosAleatorios) {
            System.out.print((numero-1) + " ");
        }

        System.out.print("\nNúmeros Aleatórios: ");
        for (int numero : numerosAleatorios) {   // O laço irá repetir o código abaixo enquanto for menor que o tamanho do Array. Neste caso, numerosAleatorios[20].
            System.out.print(numero + " ");     // Imprime um número aleatório
        }

        System.out.print("\nSucessores dos Números Aleatórios: ");
        for (int numero : numerosAleatorios) {
            System.out.print((numero+1) + " ");
        }
    }
}
