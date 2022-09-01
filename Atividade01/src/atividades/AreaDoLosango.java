package atividades;

import java.util.Scanner;

public class AreaDoLosango {

	public static void main(String[] args) {
		// Area do losango exercicio 10
		Scanner sc=new Scanner (System.in);
		
		System.out.println("DIgite o valor da diagonal maior");
		
	float diagonalmaior =sc .nextFloat();
	System.out.println("digite o valor da diagonal menor ");
	float diagonalmenor =sc.nextFloat();
	float arealosango = diagonalmaior * diagonalmenor /2 ;
	System.out.println("O valor da area do Losango é "+arealosango);
	
	sc.close();

	}

}
