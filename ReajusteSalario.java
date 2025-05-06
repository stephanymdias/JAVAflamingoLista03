package lista03;

import java.util.Scanner;

public class ReajusteSalario {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o salário atual: ");
        double salario = sc.nextDouble();

        System.out.println("Digite o percentual de reajuste: ");
        double percentual = sc.nextDouble();

        double salarioNovo = salario + (salario * percentual / 100);

        System.out.println("O novo salário é: " + salarioNovo);

        sc.close();
    }
}
