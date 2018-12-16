package Tema08;

import java.util.Scanner;
//id si locomotiva
public class FormareTren {
	public  int makeTrain() {
		Scanner scan = new Scanner(System.in);
		System.out.println("Introdu ID si locomotivaID: ");
			int nrID = scan.nextInt();
			int IDlocomotiva = scan.nextInt();
			System.out.println("Tren ID: " + nrID + "    IDlocomotiva " + IDlocomotiva + "\n\n");
		return 0;
	}

}
