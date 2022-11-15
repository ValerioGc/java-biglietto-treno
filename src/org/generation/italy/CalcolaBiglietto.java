package org.generation.italy;

import java.util.Scanner;

public class CalcolaBiglietto {
	
	public static void main(String[] args) {
		
		Scanner scn = new Scanner(System.in);
		System.out.println("Inserisci la distanza da percorrere in km"); 
		int userDistance = scn.nextInt();
		System.out.println("Inserisci la tua età");
		int userAge = scn.nextInt();
		scn.close();		
		
		float kmPrice = 0.21f;
		int underDiscount = 20;
		int overDiscount = 40;
		String eur = "\u20ac";
		System.out.println("L'utente ha " + userAge + " anni e deve percorrere " + userDistance );
		float finalPrice =  userDistance * kmPrice;
		
		if (userAge > 18) {
			float underPrice = finalPrice * underDiscount / 100;
			System.out.println(underPrice);
		} else if (userAge >= 65) {
			float overPrice = finalPrice * overDiscount / 100;
			System.out.println(finalPrice);
		} else {
			System.out.println("Il costo del biglietto è di: " + finalPrice + "\u20ac" + eur);
		}
	}
}
