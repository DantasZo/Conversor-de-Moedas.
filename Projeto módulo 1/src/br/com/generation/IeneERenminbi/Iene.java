package br.com.generation.IeneERenminbi;

import java.util.Scanner;

public class Iene {


	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);


		double soma, fonte;
		double dolEUA = 0.0073  ;
		double realBR = 5.42;
		double ienJAP;

		System.out.println("Insira a quantidade de ienes: ");
		ienJAP = leia.nextDouble();


		soma = ienJAP*dolEUA;
		fonte = soma;

		System.out.println("Seu iene em dolar: "+soma);
		soma = fonte*realBR;  
		System.out.println("Essa é sua quantidade de iene em reais: "+soma);
		soma = fonte*6.72;
		System.out.println("Essa é sua quantidade de ienes em Renminbi: "+soma);
		soma = fonte*0.84;
		System.out.println("Essa sua quantidade de ienes em Libra Esterlina: "+soma);

		leia.close();	
	}


}
