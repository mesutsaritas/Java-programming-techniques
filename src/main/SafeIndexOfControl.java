package main;

/**
 * @author mesut.saritas
 */
public class SafeIndexOfControl {

	public static void main(String[] args) {
		
		String temp="Java";
		String character="v";

		if(temp.indexOf(character)!=-1){
			
			System.out.println("Bad...");
			
		}
		if(temp.indexOf(character)>=0){
			System.out.println("God..");
			
		}
	}
	
	
}
