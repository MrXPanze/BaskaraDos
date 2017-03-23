
package Exercicios1ap;
import javax.swing.JOptionPane;
import java.util.Scanner;

public class exercicio2ap {
    public static void main(String[] args) {
        Scanner console = new Scanner (System.in);
        System.out.printf("Insira a base:");
        double base = Double.parseDouble (console.nextLine());
        System.out.printf("Insira o expoente: ");
        double expoente = Double.parseDouble(console.nextLine());
        double resultado = Math.pow (base, expoente);
       JOptionPane.showMessageDialog (null, resultado);
    }
}
