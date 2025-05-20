import java.util.ArrayList;
import java.util.List;

public class Demo {
	
private static int getRandom(int min,int max) {
		
		return min + 
				 (int)(Math.random() * ((max - min) + 1));
		
	}


	public static void main(String[] args) {

		List<Student> stuList = new ArrayList<Student>();
		
		 String[] firstNames = {
		        "arush", "mohith", "arnav", "pavan", "mahesh", "ashwin", "Krishna", "Shiva", "Ram", "Naresh",
		        "Sirish", "Vihaan", "Ishaan", "Rohan", "Swathi", "Shruthi", "Anushka", "manvieth", "Rajesh", "teja"
		    };
		    
		     String[] lastNames = {
		        "rao","nair", "sai", "naidu", "babu", "sharma", "verma", "senger", "Singh", "chowdary", "reddy"
		    };
		    

		Student stu = null;
		for (int i = 0; i <= 200; i++) {
			stu = new Student(1000 + i, 
					firstNames[getRandom(0,firstNames.length-1)] +" "+
					lastNames[getRandom(0,lastNames.length-1)],
					"DRk", 
					getRandom(25000,45000), 
					getRandom(1,100));

			stuList.add(stu);
		}

		for (int i = 0; i <= 200; i++) {
			System.out.println(stuList.get(i));
		}
		
		System.out.println("\n\n\n All pass students...");
		// pass students
		showPassStudents(stuList);
		// fail students
		

	}


	private static void showPassStudents(List<Student> stuList) {
		
		for(int i=0;i<stuList.size();i++) {
			Student stu = stuList.get(i);
			if(stu.getMarks() >= 35) {
				System.out.println(stu);
			}
		}
		
	}

}
