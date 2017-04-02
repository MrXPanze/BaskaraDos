package AulaPI.AULA3003;
import java.util.Scanner;
public class Exerecicio1_30_3 {
    public static void main(String[] args) { // sempre tem que ter
        Scanner console = new Scanner (System.in); // adiciona o scanner
        System.out.println("Escreva um numero de um a 1 à 12 e desccura o seu dobro");
        double n = console.nextDouble(); //  
             if (n >= 1 && n <=12) { //cria a condição se o n for >que 1 e <12  ele exucuta o comando abaixo
                System.out.println("O dobro do numero digitado é: " + (n*2) );
                
    }else{ //o a primeira validação falha 
                System.out.print("O numero é maior ou menos que 1 ou 12");                
            }
        
    }
}
