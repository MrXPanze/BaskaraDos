/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * anmplate in the editor.
 */
package AulaAlgoritimo;

import java.util.Scanner;
import javax.swing.JOptionPane;
/**
 *
 * @author marcos.vcreis
 */
public class CalculoDeMedia2003 {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);// adiciona um scanner para a entrada de dados através de participação do usuário
        float P1, P2;
        float media;
        float n1, n2;
        String nomeAluno;// variaveis /\4
        P1 = 0.4f;
        P2 =0.6f;// agregando valores para as variáveis
        System.out.println(" Insira o nome do aluno:");
        nomeAluno = console.next();
        System.out.println("Insira a primeira nota:");
        n1 = console.nextFloat();
        System.out.println("Insira a segunda nota:");
        n2 = console.nextFloat();
        media = (P1*n1) + (P2*n2);
        System.out.printf ("Nome: %s \n Média: %.2f \n,", nomeAluno,media);
    }
}
