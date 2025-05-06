package lista03;

import java.util.Scanner;

public class AreaDoQuadrado {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite o valor do lado do quadrado: ");
        int lado = sc.nextInt();
        int area = lado * lado;
        System.out.println("A área do quadrado é: " + area);

        sc.close();
    }
}
