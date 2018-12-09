package Student;

import java.util.ArrayList;
import java.util.Collections;

public class mainStudent {
	public static void main(String[] args) {
		ArrayList<Student> ar = new ArrayList<Student>(); 
        ar.add(new Student("Emil", 5.4, 7)); 
        ar.add(new Student("Andrei", 7.5, 9)); 
        ar.add(new Student("Razvan",9,8.5)); 
        
        Collections.sort(ar, new SortBy()); 
        
        System.out.println("\nSorted by medie"); 
        for (int i=0; i<ar.size(); i++) 
            System.out.println(ar.get(i)); 
        
       
	}
}


