/*
 *Dados dois numeros verificar ase a divisão do primeiro pelo segundo é exata
ou seja com resto 0. Se for verdadeoro imprima (  a divisão de n1 por n2 é exata
)
 */
package AulaAlgoritimo;

import java.util.Scanner;


public class DoisNumeros {
    public static void main(String[] args) {
     int n1 , n2;
     Scanner console = new Scanner (System.in);
        System.out.println("Insira o numoro a ser dividido");
        n1 = console.nextInt();
        System.out.println("Insira o numero dividendo");
        n2 = console.nextInt();
        int produto =  n1%n2;
        if(produto==0){
            System.out.println("A divição dos numeros inseridos é exata");
        }else{
              System.out.println("A divisão dos numeros inseridos é quebrada ");
        }
        }
    }

