package atividades;

import java.util.Scanner;

public class DimenssoesDoQuadrado {

	public static void main(String[] args) {
		// Dimensões de um quadrado
		
		Scanner sc=new Scanner (System.in);
		System.out.println("DIgite o valor de um lado do quadrado");
		float area=sc.nextFloat();
		double areatotal= area*2;
		
		
		
		System.out.println("A Area total do quadrado é "+areatotal);
		
		sc.close();
	}
	}


