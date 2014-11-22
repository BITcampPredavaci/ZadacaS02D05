/**Napisati program koji uèitava tri cijela broja iz interval od 50 do 200 . Ako neki od

unesenih brojeva nisu iz tog intervala, program treba ispisati poruku i završiti sa 

radom. Ako su brojevi unutar tog intervala, potrebno je ispisati unesene brojeve 

poredane po velièini, od najmanjeg prema najvecem. Dodatno je potrebno odrediti 

koliko razlièitih brojeva je uneseno.
 * 
 * @author Vedad
 *
 */

import java.util.Scanner;
//Za unos 300 300 300 program ispisuje Svi brojevi su isti.
public class pedesetDo200Interval {
	public static void main(String[] args) {
		int broj1;
		int broj2;
		int broj3;

		Scanner in = new Scanner(System.in);
		System.out.println("Unesite prvi broj ");
		broj1 = in.nextInt();

		System.out.println("Unesite drugi broj ");
		broj2 = in.nextInt();

		System.out.println("Unesite treci broj ");
		broj3 = in.nextInt();

		// Ako su svi brojevi isti
		if (broj1 == broj2 && broj1 == broj3 && broj2 == broj3) {
			System.out.println("Svi brojevi su isti");
			return;
		}

		// Ako su dva broja ista
		if (broj1 == broj2 || broj1 == broj3 || broj2 == broj3) {
			System.out.println("Postoje dva ista broja");
			return;
		}

		// Ispitivanje da li je broj u rangu
		if ((broj1 < 50 || broj1 > 200) || (broj2 < 50 || broj2 > 200)
				|| (broj3 < 50 || broj3 > 200)) {
			System.out.println("Brojevi nisu u intervalu izmedju 50 i 200");
			return;
		}
		// Ispitivanje velicine brojeva

		// broj=max
		if ((broj1 > broj2) && (broj1 > broj3)) {
			if (broj2 > broj3) {
				System.out.printf(
						"Brojevi poredani po velicini su %4d %4d %4d", broj3,
						broj2, broj1);
			} else
				System.out.printf(
						"Brojevi poredani po velicini su %4d %4d %4d", broj2,
						broj3, broj1);

		}

		// broj2 = max
		if ((broj2 > broj1) && (broj2 > broj3)) {

			if (broj1 > broj3) {
				System.out.printf(
						"Brojevi poredani po velicini su %4d %4d %4d", broj3,
						broj1, broj2);
			} else
				System.out.printf(
						"Brojevi poredani po velicini su %4d %4d %4d", broj1,
						broj3, broj2);

		}

		// broj3=max
		if ((broj3 > broj2) && (broj1 > broj3)) {
			if (broj1 > broj2) {
				System.out.printf(
						"Brojevi poredani po velicini su %4d %4d %4d", broj2,
						broj1, broj3);
			} else
				System.out.printf(
						"Brojevi poredani po velicini su %4d %4d %4d", broj1,
						broj2, broj3);

		}
	}
}
