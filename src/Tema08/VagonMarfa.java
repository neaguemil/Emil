package Tema08;

public class VagonMarfa implements Depou {
	
	public int ID;
	public int greutate;
	
	VagonMarfa(int ID , int greutate )
	{
		this.ID = ID;
		this.greutate = greutate;		
	}

	public int getID() {
		return ID;
	}

	public void setID(int iD) {
		ID = iD;
	}

	public int getGreutate() {
		return greutate;
	}

	public void setGreutate(int greutate) {
		this.greutate = greutate;
	}

}
