package Session07Tema1;

import java.util.Comparator;

public class Sort implements Comparator<Student> {

	
	public int compare(Student s1, Student s2) {
	
		return (int) (s1.getMedia() - s2.getMedia());

	}

}
