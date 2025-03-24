package lista03;

import java.util.Scanner;

public class Sucessor {

	public static void main(String[] args) {
Scanner sc = new Scanner(System.in);
		
		System.out.println("Escreva um algoritmo para ler um valor (do teclado) e escrever (na tela) o seu sucessor.");
		
		System.out.println("Digite um número: ");
		
		int numero = sc.nextInt();
		int sucessor = numero + 1;
		
		System.out.println("O sucessor de " + numero + " é: " + sucessor);

		sc.close();

	}

}
