
public class SBIBank implements Bank{
	
	int balance;
	

	public SBIBank(int balance) {
		super();
		this.balance = balance;
	}

	@Override
	public void deposit(int amt) {
		if(amt <50000) {
			this.balance = this.balance +amt;
			System.out.println("From SBIBank.....Successfulyy deposited amt---->"+amt);
		}
		else {
			System.out.println("Limit got exceeds....");
		}
	
	}

	@Override
	public void withDrawn(int amt) {
		if(amt < balance) {// 4000
				if(amt<50000) {
					this.balance = this.balance -amt;
					System.out.println("from SBIBank....successfully withdrawn amt----->"+amt);	
					
				}
				else {
					System.out.println("Limit got Exceeded....");
				}
		}
		else {
			System.out.println("FROm SBIBAnk...Insufficient Funds.....");
		}

			
	}

	@Override
	public void chackBalance() {
		System.out.println("FRom SBI Bank...Avl Balance---->"+this.balance);
	}

}
