package exercicios;

import java.util.Scanner;

public class Exercicio05 {

	public static void main(String[] args) {
			Scanner sc = new Scanner(System.in);
			System.out.println("Digite o Valor Em Real(R$) Para Converter Para Dolar($): ");
			float real = sc.nextFloat();
			System.out.println("Digite O Valor Da Cotação Do Real($) Em Dolar(R$): ");
			float cotacao = sc.nextFloat();
			float conversao = real * cotacao;
			System.out.println("R$" + real + " = " + "$" + conversao);
			sc.close();
		}
	}