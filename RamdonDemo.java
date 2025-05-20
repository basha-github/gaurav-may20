
public class RamdonDemo {
	
	private static int getRandom(int min,int max) {
		
		return min + 
				 (int)(Math.random() * ((max - min) + 1));
		
	}

	public static void main(String[] args) {
		
		for(int i=1;i<=10;i++) {
			System.out.println(getRandom(1,100));
			 	
		}
		 

	}

}
