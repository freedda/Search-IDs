/*
 * 
 * Make a parallel stream with IDs
 * Search ids, Key: The first single digit
 * 
 */


import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Stream;

public class Main {

	public static void main(String[] args) {
		
		List<String> peoplesID = new ArrayList<String>();
		
		//Add IDs to the list
		peoplesID.add("1564");
		peoplesID.add("2564");
		peoplesID.add("4895");
		peoplesID.add("5697");
		peoplesID.add("1697");
		peoplesID.add("1567");

	
		Scanner sc = new Scanner(System.in);
		String bool=sc.nextLine();
		//If user doesn't give a signle digit, ask for it
			if(bool.length() > 1) { 
				while(bool.length()>1) {
					System.out.println("Please, Give a signle digit to search");
				    bool=sc.next();} 
			} 
		
		//save a single digit
		char num= bool.charAt(0);
		
		Stream<String> peopleById=peoplesID.parallelStream();
	
		//Print IDs starting with number aChar 
				peopleById
				        .filter(sameId -> sameId.charAt(0) == num)
				        .forEach(sameId -> System.out
				                        .println("IDs starting with  number " + num+ ": "
				                                + sameId));

	}

}


