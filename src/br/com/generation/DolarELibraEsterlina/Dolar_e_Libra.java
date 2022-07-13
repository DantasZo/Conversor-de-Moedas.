package br.com.generation.DolarELibraEsterlina;

import java.util.Scanner;

public class Dolar_e_Libra {
	
	public static void main(String[] args) {
		
	
	/*Lembre-se, a declaração da variavel deve seguir o seguinte modelo:
	 
	  "double reaBR" 
	  
	  Sendo rea- tres primeiras letras do nome da moeda, 
	  e BR o pais base da onde ela é usada; Bom trabalho a todos!
	  Branch- Dolar
	*/
	Scanner leia = new Scanner(System.in);
	
	double soma,soma1,fonte;
	double dolEUA= 1;
	double reaBR = 5.42;
	double ienJAP;
	
	System.out.println("Insira a quantidade de ienes: ");
	ienJAP= leia.nextDouble();
	
	// valor colocado X valor em centavos de dolar
	soma=ienJAP*0.0073;
	fonte=soma;
	//esse é o valor de iene em dolar
	System.out.println("Seu iene em dolar: "+soma);
	soma=fonte*5.42; //valor convertido em real
	System.out.println("Essa é sua quantidade de iene em reais: "+soma);
    soma=fonte*58.43;
    System.out.println("Essa é sua quantidade de ienes em Rublo: "+soma);
}
}

