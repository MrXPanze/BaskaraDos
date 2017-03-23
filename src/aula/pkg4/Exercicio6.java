/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula.pkg4;

import java.util.Scanner;

/**
 *
 * @author marcos.vcreis
 */
public class Exercicio6 {

    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);// adiona o objeto scanner onde se é inserido dados
        double b; //  variavel para o valor da base
        double h; // variavel para o valor da altura
        System.out.println("Digite a base"); //
        b = leitor.nextInt();
        System.out.println("Digite altura");
        h = leitor.nextInt();
        System.out.println(b * h / 2);

    }

}
