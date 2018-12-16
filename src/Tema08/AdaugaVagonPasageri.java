package Tema08;

import java.util.Scanner;

public class AdaugaVagonPasageri {

	public  int addVagonPasageri() {
		Scanner scan = new Scanner(System.in);
		System.out.println("Introdu ID , GreutateMaxima si Numarul Maxim De Locuri : ");
			int nrID = scan.nextInt();
			int greutateMax = scan.nextInt();
			int nrMaxLoc = scan.nextInt();
			
			System.out.println("VagonPasageri ID: " + nrID + " ,greutate maxima : " + greutateMax + " si numarul maxim de locuri: "+ nrMaxLoc + "\n\n");
			
		return 0;
	}
}
