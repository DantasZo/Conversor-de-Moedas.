package br.com.generation.RealEPesoargentino;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Real {

	public static void main(String[] args) {

		Scanner leia = new Scanner(System.in);


		double soma = 0,rubRUS = 10.76, dolCAN = 0.24, eurGER =  0.18;
		double dolUSA = 0.18 , reaBR = 0, remCHI = 1.25 , libUK = 0.16 , ienJAP = 25.61;
        DecimalFormat form = new DecimalFormat();
		System.out.println("Insira a quantidade de Reais: ");
		reaBR = leia.nextDouble();

		soma = reaBR * dolUSA;

		System.out.println("Seu Real em dolar: "+form.format(soma));
		soma = reaBR*ienJAP;  
		System.out.println("Essa é sua quantidade de Real em iene: "+soma);
		soma = reaBR * libUK;
				System.out.println("Essa é sua quantidade de Real em Esterlina: "+soma);
		soma = reaBR * remCHI;
				System.out.println("Essa sua quantidade de Real em Remimbi: "+soma);
		soma = reaBR * eurGER;
				System.out.println("Essa sua quantidade de Real em Euro: "+form.format(soma));
		soma = reaBR * dolCAN;
				System.out.println("Essa sua quantidade de Real em Dolar Canadense: "+soma);
		soma = reaBR * rubRUS;
				System.out.println("Essa sua quantidade de Real em Rublo Russo: "+soma);
		soma = reaBR * libUK;
				System.out.println("Essa sua quantidade de Real em Libra Esterlina: "+soma);

		leia.close();	
	}
}
