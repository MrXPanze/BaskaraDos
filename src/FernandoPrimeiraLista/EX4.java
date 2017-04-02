package FernandoPrimeiraLista;

import java.util.Scanner;

/**
Fazer um algoritmo que lê dois números inteiros e imprime os números consecutivos desses números.
(Por exemplo: se o usuário digitar 2 e ­9, a saída deverá ser 3 e ­8, porque 3 é consecutivo de 2. –8 é
consecutivo de –9)
 */
public class EX4 {
    public static void main(String[] args) {
        Scanner console = new  Scanner (System.in);
        System.out.print("Digite um número inteiro: ");
        int n1 = console.nextInt();
        System.out.print("Digite outro número inteiro: ");
        int n2 = console.nextInt();
        int nx1 = (n1+1);
        int nx2 = (n2+1);
        System.out.printf("Os numeros seguintes são: " + nx1 + " e "+ nx2);
    }
}
