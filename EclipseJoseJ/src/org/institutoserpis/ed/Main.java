package org.institutoserpis.ed;

import java.math.BigDecimal;
import java.util.Random;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		Random random = new Random();
		try{
			System.out.println("1.- Sumar.\n"
							 + "2.- Restar.\n"
							 + "3.- Multiplicar.\n"
							 + "0.- Salir");
			//Recoger una variable por consola
			int select = scanner.nextInt();
			//Ejemplo de switch case en Java
			switch(select){
			case 1: 
				
				System.out.println("Suma: ");
				System.out.print(  "Introduce el primer numero: ");
				int primerNumero = scanner.nextInt();
				BigDecimal primero = new BigDecimal(primerNumero);
				System.out.print(  "      Introdude el segundo: ");
				int segundoNumero = scanner.nextInt();
				BigDecimal segundo = new BigDecimal(segundoNumero);
				BigDecimal suma= primero.add(segundo);
				System.out.println("                La suma es: " + suma);  
				break;
			case 2: 
				System.out.println("Resta: ");
				System.out.print(  "Introduce el primer numero: ");
				int primerNumeroR = scanner.nextInt();
				BigDecimal primeroR = new BigDecimal(primerNumeroR);
				System.out.print(  "      Introdude el segundo: ");
				int segundoNumeroR = scanner.nextInt();
				BigDecimal segundoR = new BigDecimal(segundoNumeroR);
				BigDecimal resta= primeroR.subtract(segundoR);
				System.out.println("               La resta es: " + resta);  
				break;
			case 3: 
				System.out.println("Multiplicación: ");
				System.out.print(  "Introduce el primer numero: ");
				int primerNumeroM = scanner.nextInt();
				BigDecimal primeroM = new BigDecimal(primerNumeroM);
				System.out.print(  "      Introdude el segundo: ");
				int segundoNumeroM = scanner.nextInt();
				BigDecimal segundoM = new BigDecimal(segundoNumeroM);
				BigDecimal multiplicacion= primeroM.multiply(segundoM);
				System.out.println("           El resultado es: " + multiplicacion);  
				break;
			case 0: 
				System.out.println("Adios!");
				break;
			default:
				System.out.println("Número no reconocido");break;
			}
			
			System.out.println("\n"); //Mostrar un salto de línea en Java
			
		}catch(Exception e){
			System.out.println("Uoop! Error!");
		
	
}
			


//		Random random = new Random();
//		int numeroAleatorio = random.nextInt(999) + 1;
//		System.out.println("Numero aleatorio=" + opcion);
		
	}

}
