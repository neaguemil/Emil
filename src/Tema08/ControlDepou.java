package Tema08;
import java.util.Scanner;


public class ControlDepou {
public static	Scanner scan = new Scanner(System.in);
	public static void main(String[] args) {
		
		ArataTren at = new ArataTren();
		FormareTren ft = new FormareTren();
		AdaugaVagonPasageri avp = new AdaugaVagonPasageri();
		AdaugaVagonMarfa avm = new AdaugaVagonMarfa();
		AdaugaLocomotiva alc = new AdaugaLocomotiva();
//		Locomotiva lc = new Locomotiva(1,50);
//		VagonMarfa vm = new VagonMarfa(2, 90);
//		VagonPasager vp = new VagonPasager(3, 55);
//		System.out.println("Locomotiva\nID: " + lc.getID() + "\nViteza maxima permisa: " + lc.maxSpeed);
//		System.out.println("Vagon Marfa \nID: " + vm.getID() + "\nGreutate: " + vm.getGreutate());
//		System.out.println("Vagon Pasager \nID: " + vp.getID() + " \nNr. maxime de locuri : " + vp.getNrMaxPasageri(4) + " \nGreutate: " + vp.getGreutate() + "tone");
		
		Depou[] DepouList = new Depou[100];
		int stored ;
		
		
		try {
            // variabila pentru meniu
            int menuOption = 0;
            do {
                // setam menuOption sa fie egal si sa returneze showMenu()
                menuOption = showMenu();

                // alegerea optiunii
                switch (menuOption) {

                case 1:
                	alc.addLocomotiva();
                    break;
                case 2:
                  avm.addVagonMarfa();
                    break;
                case 3:
                 avp.addVagonPasageri();
                    break;
                case 4:
                    ft.makeTrain();
                    break;
                case 5:
                	at.showTrains();
                	break;
                case 6:
                	System.out.println("Quitting Program...");
                	break;
                default:
                    System.out.println("Sorry, please enter valid Option");

                }// End of switch statement

            } while (menuOption != 6);

            // mesaj de quit :D
            System.out.println("Thanks for using this Program...");

        } catch (Exception ex) {
            // Error Message
            System.out.println("Sorry problem occured within Program");
            // flushing scanner
            scan.next();
        } finally {
            // Ensuring that scanner will always be closed and cleaning up
            // resources
        	scan.close();
        }

    }// End of main Method

		
		public static int showMenu() {

		        
		        int option = 0;

		        // Printare meniu
		        System.out.println("Menu:");
		        System.out.println("1.addLocomotiva");
		        System.out.println("2.addVagonMarfa");
		        System.out.println("3.addVagonPasageri");
		        System.out.println("4.makeTrain");
		        System.out.println("5.showTrains");
		        System.out.println("6.quit");

		        // primire optiune de la client
		        System.out.println("Enter Option from above...");
		        
				option = scan.nextInt();

		        return option;

		    }// End of showMenu
	}	

