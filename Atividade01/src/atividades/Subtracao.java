package atividades;

import java.util.Scanner;

public class Subtracao {

	public static void main(String[] args) {
		// Subtração
		Scanner sc=new Scanner (System.in);
		System.out.println("Digite um Numero");
		int numero=sc .nextInt();
		System.out.println("DIgite o outro Numero");
		int numero1=sc .nextInt();
		
		int subtracao = numero - numero1;
		
		
		System.out.println("A Soma dso numeros digitado é "+subtracao);
		
		sc.close();
	}

}
