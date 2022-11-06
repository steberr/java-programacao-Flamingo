package exercicios;

import java.util.Scanner;

public class Exercicio06 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite O Valor A: ");
		float valorA = sc.nextFloat();
		System.out.println("Digite O Valor B: ");
		float valorB = sc.nextFloat();
		System.out.println("Digite O Valor C: ");
		float valorC = sc.nextFloat();
		float soma = (valorA*valorA)+(valorB*valorB)+(valorC*valorC);
		System.out.println("A Soma Dos Quadrados É: " +soma);
		sc.close();
 }}