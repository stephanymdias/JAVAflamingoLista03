package lista03;

import java.util.Scanner;

public class Antecessor {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Escreva um algoritmo para ler um valor (do teclado) e escrever (na tela) o seu antecessor.");
		
		System.out.println("Digite um número: ");
		
		int numero = sc.nextInt();
		int antecessor = numero - 1;
		
		System.out.println("O antecessor de " + numero + " é: " + antecessor);

		sc.close();
	}

}
