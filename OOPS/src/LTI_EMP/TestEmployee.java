package LTI_EMP;
public class TestEmployee {
	public static void main(String[] args) {
		employee e1 = new employee("abc", 25000);
        e1.payslip();
		System.out.println("salary is:" + e1.getSalary());
	
		Manager m1=new Manager("bill", 25000, 10000);
		m1.payslip();
		System.out.println("salary is:" + m1.getSalary());
		showSalary(m1); 
		
		executive q1=new executive("musk", 50000, 50000);		
		q1.payslip();
		System.out.println("salary is:" + q1.getSalary());
		showSalary(q1);
	}
	private static void showSalary(employee emp) {	
		System.out.println("Employee salary: "+ emp.getSalary());
	
	}
//
//	private static void showSalary(executive q1) {
//		System.out.println("Executive salary"+q1.getSalary());
//	}
//
//	private static void showSalary(Manager m1) {
//		System.out.println("Maneger salary "+m1.getSalary());
//	}
}
