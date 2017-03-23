/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Exercicios1ap;

import java.util.Scanner;
        
public class exercicio1 {
    public static void main(String[] args) {
        Scanner console = new Scanner (System.in);
        System.out.print("Insira aqui o primeiro fator: ");
        double fator1 = Double.parseDouble (console.nextLine());
        System.out.print("Insira aqui o segundo fator: ");
        double fator2 = Double.parseDouble (console.nextLine());
        double produto = fator1 * fator2;
        System.out.printf("O produto dos fatores é: %.2f", produto);
    }
}
