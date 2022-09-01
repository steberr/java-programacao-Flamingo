package atividades;
import java.util.Scanner;

public class sucessor {

	public static void main(String[] args) {
		// atividade sucessor
		
		Scanner sc=new Scanner (System.in);
		System.out.println("Digite um Numero");
		int numero=sc .nextInt();
		int sucessor = numero + 1;
		
		System.out.println("O Sucessor do numero digitado é "+sucessor);
		
		sc.close();
		

	}

}
