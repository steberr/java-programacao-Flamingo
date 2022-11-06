package exercicios;

import java.util.Scanner;

public class Exercicio09 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite o Salário Mensal (R$): ");
		float salario_Mensal=sc.nextFloat();
		System.out.println("Percentual De Reajuste(EM%): ");
		float percentural_De_Reajuste=sc.nextFloat();
		float novo_Salário=salario_Mensal+(percentural_De_Reajuste/100)*salario_Mensal;
		System.out.println("Novo Valor DO Salário É: "+novo_Salário+"R$");
		sc.close();

	}

}