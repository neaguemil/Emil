package Student;

public class Student {
	private String nume;
	private double nota1 , nota2;
	public double medie;
		
		Student(String nume, double nota1, double nota2 )
		 {
			this.nume = nume;
			this.nota1 =  nota1;
			this.nota2 =  nota2;	
	     }
		
		 public String toString() 
		    { 
		        return this.nume + " media ta este " + this.medie ;	                           
		    } 
			public  double getMedia() {
				return this.medie = (nota1 + nota2) / 2;		
				}
				
				public void setMedia(int medie) {
					this.medie = medie;		
				}
				
}
