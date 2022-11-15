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
		
		double kmPrice = 0.21d;
		int i = 0;
		double priceKm = 0;
		while(i < userDistance) {
			priceKm = kmPrice + 0.1d;
			i++;
		}
		
		int underDiscount = 20;
		int overDiscount = 40;
		char eur = '\u20ac';
		System.out.println("L'utente ha " + userAge + " anni e deve percorrere " + userDistance + "km");
		double finalPrice =  userDistance * priceKm;
		
		if ((userAge >= 12) && (userAge < 18)) {
			double underPrice = finalPrice - (finalPrice * underDiscount / 100);
			System.out.println("Il costo del biglietto è di: " + underPrice);
		} else if (userAge >= 65) {
			double overPrice = finalPrice - (finalPrice * overDiscount / 100);
			System.out.println("Il costo del biglietto è di: " + overPrice);
		} else if (userAge < 12)  {
			System.out.println("Il biglietto è gratuito");
		} else  {
			System.out.println("Il costo del biglietto è di: " + finalPrice + eur);
		}
	}
}
