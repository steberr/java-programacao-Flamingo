package atividades;
import java.util.Scanner;

public class Antecessor {

	public static void main(String[] args) {
		// Antecessor
		Scanner sc=new Scanner (System.in);
		System.out.println("DIgite um Numero");
		
	int numero=sc.nextInt();
	int antecessor= numero -1;
	System.out.println("O valor antecessor do numero digitado é " +antecessor);
	
	sc.close();
		
	

	}

}
