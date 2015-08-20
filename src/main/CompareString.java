package main;

/**
 * @author mesut.saritas
 */
public class CompareString {

	public static void main(String[] args) {

		String temp = "Java";

		/*
		 * A bad idea to avoid NullPointerException
		 */
		if (temp.equalsIgnoreCase("Java")) {

			System.out.println("Bad...!!");

		}

		if ("Java".equalsIgnoreCase(temp)) {

			System.out.println("Good...!!");

		}

	}

}
