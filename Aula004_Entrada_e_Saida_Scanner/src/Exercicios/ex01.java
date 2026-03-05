package Exercicios;

import java.util.Scanner;

public class ex01 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Qual o seu nome? ");
		String nome = sc.nextLine();
		
		System.out.println("Quantos anos vc tem? ");
		int idade = sc.nextInt();
		
		System.out.println("Qual a sua altura? ");
		double altura = sc.nextDouble();
		
		System.out.printf("seu nome é: %s vc te %d e tem %.2f de altura", nome, idade, altura);
		
		sc.close();
		
	}

}
