package FernandoPrimeiraLista;

import java.util.Scanner;

/**
 Fazer um algoritmo que lê dois números, a base e o expoente, e imprime a potência (base elevada ao
expoente). Dica: use a função matemática Math.pow(). Exemplo: 5 elevado ao cubo ficaria
Math.pow(5, 3).
 */
public class EX2 {
    public static void main(String[] args) {
        Scanner console = new Scanner (System.in);
        System.out.println("digite o numero");
        double n1 = console.nextDouble();
        System.out.println("digite o expoente");
        double e1 = console.nextDouble();
        double resutado = Math.pow(n1, e1);
        System.out.println("O resutado é: " + resutado);
    }
}
