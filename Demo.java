import java.util.ArrayList;
import java.util.List;

public class Demo {
	
private static int getRandom(int min,int max) {
		
		return min + 
				 (int)(Math.random() * ((max - min) + 1));
		
	}


	public static void main(String[] args) {

		List<Student> stuList = new ArrayList<Student>();
		
		

		Student stu = null;
		for (int i = 0; i <= 200; i++) {
			stu = new Student(1000 + i, "Stu" + i, "DRk", 
					getRandom(25000,45000), 
					getRandom(1,100));

			stuList.add(stu);
		}

		for (int i = 0; i <= 200; i++) {
			System.out.println(stuList.get(i));
		}

	}

}
