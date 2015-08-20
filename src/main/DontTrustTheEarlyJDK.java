package main;

import java.io.File;

/**
 * @author mesut.saritas
 */
public class DontTrustTheEarlyJDK {

	public static void main(String[] args) {

		File file = new File("D:");

		/*
		 * check directory
		 */
		if (file.isDirectory()) {
			String[] files = file.list();
			/*
			 * Check files
			 */
			if (files != null) {
				for (int i = 0; i <= files.length; i++) {

					System.out.println(files[i]);

				}
			}

		}
	}

}
