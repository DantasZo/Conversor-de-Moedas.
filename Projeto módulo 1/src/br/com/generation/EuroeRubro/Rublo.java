package br.com.generation.EuroeRubro;

import java.util.Scanner;

public class Rublo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner leia = new Scanner(System.in);

		double soma,fonte;
		double dolEUA = 0.017;
		double eurEUR = 0.017;
		double rubRUS;
		double ienJAP = 2.35;
		double libING = 0.014;
		double renCHI = 0.11;
		double reaBRA = 0.092;
		double pesARG = 2.19;

		System.out.println("Insira a quantidade em Rublo: ");
		rubRUS = leia.nextDouble();

		fonte = rubRUS;
		
		soma = fonte * dolEUA;
		System.out.println("Seu Rublo em dolar: " + soma);

		soma = fonte * eurEUR;
		System.out.println("Essa é sua quantidade de Rublo em Euro: " + soma);

		soma = fonte * ienJAP;
		System.out.println("Essa é sua quantidade de Rublo em Iene: " + soma);


		soma = fonte * libING;
		System.out.println("Essa é sua quantidade de Rublo em Libras Esterlinas: " + soma);

		soma = fonte * renCHI;
		System.out.println("Essa é sua quantidade de Rublo em Renminbi: " + soma);


		soma = fonte * reaBRA;
		System.out.println("Essa é sua quantidade de Rublo em Real: " + soma);


		soma = fonte * pesARG;
		System.out.println("Essa é sua quantidade de Rublo em Peso Argentino: " + soma);
	}

}
