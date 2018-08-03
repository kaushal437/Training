package lti_reflect;

import java.security.BasicPermission;

public class Customer {
	private String name;

	public Customer() {

	}
	@Override
	public String toString() {
		return "name"+name;
				
	}
	public Customer(String name) {
		this.name=name;
	}
	private void print() {
		SecurityManager mgr = new SecurityManager();
		mgr.checkPermission(new BasicPermission("Stay away") {});
		System.out.println("Name"+name);
	}
	
}
