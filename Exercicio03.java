package exercicios;

import java.util.Scanner;

public class Exercicio03 {

	public static void main(String[] args) {
		int resultado;
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite o Valor Da Variável A: ");
		int valorA = sc.nextInt();
		System.out.println("Digite O Valor DA Variável B: ");
		int valorB = sc.nextInt();
		resultado = valorA - valorB;
		resultado = resultado * resultado;
		System.out.println("Resultado Do Quadrado Será: "+resultado);
		sc.close();
	}

}