package FernandoPrimeiraLista;

import java.util.Scanner;

/**
 Fazer um algoritmo que leia dois números e imprima na tela o produto (multiplicação) dos dois
números
 */
public class EX1 {
    public static void main(String[] args) {
        Scanner console = new Scanner (System.in);
        System.out.println("Digite o primeiro numero:");
        double n1 = console.nextDouble();
        System.out.println("Digite o segundo numero:");
        double n2 = console.nextDouble();
        double produto = (n1*n2);
        System.out.print("O pruduto da operação é: " + produto);
    }
    
}
