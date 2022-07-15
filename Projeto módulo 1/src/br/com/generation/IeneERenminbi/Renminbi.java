package br.com.generation.IeneERenminbi;

import java.util.Scanner;

public class Renminbi {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);


		double soma, fonte;
		double dolEUA = 0.148;
		double CNY;

		System.out.printf("Insira a quantidade de Renminbi: ");
		CNY = leia.nextDouble();


		soma = CNY*dolEUA;
		fonte = soma;

		System.out.println("Essa é sua quantidade de Renminbi em Dolar: "+soma);
		soma = fonte*0.8074;  
		System.out.println("Essa é sua quantidade de Renminbi em Deais: "+soma);
		soma = fonte*6.72;
		System.out.println("Essa é sua quantidade de Renminbi em Iene: "+soma);
		soma = fonte*0.1252;
		System.out.println("Essa é sua quantidade de Renminbi em Libra Esterlina: "+soma);
		soma = fonte*0.194;
		System.out.println("Esse é a quantidade de Renminbi em Dolars Canadences: "+soma);
		soma = fonte*0.1417;
		System.out.println("Esse é a quantidade de Renminbi em Euros: "+soma);
		soma = fonte*8.6317;
		System.out.println("Esse é a quantidade de Renminbi em Rublos: "+soma);
		soma = fonte*18.9556;
		System.out.println("Esse é a quantidade de Renminbi em Pesos Argentinos: "+soma);
		

		leia.close();	
	}


}
