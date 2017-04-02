/*Calcular a conta de consumo de energia elétrica
de um consumidor, dado o kWh consumido, de
acordo com a tabela.
 */
package AulaAlgoritimo;

import java.util.Scanner;

/*
 * @author marcos.vcreis
 */
public class exercicio2703_04 {
    public static void main(String[] args) {
      Scanner console = new Scanner (System.in);
        System.out.println("Insira seu consumo de energia em kWh");
        double consumo = console.nextDouble();
        double preço;
        if(consumo < 150){
           preço =  (consumo*0.20);
            System.out.println("O preço da sua conta de luz é " + preço);
            
        }else if(consumo >= 150 && consumo <500 ){
            preço = ( consumo*0.25);
            System.out.println("O preço da sua conta de luz é R$" + preço);
        }else if(consumo>=500){
            preço = (consumo*0.30);
            System.out.println("O preço da sua conta de luz é R$" + preço);
        }else{
            System.out.println("O preço da sua conta de luz é R$11,90 ");
        }
    }
}
