package colecoes;

import java.util.LinkedList;
import java.util.Arrays;

/**
*
* @author Cassio Seffrin
*/
public class ConversoesArraysColecoes 
{
   // construtor cria LinkedList, adiciona elementos e converte em array
   public ConversoesArraysColecoes()
   {
      String arrayCores[] = { "preto", "azul", "amarelo" };

      LinkedList< String > colecaoLinkedList =                           
         new LinkedList< String >( Arrays.asList( arrayCores ) );

      colecaoLinkedList.addLast( "vermelho" );   
      colecaoLinkedList.add( "rosa" );       
      colecaoLinkedList.add( 3, "verde" );  // adiciona no terceiro indice
      colecaoLinkedList.addFirst( "laranja" ); // adiciona como primeiro item

      // obtem elementos LinkedList como um array               
      arrayCores = colecaoLinkedList.toArray( new String[ colecaoLinkedList.size() ] );
      System.out.println( "cores: " );
      for ( String color : arrayCores )
         System.out.println( color );
   }  

   public static void main( String args[] )
   {
      new ConversoesArraysColecoes();
   }  
}  

 