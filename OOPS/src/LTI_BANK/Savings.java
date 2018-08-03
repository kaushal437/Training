package LTI_BANK;

public class Savings extends Account {

	public Savings() {
		super();
	}

	public Savings(String holder) {
		super(holder, INIT_CUR_BAL);
	}

	@Override
	public void withdraw(double amount) throws BalanceException {
		if(amount <= (balance-MIN_SAV_BAL))
			{balance-=amount;
		txns[idx ++]= new Transaction("Dr",amount,balance);
			}
		else
			throw new BalanceException("Insufficient funds!");
		
	}
	
	
	

}
