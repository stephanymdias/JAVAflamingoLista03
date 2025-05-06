package lista03;

import java.util.Scanner;

public class Carro {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o custo de fábrica do carro: ");
        double custoFabrica = sc.nextDouble();

        double distribuidor = custoFabrica * 0.28;
        double impostos = custoFabrica * 0.45;
        double custoFinal = custoFabrica + distribuidor + impostos;

        System.out.println("O custo final ao consumidor é: " + custoFinal);

        sc.close();
    }
}
