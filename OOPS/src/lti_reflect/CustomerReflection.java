package lti_reflect;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class CustomerReflection {
	public static void main(String[] args) {
		Customer c1 = new Customer("Polo");
		System.out.println(c1);
		
		Class cc = c1.getClass();
		System.out.println(cc);
		
		System.out.println("--List of Constructors");
		Constructor[] constructors = cc.getConstructors();
		for(Constructor c: constructors) {
			System.out.println(c);
		}
		
		

		System.out.println("--List of Methods");
		Method[] method = cc.getMethods();
		for(Method m: method) {
			System.out.println(m);
		}
		
		System.out.println("--List of declared Methods");
		Method[] decMethods = cc.getDeclaredMethods();
		for(Method m :decMethods) {
			System.out.println(m);
		}
		System.out.println("-- List of Fieldes");
		Field[] fields = cc.getDeclaredFields();
		for(Field f:fields) {
			System.out.println(f);
		}
	}

}
