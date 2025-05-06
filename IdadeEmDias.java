package lista03;

import java.util.Scanner;

public class IdadeEmDias {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite a idade: ");
        int anos = sc.nextInt();

        System.out.println("Digite o mês: ");
        int meses = sc.nextInt();

        System.out.println("Digite o dia: ");
        int dias = sc.nextInt();

int idadeEmDias = (anos * 365) + (meses * 30) + dias;
        System.out.println("A idade em dias é: " + idadeEmDias);
        sc.close();
    }
}
