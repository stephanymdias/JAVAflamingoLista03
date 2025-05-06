package lista03;

import java.util.Scanner;

public class MediaPonderada {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite a primeira nota: ");
        double n1 = sc.nextDouble();

        System.out.print("Digite a segunda nota: ");
        double n2 = sc.nextDouble();

        System.out.print("Digite a terceira nota: ");
        double n3 = sc.nextDouble();

        double mediaFinal = (n1 * 2 + n2 * 3 + n3 * 5) / 10;

        System.out.println("A média final é: " + mediaFinal);

        sc.close();
    }
}

