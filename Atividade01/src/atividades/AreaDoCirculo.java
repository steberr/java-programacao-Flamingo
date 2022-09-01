package atividades;
import java.util.Scanner;
public class AreaDoCirculo {

	public static void main(String[] args) {
		// Valor total da area de um circulo exercicio 12
		
Scanner sc=new Scanner (System.in);
  
 System.out.println("diigte o valor do raio");
 
 double raio= sc.nextFloat();
 
 double area =Math.PI* (raio*raio); 
 
 System.out.println("o valor da area do circulo é "+area);
 sc.close();
 
	}

}
