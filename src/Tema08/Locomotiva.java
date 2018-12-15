package Tema08;

public class Locomotiva implements Depou {

	public int ID;
	public int maxSpeed;	
	
	Locomotiva(int ID , int maxSpeed)
	{
		this.ID = ID;	
		this.maxSpeed = maxSpeed;
	}	
	public int getMaxSpeed() {
		return maxSpeed;
	}

	public int getID() {
		return ID;
	}	
	}


