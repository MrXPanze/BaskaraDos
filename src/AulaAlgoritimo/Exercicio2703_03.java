/*Dada a altura e o peso de uma pessoa,
determinar seu grau de obesidade. O grau de
obesidade é determinado pelo índice da massa
corpórea (Massa = Peso / Altura2 ) através da
tabela.
 */
package AulaAlgoritimo;

import java.util.Scanner;


public class Exercicio2703_03 {
    public static void main(String[] args) {
        Scanner console = new Scanner (System.in);
        double peso, altura, massa;
        System.out.println("digite seu peso com o seguinte formato 70,0");
        peso = console.nextDouble();
        System.out.println("digite sua altura em metros");
        altura = console.nextDouble();
        double altura2 = Math.pow(altura, 2 );
        massa = peso/altura2;
        if(massa < 26 ){
            System.out.printf("Sua massa corporea está normal e é " + massa);
        }else if(massa > 26 && massa < 30){
            System.out.println("Sua massa corporea em nivel obesa e é "+ massa);
        }else {
            System.out.println("vc está um obeso morbido e é " + massa);
        }
      
     }
}
