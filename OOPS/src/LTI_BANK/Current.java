package LTI_BANK;

public class Current extends Account {
	private double overDraft;
	
	
	public Current() {
			}

	public Current(String holder) {
		super(holder, INIT_CUR_BAL);
		this.overDraft=over_Draft;
		}


	@Override
	public void withdraw(double amount) throws BalanceException {
	if(amount<=balance+overDraft) {
		if(amount<balance) {
			balance-=amount;
		}
			else {
				overDraft-=(amount-balance);
				balance=0;
			}
		System.out.println("balance is "+balance+ "\t overDraft is "+overDraft);
		}
		else
			throw new BalanceException("Insufficient funds!");
		
		
	}
	

	@Override
	public void deposit(double amount) {
		if(overDraft<over_Draft) {
			if(amount+overDraft<over_Draft) {
				overDraft+=amount;
				}
			else {
				balance+=amount-(over_Draft-overDraft);
				overDraft=over_Draft;
			}
			System.out.println("balance is "+balance+ "\t overDraft is "+overDraft);
	}
	
		else
			balance+=amount;
		
	}
}

	
	
	

