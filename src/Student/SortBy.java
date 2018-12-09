package Student;

import java.util.Comparator;

public class SortBy implements Comparator<Student>  {
	public int compare(Student a, Student b) 
	{ 
       // return a.medie - b.medie; 
		
//        if (a.getMedia() < a.getMedia()) return -1;
//       if (a.getMedia() > b.getMedia()) return 1;
//        return 0;
		  double delta= a.getMedia() - b.getMedia();
		    if(delta > 0) return 1;
		    if(delta < 0) return -1;
		    return 0;
        		
		
//        double delta= a.getMedia() - b.getMedia();
//        if(delta > 0.00001) return 1;
//        if(delta < -0.00001) return -1;
//        return 0;
		
		
    } 
	
	
} 


 