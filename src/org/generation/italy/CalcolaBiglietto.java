package org.generation.italy;

import java.util.Scanner;

public class CalcolaBiglietto {
	
	public static void main(String[] args) {
		
		Scanner scn = new Scanner(System.in);
		System.out.println("Inserisci la distanza da percorrere");
		String userDistance = scn.nextLine();
		System.out.println("Inserisci la tua età");
		int userAge = scn.nextInt();
		scn.close();		
		
		float kmPrice = 0.21f;
		
		System.out.println("L'utente ha " + userAge + "anni e deve percorrere " + userDistance );
		
		
		
	}
}
