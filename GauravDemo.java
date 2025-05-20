import java.util.ArrayList;
import java.util.List;

public class GauravDemo {
	
    static String[] firstNames = {
        "arush", "mohith", "arnav", "pavan", "mahesh", "ashwin", "Krishna", "Shiva", "Ram", "Naresh",
        "Sirish", "Vihaan", "Ishaan", "Rohan", "Swathi", "Shruthi", "Anushka", "manvieth", "Rajesh", "teja"
    };
    
    static String[] lastNames = {
        "rao","nair", "sai", "naidu", "babu", "sharma", "verma", "senger", "Singh", "chowdary", "reddy"
    };
    
    
    private static int getRandom(int min, int max) {
        return min + (int)(Math.random() * ((max - min) + 1));
    }
    
    private static String getRandomName() {
        String first = firstNames[getRandom(0,firstNames.length-1)];
        String last = lastNames[getRandom(0,lastNames.length-1)];
        return first + " " + last;
    }

    public static void main(String[] args) {
        List<Student> stuList = new ArrayList<Student>();
        Student stu;

        for (int i = 0; i <= 400; i++) {
            String name = getRandomName();
            stu = new Student(
                1000 + i,
                name,
                "DRk",
                getRandom(25000, 45000),   
                getRandom(0, 100)          
            );

            stuList.add(stu);
            System.out.println(stu);
        }
        

        
    }
}