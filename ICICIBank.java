
public class ICICIBank implements Bank{
	
	int balance;
	

	public ICICIBank(int balance) {
		super();
		this.balance = balance;
	}

	@Override
	public void deposit(int amt) {
		if(amt <200000) {
			this.balance = this.balance +amt;
			System.out.println("From ICICIBank.....Successfulyy deposited amt---->"+amt);
		}
		else {
			System.out.println("Limit got exceeds....");
		}
	
	}

	@Override
	public void withDrawn(int amt) {
		if(amt < balance) {// 4000
				if(amt<200000) {
					this.balance = this.balance -amt;
					System.out.println("from ICICIBank....successfully withdrawn amt----->"+amt);	
					
				}
				else {
					System.out.println("Limit got Exceeded....");
				}
		}
		else {
			System.out.println("FROm ICICIBank...Insufficient Funds.....");
		}

			
	}

	@Override
	public void chackBalance() {
		System.out.println("FRom ICICIBank...Avl Balance---->"+this.balance);
	}

}
