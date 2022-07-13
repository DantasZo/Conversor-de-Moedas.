package br.com.generation.Main;

import java.util.Scanner;

public class Interface {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner (System.in);
		
		ConstrutorConversao cp = new ConstrutorConversao(0);
		
		int usuario;
		double valor;
		System.out.println();
		System.out.println("╔═════════════════════════════════════════════════════════════════════╗");
		System.out.println("║                       Conversor de Moedas                           ║");
		System.out.println("╚═════════════════════════════════════════════════════════════════════╝");
		System.out.println("╔═════════════════════════════════════════════════════════════════════╗");
		System.out.println("║                    Aplicando conversões de moedas                   ║");
		System.out.println("║                                                                     ║");
		System.out.println("╚═════════════════════════════════════════════════════════════════════╝");
	
		System.out.println("\nMoedas disponiveis para conversão  " );
		System.out.println("═══════════════════════════════════════════════════════════════════════");
		System.out.println("\n1- Digite 1 para Dolar" + "\n2- Digite 2 para Euro" + "\n3- Digite 3 para Rubro" + 
						   "\n4- Digite 4 para Iene" + "\n5- Digite 5 para Libra Esterlina" + "\n6- Digite 6 para Renminbi" +
						   "\n7- Digite 7 para Real" + "\n8- Digite 8 para Peso Argentino" + "\n9- Digite 9 para Sair");
		System.out.println("═══════════════════════════════════════════════════════════════════════");
		usuario = entrada.nextInt();
		
		System.out.println("Digite o valor: ");
		valor = entrada.nextDouble();
		
		if (usuario == 1) {
			System.out.println("As conversões do Dolar para outras moedas são: ");
			System.out.println("Real: " + valor * cp.getReal());
			System.out.println("Euro: " + valor * cp.getEuro());
		}
		if (usuario == 2) {
			System.out.println("As conversões do Euro para outras moedas são: ");
		}
		if (usuario == 3) {
			System.out.println("As conversões do Rubro para outras moedas são: ");
		}
		if (usuario == 4) {
			System.out.println("As conversões do Iene para outras moedas são: ");
		}
		if (usuario == 5) {
			System.out.println("As conversões do Libra Esterlina para outras moedas são: ");
		}
		if (usuario == 6) {
			System.out.println("As conversões do Renminbi para outras moedas são: ");
		}
		if (usuario == 7) {
			System.out.println("As conversões do Real para outras moedas são: ");
		}
		if (usuario == 8) {
			System.out.println("As conversões do Peso Argentino para outras moedas são: ");
		}
		if (usuario == 9) {
			System.out.println("Fim de programa");
			
		}
		if (usuario > 9 || usuario < 1 ) {
			System.out.println("Digitou errado, tente novamente...");
		}
		
		entrada.close();
	}
}
