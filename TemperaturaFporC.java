package lista03;

import java.util.Scanner;

public class TemperaturaFporC {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite a temperatura em Fahrenheit: ");
        double fahrenheit = sc.nextDouble();

        double celsius = (fahrenheit - 32) * 5 / 9;

        System.out.println("Temperatura em Celsius: " + celsius);

        sc.close();
    }
}
