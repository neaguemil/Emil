package Tema08;

public class ControlDepou {
	public static void main(String[] args) {
		
		Locomotiva lc = new Locomotiva(1,50);
		VagonMarfa vm = new VagonMarfa(2, 90);
		VagonPasager vp = new VagonPasager(3, 55);
		System.out.println("Locomotiva\nID: " + lc.getID() + "\nViteza maxima permisa: " + lc.maxSpeed);
		System.out.println("Vagon Marfa \nID: " + vm.getID() + "\nGreutate: " + vm.getGreutate());
		System.out.println("Vagon Pasager \nID: " + vp.getID() + " \nNr. maxime de locuri : " + vp.getNrMaxPasageri(4) + " \nGreutate: " + vp.getGreutate() + "tone");
		
	}	
}
