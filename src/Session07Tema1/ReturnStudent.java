package Session07Tema1;

public class ReturnStudent  {
	
	public static void main(String[] args) {
		
		Student s1 = new Student("Emil" , 2 ,3);
		Student s2 = new Student("Razvan" , 8 ,3);
		Student s3 = new Student("Andrei" , 5 ,3);
			
//		s1.display();
//		s2.display();
//		s3.display();

		Student[] students = new Student[3];
		students[0] = s1;
		students[1] = s2;
		students[2] = s3;
		for(Student s : students)
		{
			s.display();
		}	
//		 System.out.println("\nSorted by medie"); 
//	        for (int i=0; i<students.length; i++) 
//	            System.out.println(students[i]); 	        
	    } 
		}	
	
	
	

