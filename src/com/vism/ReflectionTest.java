package com.vism;

import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class ReflectionTest {

	public static void reflectionTest() throws InstantiationException, IllegalAccessException, ClassNotFoundException {

		// Data d = new Data();

		// Class class1 = d.getClass();

		Class class1 = Class.forName("com.vism.TestClass");

		System.out.println("class name " + class1.getName());

		Class[] intefaces = class1.getInterfaces();
		
		System.out.println("Interface Name "+intefaces[0].getName());
		
		/*
		 * for (Method m : class1.getMethods()) { System.out.println(
		 * "Field Name : " + m.getName() + "-- Return Type " + m.getReturnType()
		 * + "-- Declared Class " + m.getDeclaringClass() + "-- Exception Types"
		 * + m.getExceptionTypes() + "-- Annotations " + m.getAnnotations());
		 * 
		 * }
		 */
		/*
		 * Field[] farray = class1.getDeclaredFields();
		 * 
		 * for (Field f : farray) { System.out.println("Field Name : " +
		 * f.getName()); System.out.println("Field Type : " + f.getType());
		 * System.out.println("Field Generic Type : " + f.getGenericType()); }
		 */

		Object obj = class1.newInstance();

		Data d1 = null;

		if (obj instanceof Data) {
			d1 = (Data) obj;
		}

		System.out.println("d1..." + d1);

	}

	public static void main(String args[])
			throws InstantiationException, IllegalAccessException, ClassNotFoundException {
		reflectionTest();
	}

}
