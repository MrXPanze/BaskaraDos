//Dado um numero verificar se ele maior que 100 se for o algoritimo deve somar 150 e impimir o resutado


package AulaPI;
import java.util.Scanner;

public class Verdaderoo {
    public static void main(String[] args) {
        Scanner console = new Scanner (System.in);
        int n1;
            System.out.println("Digite o numero");
            n1 = console.nextInt();
            if (n1 > 100) {
                System.out.println("O numero atendeu os requisistos e foi somado com 150 e ficou " + (n1+150) );
                
    }else{
                System.out.println("O numero é menos que 100");                
            }
            
    }
}
