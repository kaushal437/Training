package LTI_BANK;

public class CurrentTransaction extends Transaction {

	private double overdraft;
	

	public CurrentTransaction() {
		// TODO Auto-generated constructor stub
	}

	public CurrentTransaction(String type, double amount, double balance,double overdraft) {
		super(type, amount, balance);
		// TODO Auto-generated constructor stub
		this.overdraft=overdraft;
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return super.toString();
	}


	
	
}
