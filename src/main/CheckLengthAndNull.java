package main;

/**
 * @author mesut.saritas
 */
public class CheckLengthAndNull {

	public static void main(String[] args) {
		String[] temp = new String[10];

		if (temp.length > 0) {
			System.out.println("Bad...");

		}

		if (temp != null && temp.length > 0) {

			System.out.println("Good...");

		}

	}
}
