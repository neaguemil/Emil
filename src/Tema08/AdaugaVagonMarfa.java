package Tema08;
import java.util.Scanner;

public class AdaugaVagonMarfa {
	public int addVagonMarfa() {
		Scanner scan = new Scanner(System.in);
		System.out.println("Introdu ID si GreutateMaxima: ");
		int nrID = scan.nextInt();
		int greutateM = scan.nextInt();
		
		System.out.println("Vagon Marfa ID : " + nrID + " si greutate maxima: " + greutateM + "\n\n");
		return 0;
	}

}
