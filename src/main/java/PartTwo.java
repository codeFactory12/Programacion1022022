/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author MENESES
 */
import java.util.Scanner;
public class PartTwo {
    public static void main(String [] args){
         Scanner sc = new Scanner(System.in);
    	      System.out.print ("Ingrese un número impar:");
    	      int n = sc.nextInt (); // El teclado ingresa un número impar
    	 if(  n%2 == 0 ){
    		      System.out.println ("Ingrese un número impar");
    		 return;
    	 }
         int i,j;
    	 
    	 
    	      int array [] [] = new int [n] [n]; // Crea una fila de n filas yn columnas
    	      int a = n-1; // Obtener el índice de línea de la última línea
    	      int b = n / 2; // Obtener el índice de columna de la columna central
    	 
    	 
    	 
    	      // Determinar si una cadena no es una cadena de palíndromo
    	 for ( i = 1 ; i <= n*n ; i++ ){
    		      array [a ++] [b ++] = i; // Asigna el elemento central de la última línea a 1
    		      if (i% n == 0) {// Determine si el valor actual de i es un múltiplo de n
    			      a = a-2; // Si es así, colóquelo en la misma posición en la fila superior
    		     b = b-1;
    		      } else {// De lo contrario, póngalo en la siguiente columna
    			 a = a%n;
    			 b = b%n;
    		 }
    	 }
    	   	
    	 
    	 
    	      System.out.println (n + "Los cuadrados mágicos son los siguientes:");
    	      for (i = 0; i <n; i ++) {// Muestra el cuadrado mágico
    		 for ( j = 0 ; j < n ; j++){
    			 System.out.print(" "+array[i][j]);
    		 }
    		 System.out.println();
    	 }
    	 
    	 
     
     }
}

