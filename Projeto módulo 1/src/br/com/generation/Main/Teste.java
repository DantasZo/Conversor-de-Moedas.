package br.com.generation.Main;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Teste {
			public static void main(String[] args) {

				Scanner sc = new Scanner (System.in);

	 while( true ) {
         System.out.println( "---------------------------------" );
         System.out.println ( "Escola uma das opções a seguir:" );
         System.out.println ( "1) Somar!" );
         System.out.println ( "2) Subtrair!" );
         System.out.println( "3) Multiplicar!" );
         System.out.println( "4) dividir!" );
         System.out.println ( "5) Sair do programa!" );
         System.out.println ( "---------------------------------" );
         int  opcao ;
         try {
             Scanner  sc1 = new  Scanner ( System . in );
             opcao = sc1.nextInt();
         } catch (InputMismatchException  e) {
        	 System.out.println ( "Caracter inserido não compatível!" );
             continue ;
         }
         if ( opcao == 5 ){
             System.out.println ( "Programa finalizado!" );
             break ;
         } else {
             switch ( opcao ) {
             case  1 :
            	 System.out.println ( "1) Somar!" );
                 break ;
             case  2 :
            	 System.out.println ( "2) Subtrair!" );
                 break ;
             case  3 :
            	 System.out.println ( "3) Multiplicar!" );
                 break ;
             case  4 :
            	 System.out.println  ( "4) dividir!" );
                 break ;  
             default :
            	 System.out.println ( "Opção invalida" );
             }
             
            
 			}
 			
 	  	}
	}
            
}


