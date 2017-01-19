package org.institutoserpis.ed;

import java.util.Scanner;
import java.math.BigDecimal;

public class Suma {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Programas suma: ");
		System.out.print(  "Introduce el primer numero: ");
		String primerNumero = scanner.nextLine();
		BigDecimal primero = new BigDecimal(primerNumero);
		System.out.print(  "      Introdude el segundo: ");
		String segundoNumero = scanner.nextLine();
		BigDecimal segundo = new BigDecimal(segundoNumero);
		BigDecimal suma= primero.add(segundo);
		System.out.println("                La suma es: " + suma);
		
	}

}
