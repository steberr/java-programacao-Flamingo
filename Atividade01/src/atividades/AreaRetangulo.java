package atividades;

import java.util.Scanner;

public class AreaRetangulo {

	public static void main(String[] args) {
		// Base do retangulo
		
		
		Scanner sc=new Scanner (System.in);
		System.out.println("DIgite o o valor da base");
		float base=sc.nextFloat();
		System.out.println("DIgite o valor da altura");
		double altura=sc .nextInt();
		double area= base * altura;
		
		System.out.println("A Area do retangulo é "+area);
		
		sc.close();

	}

}
