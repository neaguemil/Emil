package Tema08;

public class VagonPasager extends VagonMarfa  {
	
	VagonPasager(int ID, int greutate) {
		super(ID, greutate);		
	}
	
	int nrMaxPasageri;
	public int getNrMaxPasageri(int nrMaxPasageri) {
		return nrMaxPasageri;
	}

	public void setNrMaxPasageri(int nrMaxPasageri) {
		this.nrMaxPasageri = nrMaxPasageri;
	}

	
	
}