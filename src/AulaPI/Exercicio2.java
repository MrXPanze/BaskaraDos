// escreva um progama em que o java le o tamnho de dois catetos e ache a importenusa 
package AulaPI;
import java.util.Scanner;
import javax.swing.JOptionPane;
public class Exercicio2 {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        System.out.println("Escreva o valor do 1 cateto ");
        double c1 = Double.parseDouble(console.nextLine());
        System.out.println("Escreva o valor do 2 cateto");
        double c2 = Double.parseDouble(console.nextLine());
        double c11 = Math.pow(c1, 2);
        double c22 = Math.pow(c2, 2);
        double imp = Math.sqrt(c22+c11);
        JOptionPane.showMessageDialog (null,"O valor da sua hipoternusa é " + imp);
    }
}
