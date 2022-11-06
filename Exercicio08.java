package exercicios;

import java.util.Scanner;

public class Exercicio08 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite O Valor A:");
		float valorA = sc.nextFloat();
		System.out.println("Digite O Valor B:");
		float valorB = sc.nextFloat();
		System.out.println("Digite O Valor C:");
		float valorC = sc.nextFloat();
		System.out.println("Digite O Valor D:");
		float valorD = sc.nextFloat();
		float produto = valorA*valorC;
		float soma = valorB+valorD;
		System.out.println("Valor Da Variável P = "+produto+ "\nValor Da Variável S = "+soma);
		sc.close();
		
	}

}