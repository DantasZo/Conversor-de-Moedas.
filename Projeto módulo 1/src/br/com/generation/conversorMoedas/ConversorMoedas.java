package br.com.generation.conversorMoedas;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ConversorMoedas {

	public static void main(String[] args) {
			//--> Objeto das classes conversores...
			ConversorDolar cp = new ConversorDolar();
			ConversorIene cp1 = new ConversorIene();
			ConversorEuro cp2 = new ConversorEuro();
			ConversorRublo cp3 = new ConversorRublo();
			ConversorRenminbi cp4 = new ConversorRenminbi();
			ConversorReal cp5 = new ConversorReal ();
			ConversorLibra cp6 = new ConversorLibra();
			ConversorPesoArg cp7 = new ConversorPesoArg();
			ConversorDolarCan cp8 = new ConversorDolarCan();
			ConversorPesoCol cp9 = new ConversorPesoCol();
			for(int i = 0; i < 5; i++) {
			int us;
			try {
			Scanner entrada = new Scanner(System.in);
			
			System.out.println("Você deseja usar o conversor de moedas? ");
			System.out.println("1 - Digite 1 para continuar");
			System.out.println("2 - Digite 2 para encerrar");
			us = entrada.nextInt();
			} catch (InputMismatchException f) {
				System.out.println("Erro de digitação, tente novamente...");
				continue;
			}
			if(us == 2) {
				System.out.println("Saindo do conversor...");
				break;
			}else {
			
				switch (us) {
				case 1:
					break;
				case 2:
					System.out.println(".....");
				default:
					System.out.println("Operação invalida... tente novamente");
					continue;
					
				}
			}	
				
			
			
			// --> Looping até o usuario querer sair do programa...
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
					"\n7- Digite 7 para Real" + "\n8- Digite 8 para Peso Argentino" + "\n9- Digite 9 para Dolar Canadense" + 
					"\n10- Digite 10 para Peso Colombiano" + "\n11- Digite 11 para Sair");
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
				System.out.println("Erro de digitação, tente novamente...");
				continue;
				}	
			//--> Para sair do programa
			if (usuario == 11 ){
	             System.out.println ( "Saindo do programa..." );
	             break;
	         }
			// -->  Se não for sair do programa, ele executa o case...
			// -->  Pega o valor fixo, deixado nas classes para fazer a conta, enquanto imprimi o valor direto...
			else {
	             switch ( usuario ) {
	             case  1 : 
	            	 System.out.println ( "		Dolar" );
	  				 System.out.println("Dolar: US$" + valor + " → " + "Remimbi: ¥" + valor * cp.getRemimbi());
	  				 System.out.println("Dolar: US$" + valor + " → " + "Euro: €" + valor * cp.getEuro());
	  				 System.out.println("Dolar: US$" + valor + " → " + "Libra: £" + valor * cp.getLibra());
	  				 System.out.println("Dolar: US$" + valor + " → " + "Rublo: ₽" + valor * cp.getRublo());
	  				 System.out.println("Dolar: US$" + valor + " → " + "Peso Colombiano: $" + valor * cp.getPesCol());
	  				 System.out.println("Dolar: US$" + valor + " → " + "Real: R$" + valor * cp.getReal());
	  				 System.out.println("Dolar: US$" + valor + " → " + "Dolar Canadense $" + valor * cp.getDolCan());
	  				 System.out.println("Dolar: US$" + valor + " → " + "Iene: ¥" + valor * cp.getIene());
	  				 System.out.println("Dolar: US$" + valor + " → " + "Peso Argentino: $" + valor * cp.getPesArg());
	  				 System.out.println("═══════════════════════════════════════════════════════════════════════");
	            	 
	                 break ;
	             case  2 :
	            	 System.out.println ( "		Euro" );
	  				 System.out.println("Euro: €" + valor + " → " + "Rublo: ₽" + valor * cp2.getRublo()  );
	  				 System.out.println("Euro: €" + valor + " → " + "Real: €" + valor * cp2.getReal());
	  				 System.out.println("Euro: €" + valor + " → " + "Libra: £" + valor * cp2.getLibra());
	  				 System.out.println("Euro: €" + valor + " → " + "Dolar: US$" + valor * cp2.getDolar());
	  				 System.out.println("Euro: €" + valor + " → " + "Iene: ¥" + valor * cp2.getIene());
	  				 System.out.println("Euro: €" + valor + " → " + "Remimbi: ¥" + valor * cp2.getRemimbi());
	  				 System.out.println("Euro: €" + valor + " → " + "Peso Argentino: $" + valor * cp2.getPesoArg());
	  				 System.out.println("Euro: €" + valor + " → " + "Peso Colombiano: $" + valor * cp2.getPesCol());
	  				 System.out.println("Euro: €" + valor + " → " + "Dolar Canadense $" + valor * cp2.getDolCan());
	  				 System.out.println("═══════════════════════════════════════════════════════════════════════");
	                 break ;
	             case  3 :
	            	 System.out.println ( "		Rublo" );
	  				 System.out.println("Rublo: ₽" + valor + " → " + "Euro: €" + valor * cp3.getEuro()  );
	  				 System.out.println("Rublo: ₽" + valor + " → " + "Real: R$" + valor * cp3.getReal());
	  				 System.out.println("Rublo: ₽" + valor + " → " + "Libra: £" + valor * cp3.getLibra());
	  				 System.out.println("Rublo: ₽" + valor + " → " + "Dolar: US$" + valor * cp3.getDolar());
	  				 System.out.println("Rublo: ₽" + valor + " → " + "Iene: ¥" + valor * cp3.getIene());
	  				 System.out.println("Rublo: ₽" + valor + " → " + "Remimbi: ¥" + valor * cp3.getRemimbi());
	  				 System.out.println("Rublo: ₽" + valor + " → " + "Peso Argentino: $" + valor * cp3.getPesoArg());
	  				 System.out.println("Rublo: ₽" + valor + " → " + "Dolar Canadense $" + valor * cp3.getDolCan());
	  				 System.out.println("Rublo: ₽" + valor + " → " + "Peso Colombiano: $" + valor * cp3.getPesCol());
	  				 System.out.println("═══════════════════════════════════════════════════════════════════════");
	                 break ;
	             case  4 :
	            	 System.out.println  ( "	Iene" );
	  				 System.out.println("Iene: ¥" + valor + " → " + "Real: R$" + valor * cp1.getReal());
	  				 System.out.println("Iene: ¥" + valor + " → " + "Euro: €" + valor * cp1.getEuro());
	  				 System.out.println("Iene: ¥" + valor + " → " + "Libra: £" + valor * cp1.getLibra());
	  				 System.out.println("Iene: ¥" + valor + " → " + "Rublo: ₽" + valor * cp1.getRublo());
	  				 System.out.println("Iene: ¥" + valor + " → " + "Dolar: US$" + valor * cp1.getDolar());
	  				 System.out.println("Iene: ¥" + valor + " → " + "Remimbi: ¥" + valor * cp1.getRemimbi());
	  				 System.out.println("Iene: ¥" + valor + " → " + "Peso Argentino: $" + valor * cp1.getPesoArg());
	  				 System.out.println("Iene: ¥" + valor + " → " + "Dolar Canadense $" + valor * cp1.getDolCan());
	  				 System.out.println("Iene: ¥" + valor + " → " + "Peso Colombiano: $" + valor * cp1.getPesCol());
	  				 System.out.println("═══════════════════════════════════════════════════════════════════════");
	                 break ;
	                 
	             case  5 :
	            	 System.out.println ( "		Libra Esterlina" );
	  				 System.out.println("Libra: £" + valor + " → " + "Remimbi: ¥" + valor * cp6.getDolar());
	  				 System.out.println("Libra: £" + valor + " → " + "Euro: €" + valor * cp6.getEuro());
	  				 System.out.println("Libra: £" + valor + " → " + "Real: R$" + valor * cp6.getReal());
	  				 System.out.println("Libra: £" + valor + " → " + "Rublo: ₽" + valor * cp6.getRublo());
	  				 System.out.println("Libra: £" + valor + " → " + "Peso Colombiano: $" + valor * cp6.getPesCol());
	  				 System.out.println("Libra: £" + valor + " → " + "Dolar: US$" + valor * cp6.getDolar());
	  				 System.out.println("Libra: £" + valor + " → " + "Dolar Canadense $" + valor * cp6.getDolCan());
	  				 System.out.println("Libra: £" + valor + " → " + "Iene: ¥" + valor * cp6.getIene());
	  				 System.out.println("Libra: £" + valor + " → " + "Peso Argentino: $" + valor * cp6.getPesArg());
	  				 System.out.println("═══════════════════════════════════════════════════════════════════════");
	            	 
	            	 
	                 break ;
	             case  6 :
	            	 System.out.println ( "		Remimbi" );
	  				 System.out.println("Remimbi: ¥" + valor + " → " + "Dolar: US$" + valor * cp4.getDolar());
	  				 System.out.println("Remimbi: ¥" + valor + " → " + "Euro: €" + valor * cp4.getEuro());
	  				 System.out.println("Remimbi: ¥" + valor + " → " + "Libra: £" + valor * cp4.getLibra());
	  				 System.out.println("Remimbi: ¥" + valor + " → " + "Rublo: ₽" + valor * cp4.getRublo());
	  				 System.out.println("Remimbi: ¥" + valor + " → " + "Peso Colombiano: $" + valor * cp4.getPesoCol());
	  				 System.out.println("Remimbi: ¥" + valor + " → " + "Real: R$" + valor * cp4.getReal());
	  				 System.out.println("Remimbi: ¥" + valor + " → " + "Dolar Canadense $" + valor * cp4.getDolCan());
	  				 System.out.println("Remimbi: ¥" + valor + " → " + "Iene: ¥" + valor * cp4.getIene());
	  				 System.out.println("Remimbi: ¥" + valor + " → " + "Peso Argentino: $" + valor * cp4.getPesoArg());
	  				 System.out.println("═══════════════════════════════════════════════════════════════════════");
	                 break ;
	            	 
	                 
	             case  7 :
	            	 System.out.println ( "		Real" );
	  				 System.out.println("Real: R$" + valor + " → " + "Remimbi: ¥" + valor * cp5.getDolar());
	  				 System.out.println("Real: R$" + valor + " → " + "Euro: €" + valor * cp5.getEuro());
	  				 System.out.println("Real: R$" + valor + " → " + "Libra: £" + valor * cp5.getLibra());
	  				 System.out.println("Real: R$" + valor + " → " + "Rublo: ₽" + valor * cp5.getRublo());
	  				 System.out.println("Real: R$" + valor + " → " + "Peso Colombiano: $" + valor * cp5.getPesCol());
	  				 System.out.println("Real: R$" + valor + " → " + "Dolar: US$" + valor * cp5.getDolar());
	  				 System.out.println("Real: R$" + valor + " → " + "Dolar Canadense $" + valor * cp5.getDolCan());
	  				 System.out.println("Real: R$" + valor + " → " + "Iene: ¥" + valor * cp5.getIene());
	  				 System.out.println("Real: R$" + valor + " → " + "Peso Argentino: $" + valor * cp5.getPesArg());
	  				 System.out.println("═══════════════════════════════════════════════════════════════════════");
	            	 
	                 break ;
	             case  8 :
	            	 System.out.println  ( "	Peso Argentino" );
	  				 System.out.println("Peso Argentino: $" + valor + " → " + "Remimbi: ¥" + valor * cp7.getDolar());
	  				 System.out.println("Peso Argentino: $" + valor + " → " + "Euro: €" + valor * cp7.getEuro());
	  				 System.out.println("Peso Argentino: $" + valor + " → " + "Libra: £" + valor * cp7.getLibra());
	  				 System.out.println("Peso Argentino: $" + valor + " → " + "Rublo: ₽" + valor * cp7.getRublo());
	  				 System.out.println("Peso Argentino: $" + valor + " → " + "Peso Colombiano: $" + valor * cp7.getPesCol());
	  				 System.out.println("Peso Argentino: $" + valor + " → " + "Dolar: US$" + valor * cp7.getDolar());
	  				 System.out.println("Peso Argentino: $" + valor + " → " + "Dolar Canadense $" + valor * cp7.getDolCan());
	  				 System.out.println("Peso Argentino: $" + valor + " → " + "Iene: ¥" + valor * cp7.getIene());
	  				 System.out.println("Peso Argentino: $" + valor + " → " + "Real: $" + valor * cp7.getReal());
	  				 System.out.println("═══════════════════════════════════════════════════════════════════════");
	                 break ; 
	             case  9 :
	            	 System.out.println  ( "	Dolar Canadense" );
	            	 System.out.println("Dolar Canadense: $" + valor + " → " + "Remimbi: ¥" + valor * cp8.getDolar());
	  				 System.out.println("Dolar Canadense: $" + valor + " → " + "Euro: €" + valor * cp8.getEuro());
	  				 System.out.println("Dolar Canadense: $" + valor + " → " + "Libra: £" + valor * cp8.getLibra());
	  				 System.out.println("Dolar Canadense: $" + valor + " → " + "Rublo: ₽" + valor * cp8.getRublo());
	  				 System.out.println("Dolar Canadense: $" + valor + " → " + "Peso Colombiano: $" + valor * cp8.getPesCol());
	  				 System.out.println("Dolar Canadense: $" + valor + " → " + "Dolar: US$" + valor * cp8.getDolar());
	  				 System.out.println("Dolar Canadense: $" + valor + " → " + "Dolar: $" + valor * cp8.getDolar());
	  				 System.out.println("Dolar Canadense: $" + valor + " → " + "Iene: ¥" + valor * cp8.getIene());
	  				 System.out.println("Dolar Canadense: $" + valor + " → " + "Real: $" + valor * cp8.getReal());
	  				 System.out.println("═══════════════════════════════════════════════════════════════════════");
	                 break ;     
	             case  10 :
	            	 System.out.println  ( "Peso Colombiano: " );
	            	 System.out.println("Peso Colombiano: $" + valor + " → " + "Remimbi: ¥" + valor * cp9.getDolar());
	  				 System.out.println("Peso Colombiano: $" + valor + " → " + "Euro: €" + valor * cp9.getEuro());
	  				 System.out.println("Peso Colombiano: $" + valor + " → " + "Libra: £" + valor * cp9.getLibra());
	  				 System.out.println("Peso Colombiano: $" + valor + " → " + "Rublo: ₽" + valor * cp9.getRublo());
	  				 System.out.println("Peso Colombiano: $" + valor + " → " + "Peso Argentino: $" + valor * cp9.getPesArg());
	  				 System.out.println("Peso Colombiano: $" + valor + " → " + "Dolar: US$" + valor * cp9.getDolar());
	  				 System.out.println("Peso Colombiano: $" + valor + " → " + "Dolar Canadense $" + valor * cp9.getDolCan());
	  				 System.out.println("Peso Colombiano: $" + valor + " → " + "Iene: ¥" + valor * cp9.getIene());
	  				 System.out.println("Peso Colombiano: $" + valor + " → " + "Real: $" + valor * cp9.getReal());
	  				 System.out.println("═══════════════════════════════════════════════════════════════════════");
	                 break ; 
	                 
	             default :
	            	 System.out.println ("   \nOpção Invalida, digite novamente..." );
	             }	
				}
			}
			
		}
			
	}
	
}