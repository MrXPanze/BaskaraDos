package FernandoPrimeiraLista;

import java.util.Scanner;

/**
 Fazer um algoritmo que leia um valor L e calcula a área de um quadrado de lado
 *  L.
 */
public class EX5 {
    public static void main(String[] args) {
        Scanner console = new Scanner (System.in);
        System.out.print("Digite o Lado do quadrado: ");
        double lado= console.nextDouble();
        double area = Math.pow(lado,2);
        System.out.println("A área do quadrado é: " + area);
    }
 
}
