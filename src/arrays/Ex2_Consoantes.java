package arrays;

import java.util.Scanner;

/*
Façça um programa que leia um vetor de 6 caracteres,
e diga quantas consoantes foram lidas.
Imprima as consoantes.
 */
public class Ex2_Consoantes {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String[] consoantes = new String[6];
        int quantidadeConsoantes = 0;

        int count = 0;
        // loop para solicitar a inserção de uma letra.
        do {
            System.out.println("Digite uma letra: ");
            String letra = scan.next();

            if (!(letra.equalsIgnoreCase("a") ||        // se for diferente de a, e, i, o, u
                    letra.equalsIgnoreCase("e") ||
                    letra.equalsIgnoreCase("i") ||
                    letra.equalsIgnoreCase("o") ||
                    letra.equalsIgnoreCase("u"))) {
                consoantes[count] = letra;  // irá inserir um elemento no array na posição do valor do count
                quantidadeConsoantes++;     // quantidade de consoantes + 1
            }

            count++;    // contador + 1 após execução do código
        } while (count < consoantes.length); // irá parar o loop quando o contador for menor que o tamanho do Array

        // foreach (para cada)-- utilizado para iteração de listas e coleções.
        // o loop se repetirá 'para cada(foreach)' elemento do array.
        System.out.println("Consoantes: ");
        for (String consoante : consoantes) {   //  (tipo do elemento do array : array)
            if (consoante != null) {            // Só irá imprimir os elementos que forem de null(vazio), pois
                System.out.print(consoante + " ");  // a cada loop vai ler a consoante
            }
        }
        System.out.println("\nQuantidade de consoantes: " + quantidadeConsoantes);
    }
}

