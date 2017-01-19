package org.institutoserpis.ed;

import java.util.Random;
import java.util.Scanner;

public class Adivina {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Random random = new Random();
		int numeroAleatorio = random.nextInt(1000) + 1;
		int numero;
		System.out.println("El numero escondido un numero entre 1 y 1000");
		System.out.println("Numero aleatorio=" + numeroAleatorio);
		Scanner tcl = new Scanner(System.in);	
		int contador = 0;
		
		
		do {
			System.out.print("Introduce el numero: ");
			String linea = tcl.nextLine();
			numero  = Integer.parseInt(linea);
		//damos pista al usuario. Si es mas grande o mas pequeño.	
			if (numero < numeroAleatorio)
				System.out.println("El numero introducido es menor al aleatorio.");
			else if (numero > numeroAleatorio)
				System.out.println("El numero es mayor al aleatorio.");		
			
		}while(numero != numeroAleatorio);
		       System.out.println("Has acertado");
		}

}
