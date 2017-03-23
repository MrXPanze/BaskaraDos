package AulaAlgoritimo;
import java.util.Scanner;
/**
 *
 * @author MarcosReis
 */
public class Exercicio6 {

    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);// adiona o objeto scanner onde se é inserido dados
        double b; //  variavel para o valor da base
        double h; // variavel para o valor da altura
        System.out.println("Digite a base"); // escreve Digite a base
        b = console.nextInt();// recebe o dado do usuário 
        System.out.println("Digite altura");// escreve Digite altura
        h = console.nextInt();// recebe o dado do usuário 
        System.out.println(b * h / 2);
    }

}
