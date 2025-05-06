package lista03;
import java.util.Scanner;

public class AreaDoCirculo {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o raio do circulo: ");

        double raio = sc.nextDouble();

        double area = Math.PI * raio * raio;

        System.out.println("A área do circulo é: " + area);
   sc.close();
    }
}
