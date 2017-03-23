/*
 * Aqui está tudo que foi feito na 4 aula de algoritomos
 */
package aula.pkg4;

import java.util.Scanner;

/**
 *
 * @author Marcos.Reis
 */
public class TipoaDadosJava {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        int idade;
        String nome = "SENAC";
        boolean b = true; 
        float cotacaoDolar = 3.14f;
        idade =70;
        System.out.println("Bem vindos ao"+nome);
        System.out.println("Em 2016 o "+nome+" completou "+idade+" anos");
        System.out.println("Cotação do Dolar "+cotacaoDolar);
        System.out.println(b);
        System.out.println("Digite sua idade e de um enter");
        idade = leitor.nextInt();
        System.out.println("Digite seu nome e de um enter");
        nome = leitor.next();
        System.out.println("Bem vindo"+nome);
        System.out.println("Sua idade é "+ idade);
        
    }
}
