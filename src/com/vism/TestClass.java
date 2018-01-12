package com.vism;

import java.io.FileWriter;
import java.io.IOException;

import org.apache.commons.lang3.StringUtils;

public class TestClass implements TestInterface {

	String instanceString = "instanceValue";

	static String staticString = "staticvalue";

	public String splitStringsWithHyphen(String input) throws StringNotSupportedException {

		if (input.indexOf("-") == -1) {
			throw new StringNotSupportedException("Please pass a String with Hyphen");
		}

		String[] tokens = input.split("-");

		for (String token : tokens) {
			System.out.println("Token " + token);
		}

		return "success";

	}

	/*
	 * public String convertToUpperCase(String input) throws IOException {
	 * 
	 * StringBuilder upperCaseString = new StringBuilder(input);
	 * 
	 * if (StringUtils.isNotEmpty(upperCaseString)) { upperCaseString.reverse();
	 * }
	 * 
	 * writeToFile(upperCaseString);
	 * 
	 * return upperCaseString.substring(2); }
	 * 
	 * private void writeToFile(StringBuilder upperCaseString) {
	 * 
	 * FileWriter fw = null;
	 * 
	 * try { fw = new FileWriter("C:\\VISMTech\\data.txt", true);
	 * 
	 * fw.write(upperCaseString.toString()); } catch (Exception e) {
	 * e.printStackTrace(); } finally { try { fw.close(); } catch (Exception e)
	 * { System.out.println("Please close me" + fw); } }
	 * 
	 * String b = fw.toString() + 1;
	 * 
	 * }
	 */

	public static void main(String args[]) throws IOException {

		TestClass t = new TestClass();

		System.out.println(t.splitStringsWithHyphen("searchsearch1search2"));

	}

}
