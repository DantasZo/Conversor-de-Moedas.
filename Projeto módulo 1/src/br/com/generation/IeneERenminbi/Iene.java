package br.com.generation.IeneERenminbi;

import java.util.Scanner;

public class Iene {


	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		ConversorIene in = new ConversorIene();


		System.out.println("Insira a quantidade de Ienes: ");
		ienJAP = leia.nextDouble();


		soma = ienJAP*dolEUA;
		fonte = soma;

		System.out.println("Essa é sua quantidade Iene de em Dolar: "+soma);
		soma = fonte*dolEUA;  
		System.out.println("Essa é sua quantidade de Iene em Reais: "+soma);
		soma = fonte*realBR;
		System.out.println("Essa é sua quantidade de Iene em Renminbi: "+soma);
		soma = fonte*0.84;
		System.out.println("Essa é sua quantidade de Ienes em Libra Esterlina: "+soma);
		soma = fonte*0.0094;
		System.out.println("Esse é a quantidade de Ienes em Dolars Canadences: "+soma);
		soma = fonte*0.0072;
		System.out.println("Esse é a quantidade de Ienes em Euros: "+soma);
		soma = fonte*0.4196;
		System.out.println("Esse é a quantidade de Ienes em Rublos: "+soma);
		soma = fonte*0.9215;
		System.out.println("Esse é a quantidade de Ienes em Pesos Argentinos: "+soma);
		

		leia.close();	
	}


}
