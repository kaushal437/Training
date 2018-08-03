package LTI_BANK;

public class Test_bank {

	public static void main(String[] args) {
		Bank sav= accountFactory.openAccount("savings","Polo");
		sav.summary();
		
		sav.deposit(2000);
//		sav.deposit(4000);
//		sav.withdraw(3000);
		
	try {
		sav.withdraw(7000);
		
	}
	
	catch (BalanceException e) {
	
		// TODO Auto-generated catch block
	//	e.printStackTrace(); //for developers to to troubleshoot
		System.out.println(e); //for logging purpose to AUDIT
		System.out.println(e.getMessage());//for end users
	}

		sav.statement();
				
	
	}
	
}
