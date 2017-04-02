package FernandoPrimeiraLista;

import java.util.Scanner;

/**
 *  Escreva um algoritmo que leia três números decimais: A, B e C. Em seguida, calcule e mostre:
a) a área do triângulo retângulo que tem A por base e C por altura.
b) a área do círculo de raio C. (π = 3.14159)
c) a área do trapézio que tem A e B por bases e C por altura.
d) a área do quadrado que tem lado B.
e) a área do retângulo que tem lados A e B.
f) o perímetro do retângulo que tem lados A e B.

 */
public class EX6 {
    public static void main(String[] args) {
        Scanner console = new Scanner (System.in);
        System.out.print("Digite A, B e C: ");
        double A= console.nextDouble();
        double B = console.nextDouble();
        double C= console.nextDouble();
        double tri= (A*C)/2;
        System.out.println("a) A area do triangulo é: "+ tri);
        double Ccir= (C*C);
        double acir= (3.14159*Ccir);
        System.out.println("b)A area do circulo é: "+acir);
        double atrap = (((A*B)*C)/2);
        System.out.println("c)Area do trapézio é: "+atrap);
        double aqua= (B*B);
        System.out.println("a area do quadrado é: "+aqua);
        double aretan=(A*B);
        System.out.println("a areado retangulp é: "+aretan);
        double pretan=((A*2)+(B*2));
        System.out.println("O perimetro do retangulo é: "+pretan);
    }
}
