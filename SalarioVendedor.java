package lista03;

import java.util.Scanner;

public class SalarioVendedor {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o número de carros vendidos: ");
        int carros = sc.nextInt();

        System.out.println("Digite o valor total de vendas: ");
        double total = sc.nextDouble();

        System.out.println("Digite o salário fixo: ");
        double salarioFixo = sc.nextDouble();

        System.out.println("Digite o valor por carro vendido: ");
        double valorCarro = sc.nextDouble();

        double comissao = carros * valorCarro;
        double bonus = total * 0.05;
        double salarioFinal = salarioFixo + comissao + bonus;

        System.out.println("O salário final do vendedor é: " + salarioFinal);

        sc.close();
    }
}
