package LTI_EMP;

public class executive extends employee {
	private double bonus;

	public executive() {

	}

	public executive(String empName,double salary,double bonus) {
		super(empName,salary);
		this.bonus=bonus;
	}

	@Override
	public void payslip() {
		super.payslip();
		System.out.println("Bonus is:"+bonus);
	}

	@Override
	public double getSalary() {
		return super.getSalary()+bonus;
	}
	
}

