package main;

/**
 * @author mesut.saritas
 */
public class AlwaysThrowOnSwitchDefault {

	public static void main(String[] args) {

		int temp = 3;
		/*
		 * Bad
		 */
		switch (temp) {
		case 1: {
			int i = 1;
			foo();
			break;
		}
		case 2: {
			int i = 1;
			foo();
			break;
		}
		}

		/*
		 * Good..
		 */
		switch (temp) {
		case 1: {
			final int i = 1;
			foo();
			break;
		}
		case 2: {
			final int i = 2;
			foo();
			break;
		}

		default:
			throw new ThreadDeath();
		}

	}

	public static void foo() {
		System.out.println("***************");

	}
}
