package arrays;
/*
Crie um vetor de 6 números inteiros
e mostre-os na ordem inversa.
 */

public class Ex1_OrdemInversa {
    public static void main(String[] args) {

        int[] vetor = {2, 5, 3, 0, -3, -5, 9};

        System.out.println("Vetor: ");

        for (int i = 0; i < vetor.length; i++) {
            System.out.print(vetor[i] + " ");       //imprime cada elemento do vetor de acordo com o valor de  i
        }
        System.out.println("\nTamanho do Array: ");
        System.out.println(vetor.length);

        System.out.println("Vetor inverso: ");
        for (int i = (vetor.length -1); i >= 0; i--) { //-1 para o tamanho do Array seguir a posição dos elementos do Array. 0, 1, 2, 3 ...
            System.out.print(vetor[i] + " ");
        }
    }
}
