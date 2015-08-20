package main;

/**
 * @author mesut.saritas
 */
public class ParametersAreFinal {

	/*
	 * Bad
	 */
	public void input(String message) {

		String temp = message = "Accident..";

	}

	/*
	 * Good
	 */
	public final void input(final String message1, final String message2) {

		//String temp = message1 = ".....";
	}

}
