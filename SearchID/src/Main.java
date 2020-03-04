/*
 * 
 * Make a parallel stream with IDs
 * 
 */


import java.util.ArrayList;
import java.util.List;
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

	
		Stream<String> peopleById=peoplesID.parallelStream();
		
		//Print IDs starting with number 1
		peopleById
		        .filter(sameId -> sameId.charAt(0) == '1')
		        .forEach(sameId -> System.out
		                        .println("IDs starting with  number <1> : " 
		                                + sameId));

	}

}
