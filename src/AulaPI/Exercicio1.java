/*
 * Escreve um programa ( algoritimo ) que calcule quantos KM/l o seu carro está fazendo.
 */
package AulaPI;
import javax.swing.JOptionPane;//adiona a biblioteca que cria uma mensagem em pop up
import java.util.Scanner;
public class Exercicio1 {
    public static void main(String[] args) {
        Scanner console = new Scanner (System.in); // adiciona o scanner
        System.out.print("Digite a capacidade máxima do tanque de combustível do seu carro: "); // manda a mensagem 
        double gm = Double.parseDouble(console.nextLine()); // console.nextline recebe os dados do usuário converte para double e atribiu a variavel
        System.out.print("Digite a distância máxima que seu carro percorre com tanque cheio sem reabastercer: ");// escreve a ,emsage,
        double dm = Double.parseDouble(console.nextLine()); // o mesmo da anterior 
        double cm = dm/gm; // faz a conta
        JOptionPane.showMessageDialog (null, "O consumo médio de seu veículo automotor é de "+ cm +" Km/l!");//mostra em pop up a o consumo médio
        
        
    }
}
