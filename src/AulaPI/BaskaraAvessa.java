package AulaPI;

import java.util.Scanner;

/**
 *
 * @author marcos.vcreis
 */
public class BaskaraAvessa {
    public static void main(String[] args) {
        Scanner console = new Scanner (System.in);
        System.out.println("Insira o X1");
        double x1 = console.nextDouble();
        System.out.println("Insira o X2");
        double x2 = console.nextDouble();
        System.out.println("Insira C");
        double c = console.nextDouble();
        
        //Processamento
        double s = (x1 + x2);
        double p = (x1*x2);
        double a = (c/p);
        double b = (-s*a);
        //saída 
        System.out.printf ("A equação que tem como as raízes x1 %d x2 %d é axº %d+bx %d + c %d" );
    }
    
}
