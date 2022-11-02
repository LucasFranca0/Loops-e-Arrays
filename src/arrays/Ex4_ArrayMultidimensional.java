package arrays;

import java.util.Random;

/*
X X X X     Matriz multidimensional
X X X X     4 linhas e 4 colunas.
X X X X     Cada coluna tem um elemento
X X X X

Gere e imprima uma matriz M 4x4 com valores aleatórios entre 0-9.
Após isso determine o menor número da matriz e a sua posição(linha, coluna).
 */
public class Ex4_ArrayMultidimensional {
    public static void main(String[] args) {
        Random random = new Random();

        int[][] M = new int[4][4];
        //variáveis
        int menor = Integer.MAX_VALUE; //variável que guarda o menor valor
        int linha = 0, coluna = 0; //posição inicial da linha e da coluna

        //para: variável i = 0, até i menor que o tamanho da matriz (array multidimencional), acrescentamos 1 ao valor de i a cada loop.
        for (int i = 0; i < M.length; i++) { //navegando na matriz
            //para: variável j = 0, até i menor que o tamanho da linha, acrescentamos 1 ao valor de i a cada loop.
            for (int j = 0; j < M[i].length; j++) { //navegando na linha (array unidimensional)
                M[i][j] = random.nextInt(9); //atribuindo um número aleatóriamente a posição do elemento

                //se o elemento em uma determinada posição (linha e coluna) é menor que o menor número
                if (M[i][j] < menor) {
                    menor = M[i][j]; //o valor da variável menor passa a ser o valor aleatório
                    linha = i; //que está na linha representada pela variável i
                    coluna = j; //que esta na coluna representada pela variável j
                }
            }
        }
        System.out.println("Menor: " + menor); //menor valor
        System.out.println("Linha: " + linha); //linha que se encontra o menor valor
        System.out.println("Coluna: " + coluna); //coluna que se encontra o menor valor

        System.out.println("\nMatriz"); //Mensagem ilustrativa
        for (int[] linhaM : M) { //para cada linha da matriz M
            for (int colunaM : linhaM) { //pegue a coluna desta linhaM
                System.out.print(colunaM + " "); //imprima esta coluna
            }
            System.out.println(); //pular uma linha
        }
    }
}
