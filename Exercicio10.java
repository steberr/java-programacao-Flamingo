package exercicios;

import java.util.Scanner;

public class Exercicio10 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite a quantidade de Votos Validos Para Candidato A");
		float candidatoA = sc.nextFloat();
		System.out.println("Digite a quantidade de Votos Validos Para Candidato B");
		float candidatoB = sc.nextFloat();
		System.out.println("Digite a quantidade de Votos Validos Para Candidato C");
		float candidatoC = sc.nextFloat();
		System.out.println("Digite a quantidade de Votos Nulos");
		float votoNulo = sc.nextFloat();
		System.out.println("Digite a quantidade de Votos Brancos");
		float votoBranco = sc.nextFloat();
		float votoValido = candidatoA + candidatoB + candidatoC;
		float totalEleitor = votoValido + votoNulo + votoBranco;
		float percentualValido = (votoValido * 100) / totalEleitor;
		float percentualValidoA = (candidatoA * 100) / totalEleitor;
		float percentualValidoB = (candidatoB * 100) / totalEleitor;
		float percentualValidoC = (candidatoC * 100) / totalEleitor;
		float percentualNulo = (votoNulo * 100) / totalEleitor;
		float percentualBranco = (votoBranco * 100) / totalEleitor;
		System.out.println("O total de voto válido é: " + votoValido);
		System.out.println("O total de eletitores são: " + totalEleitor);
		System.out.println("o percentual de votos válidos para o candidato A é de " + percentualValido + "%");
		System.out.println("o percentual de votos válidos para o candidato A é de " + percentualValidoA + "%");
		System.out.println("o percentual de votos válidos para o candidato B é de " + percentualValidoB + "%");
		System.out.println("o percentual de votos válidos para o candidato C é de " + percentualValidoC + "%");
		System.out.println("o percentual de votos Nulos é de " + percentualNulo + "%");
		System.out.println("o percentual de votos Brancos é de " + percentualBranco + "%");
		sc.close();
	}

}