package atividades;

import java.util.Scanner;

public class Divisao {

	public static void main(String[] args) {
		// Divisão
		
		Scanner sc=new Scanner (System.in);
		System.out.println("Digite um Numero");
		double numero=sc.nextFloat();
		System.out.println("digite por qual valor vc quer dividi-lo");
		double numero1=sc .nextDouble();
		double divisao= numero/numero1;
		
		System.out.println("A divisão dos numeros digitado é "+divisao);
		
		sc.close();


	}

}
