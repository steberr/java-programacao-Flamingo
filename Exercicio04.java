package exercicios;

import java.util.Scanner;

public class Exercicio04 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite o Valor Em Dolar($) Para Converter Para Real(R$): ");
		float dolar = sc.nextFloat();
		System.out.println("Digite O Valor Da Cotação Do Dolar($) Em Real(R$): ");
		float cotacao = sc.nextFloat();
		float conversao = dolar * cotacao;
		System.out.println("$" + dolar + " = " + "R$" + conversao);
		sc.close();
	}
}