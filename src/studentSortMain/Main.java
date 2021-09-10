package studentSortMain;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import studentInformation.Student;

public class Main {

	public static void main(String[] args) {
		//Create arraylist of user-defined class objects
		List<Student> al = new ArrayList<Student>();
		
		System.out.println("Student List (ordered by name)");
		
		Student s1 = new Student(101, "JungHyun", 25);
		al.add(s1); //adding Student class object
		Student s2 = new Student(102, "YuJin", 21);
		al.add(s2);
		Student s3 = new Student(103, "HuiYeong", 21);
		al.add(s3);
		Student s4 = new Student(104, "DaChan", 24);
		al.add(s4);
		Student s5 = new Student(105, "JuSeong", 26);
		al.add(s5);
		Student s6 = new Student(106, "DongJoon", 23);
		al.add(s6);
		Student s7 = new Student(107, "SangBeom", 23);
		al.add(s7);
		Student s8 = new Student(108, "KiWon", 23);
		al.add(s8);
		Student s9 = new Student(109, "HyunJoon", 25);
		al.add(s9);
		Student s10 = new Student(110, "JoonHo", 25);
		al.add(s10);
		
		Collections.sort(al);
		//Traverse elements of arraylist (ordered)
		for (Student s : al)
			System.out.println(s.toString());
	}

}
