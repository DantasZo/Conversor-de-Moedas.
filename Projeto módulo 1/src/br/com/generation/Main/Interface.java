package br.com.generation.Main;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Interface {

	public static void main(String[] args) {
			//--> Objeto das classes conversores...
			ConversorIene cp1 = new ConversorIene();
			ConversorEuro cp2 = new ConversorEuro();
			ConversorRublo cp3 = new ConversorRublo();
			// --> Looping até o usuario, querer sair do program
			while(true) {
		
			int usuario;
			double valor;
			//--> Painel que sera mostrado, com as opções de conversões...
			System.out.println("╔═════════════════════════════════════════════════════════════════════╗");
			System.out.println("║                       Conversor de Moedas                           ║");
			System.out.println("╚═════════════════════════════════════════════════════════════════════╝");
		
			System.out.println("Moedas disponiveis para conversão  " );
			System.out.println("═══════════════════════════════════════════════════════════════════════");
			System.out.println("1- Digite 1 para Dolar" + "\n2- Digite 2 para Euro" + "\n3- Digite 3 para Rubro" + 
					"\n4- Digite 4 para Iene" + "\n5- Digite 5 para Libra Esterlina" + "\n6- Digite 6 para Reminbi" +
					"\n7- Digite 7 para Real" + "\n8- Digite 8 para Peso Argentino" + "\n9- Digite 9 para Dolar Canadense" + "\n10- Digite 9 para Sair");
			System.out.println("═══════════════════════════════════════════════════════════════════════");
			//--> Trata quando o usuario digitar letra, tanto na escolha da moeda, quanto no valor de conversão
			try {
			Scanner entrada1 = new Scanner (System.in); 
			System.out.println("Digite a opção desejada para conversão: ");
			usuario = entrada1.nextInt();//--> Usuario escolhe a moeda desejada.
			System.out.println("Digite o valor: ");
	 	 	valor = entrada1.nextDouble();
	 	 	// --> Continua o código através do tratamento de letra, tanto quanto ao valor do usuairo. e o valor da conversão...
			} catch (InputMismatchException e) {
				System.out.println("Letra não é compativel com o pedido, tente novamente...");
				continue;
				}	
			//--> Para sair do programa
			if (usuario == 10 ){
	             System.out.println ( "Sair do programa..." );
	             break ;
	         }
			// -->  Se não for sair do programa, ele executa o case...
			else {
	             switch ( usuario ) {
	             case  1 : 
	            	 System.out.println ( "Dolar" );
	            	 
	                 break ;
	             case  2 :
	            	 System.out.println ( "Euro: " );
	            	 System.out.println("As conversões do Euro para outras moedas são: ");
	  				 System.out.println("Euro: €" + valor + " → " + "Rublo: ₽" + valor * cp2.getRublo()  );
	  				 System.out.println("Euro: €" + valor + " → " + "Real: €" + valor * cp2.getReal());
	  				 System.out.println("Euro: €" + valor + " → " + "Libra: £" + valor * cp2.getLibra());
	  				 System.out.println("Euro: €" + valor + " → " + "Dolar: US$" + valor * cp2.getDolar());
	  				 System.out.println("Euro: €" + valor + " → " + "Iene: ¥" + valor * cp2.getIene());
	  				 System.out.println("Euro: €" + valor + " → " + "Remimbi: ¥" + valor * cp2.getRemimbi());
	  				 System.out.println("Euro: €$" + valor + " → " + "Peso Argentino: $" + valor * cp2.getPesoArg());
	  				 System.out.println("═══════════════════════════════════════════════════════════════════════");
	                 break ;
	             case  3 :
	            	 System.out.println ( "Rubro: " );
	            	 System.out.println("As conversões do Rublo para outras moedas são: ");
	  				 System.out.println("Rublo: ₽" + valor + " → " + "Euro: €" + valor * cp3.getEuro()  );
	  				 System.out.println("Rublo: ₽" + valor + " → " + "Real: R$" + valor * cp3.getReal());
	  				 System.out.println("Rublo: ₽" + valor + " → " + "Libra: £" + valor * cp3.getLibra());
	  				 System.out.println("Rublo: ₽" + valor + " → " + "Dolar: US$" + valor * cp3.getDolar());
	  				 System.out.println("Rublo: ₽" + valor + " → " + "Iene: ¥" + valor * cp3.getIene());
	  				 System.out.println("Rublo: ₽" + valor + " → " + "Remimbi: ¥" + valor * cp3.getRemimbi());
	  				 System.out.println("Rublo: ₽" + valor + " → " + "Peso Argentino: $" + valor * cp3.getPesoArg());
	  				 System.out.println("═══════════════════════════════════════════════════════════════════════");
	                 break ;
	             case  4 :
	            	 System.out.println  ( "Iene: " );
	            	 System.out.println("As conversões do Iene para outras moedas são: ");
	  				 System.out.println("Iene: ¥" + valor + " → " + "Real: R$" + valor * cp1.getReal());
	  				 System.out.println("Iene: ¥" + valor + " → " + "Euro: €" + valor * cp1.getEuro());
	  				 System.out.println("Iene: ¥" + valor + " → " + "Libra: £" + valor * cp1.getLibra());
	  				 System.out.println("Iene: ¥" + valor + " → " + "Rublo: ₽" + valor * cp1.getRublo());
	  				 System.out.println("Iene: ¥" + valor + " → " + "Dolar: US$" + valor * cp1.getDolar());
	  				 System.out.println("Iene: ¥" + valor + " → " + "Remimbi: ¥" + valor * cp1.getRemimbi());
	  				 System.out.println("Iene: ¥" + valor + " → " + "Peso Argentino: $" + valor * cp1.getPesoArg());
	                 break ; 
	             case  5 :
	            	 System.out.println ( "Libra Esterlina: " );
	                 break ;
	             case  6 :
	            	 System.out.println ( "Reminbi: " );
	                 break ;
	             case  7 :
	            	 System.out.println ( "Real: " );
	                 break ;
	             case  8 :
	            	 System.out.println  ( "Peso Argentino: " );
	                 break ; 
	             case  9 :
	            	 System.out.println  ( "Dolar Canadense: " );
	                 break ;     
	                 
	             default :
	            	 System.out.println ( "Opção Invalida..." );
	             }	             
			}
		}
			
	}
	
}