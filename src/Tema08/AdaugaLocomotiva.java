package Tema08;
import java.util.Scanner;



public class AdaugaLocomotiva {
	
	public  int addLocomotiva() {
		Scanner scan = new Scanner(System.in);
		System.out.println("Introdu ID si VitezaMaxima: ");
			int nrID = scan.nextInt();
			int mSpeed = scan.nextInt();
			
			System.out.println("Locomotiva ID : " + nrID + " si viteza maxima: " + mSpeed+  "\n\n");
			
		return 0;
	}

}
