package FernandoPrimeiraLista;

import java.util.Scanner;

/**
Fazer um algoritmo que lê dois números e imprime a soma dos quadrados dos dois números. O
quadrado de um número A é representado por A2
 = A * A.
 */
public class EX3 {
    public static void main(String[] args) {
        Scanner console = new Scanner (System.in);
        System.out.print("Digite o primeiro numero: ");
        double n1= console.nextDouble();
        System.out.print("Digite o segundo numero: ");
        double n2= console.nextDouble();
        double n22= Math.pow(n2, 2);
        double n11= Math.pow(n1, 2);
        double res= (n11+n22);
        System.out.print("O resutado é: " + res);
    }
}
