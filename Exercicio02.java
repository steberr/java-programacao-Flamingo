package exercicios;

import java.util.Scanner;

public class Exercicio02 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite O Comprimento Da Caixa: ");
		float COMPRIMENTO_DA_CAIXA = sc.nextFloat();
		System.out.println("Digite A Largura Da Caixa: ");
		float LARGURA_DA_CAIXA = sc.nextFloat();
		System.out.println("Digite A Altura Da Caixa: ");
		float ALTURA_DA_CAIXA = sc.nextFloat();
		float VOLUME = COMPRIMENTO_DA_CAIXA * LARGURA_DA_CAIXA * ALTURA_DA_CAIXA;
		System.out.println("VOlume Da Caixa Retangular É: " + VOLUME);
		sc.close();
	}
}