package lista03;

import java.util.Scanner;

public class VotosPercentual {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o total de eleitores: ");
        int total = sc.nextInt();

        System.out.println("Digite o número de votos em branco: ");
        int brancos = sc.nextInt();

        System.out.println("Digite o número de votos nulos: ");
        int nulos = sc.nextInt();

        System.out.println("Digite o número de votos válidos: ");
        int validos = sc.nextInt();

        double votosBrancos = (brancos * 100.0) / total;
        double votosNulos = (nulos * 100.0) / total;
        double votosValidos = (validos * 100.0) / total;

        System.out.println("Percentual de votos brancos: " + votosBrancos + "%");
        System.out.println("Percentual de votos nulos: " + votosNulos + "%");
        System.out.println("Percentual de votos válidos: " + votosValidos + "%");

        sc.close();
    }
}
