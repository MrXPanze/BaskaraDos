/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package AulaPI.AULA3003;

import java.util.Scanner;

public class Exercicio2_30_3 {
    public static void main(String[] args) {
        Scanner console = new Scanner (System.in);
        System.out.println("Digite seu Login e Senha:");
        String l, s;
        l = console.nextLine();
        s = console.nextLine();
        if (l.equals("guilherme")  && s.equals("0f5") ){
        System.out.println("Bem vindo Guilherme");
        
        }else if(l.equals("jair") && s.equals("0706") ){
            System.out.println("Bem vindo Jair");
        }else{
            System.out.println("ACESSO NEGADO ");
        }
        
        
        
    }
}
