package loops;

import java.util.Scanner;

// Usuário digita a quantidade de números que deseja inserir. Programa faz a soma de todos os números, informa o maior e a média.

public class Ex3_MaiorEMedia {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        int cont = 1;
        int maior = 0;
        int soma = 0;
        int numero;
        int digitarNumero;

        System.out.println("Quantos números deseja inserir?");
        digitarNumero = scan.nextInt();

        do {

            System.out.println("Numero " + cont + ": ");
            numero = scan.nextInt();

            soma+= numero;

            if (numero > maior) {
                maior = numero;
            }

            System.out.println("Soma :" + soma);
            cont++;
        } while (cont <= digitarNumero);
        System.out.println("Maior:" + maior);
        System.out.println("Média:" + (soma/digitarNumero));
    }
}
