
public class BankDemo {

	public static void main(String[] args) {
	
		Bank ramuAcc=null;
		
		
		SBIBank ramuSBI = new SBIBank(5000);
		
		ramuAcc = ramuSBI;
		
		ramuAcc.chackBalance();
		ramuAcc.deposit(75000);
		ramuAcc.chackBalance();
		ramuAcc.withDrawn(4000);
		ramuAcc.chackBalance();
		
		System.out.println("From ICICI Bank....");
		
		ICICIBank ramuICICI = new ICICIBank(5000);
		
		ramuAcc =ramuICICI;
		
		ramuAcc.chackBalance();
		ramuAcc.deposit(75000);
		ramuAcc.chackBalance();
		ramuAcc.withDrawn(4000);
		ramuAcc.chackBalance();
		
		ramuAcc = ramuSBI;
		
		ramuAcc.chackBalance();
	}

}
