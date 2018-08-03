package lti_reflect;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;

public class DynamicReflection {
	public static void main(String[] args) throws Exception{
		String qcn ="lti_reflect.Customer";
		
		Class custClass = Class.forName(qcn);
		
		Constructor custConst =custClass.getConstructor(String.class);
		
		Object obj =custConst.newInstance("test");
		System.out.println(obj);
		
		
		//getting private method from class with name and parameteer types
		Method printMethod =custClass.getDeclaredMethod("print",null);
		
		
		//calling print method as customer object
		printMethod.setAccessible(true);
		printMethod.invoke(obj, null);
	}

}
