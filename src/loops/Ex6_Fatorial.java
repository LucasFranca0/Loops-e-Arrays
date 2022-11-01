package loops;

import java.util.Scanner;

/*
Faça um programa que calcule o fatorial de um número inteiro fornecido pelo usuário.
Ex.: 5!= 120 (5 x 4 x 3 x 2 x 1)
 */
public class Ex6_Fatorial {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int multiplicacao = 1;

        System.out.println("Fatorial: ");
        int fatorial = scan.nextInt();

        for (int i = fatorial; i >= 1; i--) {
            multiplicacao*= i;        // Multiplicacao receberá o valor do fatorial na primeira execução
                                    // segunda execução por diante irá ser feita a multiplicacao com o decremento do fatorial(i)
        }
        System.out.println(fatorial + "! = " + multiplicacao);
    }
}
