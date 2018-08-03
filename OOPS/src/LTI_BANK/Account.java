package LTI_BANK;

/**
 * This class represents bank account details.
 * @author Kaushal Nahata
 * @version 1.0
 */

public abstract class Account implements Bank {
	private int acntNo;
	private String holder;
	protected double balance;

	private static int autogen = INIT_ACNT_NO;
	protected Transaction[] txns;
	protected int idx;

	public Account() {
		// TODO Auto-generated constructor stub
	}

	public Account(String holder, double balance) {
		super();
		this.acntNo = autogen++;
		this.holder = holder;
		this.balance = balance;
		
		
		txns= new Transaction[10];
		txns[idx ++]= new Transaction("DB", balance, balance);
	
	
	}

	public void summary() {
		System.out.println("AccountNo" + acntNo);
		System.out.println("Holder" + holder);
		System.out.println("Blaance" + balance);
	}

	public double getBalance() {
		return balance;
	}

	public void deposit(double amount) {
		balance += amount;
		txns[idx ++]= new Transaction("Cr",amount,balance);

	}

	//public abstract void withdraw(double ammount);
//	{
//		if (ammount <= balance)
//			balance -= ammount;
//		else
//			System.out.println("insufficient funds");
//	}
	public void statement() {
		System.out.println("Statement of A/C: "+acntNo);
		for(int i=0;i<idx;i++) {
			System.out.println(txns[i]);
		}
	}

}
