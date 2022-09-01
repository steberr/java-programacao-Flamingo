package atividades;
import java.util.Scanner;
public class AreaDoTrapezio {

	public static void main(String[] args) {
		// Area do Trapézio exercicio 11
		Scanner sc= new Scanner (System.in);
		
		System.out.println("Digite o valor da base maior");
		
		float basemaior =sc.nextFloat();
		System.out.println("digite o valor da base menor");
		
		float basemenor =sc.nextFloat();
		
				System.out.println("digite o valor da altura");
				
		float altura =sc.nextFloat();
		float areatotal= ((basemaior+ basemenor) *altura) /2 ;
		 System.out.println("O valor total da area é "+areatotal);
		 
		sc.close();
				
		
		

	}

}
