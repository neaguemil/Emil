package Session07Tema1;



public class Student  {	
	private String nume;
	private double nota1 , nota2;
	private double medie;
		
		Student(String nume, double nota1, double nota2 )
		 {
			this.nume = nume;
			this.nota1 =  nota1;
			this.nota2 =  nota2;
			//this.medie = 0;		
	     }
	
		public String getNume() {
		return nume;
	}

		public void setNume(String nume) {
		this.nume = nume;
	}

		public double getNota1() {
		return nota1;
	}

		public void setNota1(int nota1) {
		this.nota1 = nota1;
	}

		public double getNota2() {
		return nota2;
	}

		public void setNota2(int nota2) {
		this.nota2 = nota2;
	}

		public  double getMedia() {
		return this.medie = (nota1 + nota2) / 2;		
		}
		
		public void setMedia(double medie) {
			this.medie = medie;		
		}
	
		public void display() {		 
			System.out.println("Salut " + getNume() + " media ta este: " + getMedia() );
		}	
	}
	
		
		



