package LTI_BANK;

public class accountFactory {
	
	private accountFactory() {
		
	}

	public static Bank openAccount(String type,String holder ) {
		Bank acnt = null;
		if(type.equalsIgnoreCase("savings"))
			acnt = new Savings(holder);
		else
			acnt= new Current(holder);
		return acnt;
	}
}
