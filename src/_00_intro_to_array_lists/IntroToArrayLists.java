package _00_intro_to_array_lists;

import java.util.ArrayList;

public class IntroToArrayLists {
	public static void main(String[] args) {
		//1. Create an array list of Strings
		//   Don't forget to import the ArrayList (java.util) class
		ArrayList <String> testList = new ArrayList <String> ();
		//2. Add five Strings to your list
		testList.add("A");
		testList.add("B");
		testList.add("C");
		testList.add("D");
		testList.add("E");
		
		//3. Print all the Strings using a standard for-loop
		for (int x = 0; x < testList.size() ; x++ ) {
		
			System.out.println(testList.get(x));
		}
		//4. Print all the Strings using a for-each loop
		for (String x: testList) {
			System.out.println(x);
		}
		//5. Print only the even numbered elements in the list.
		for (int x = 0; x< testList.size(); x+=2) {
		System.out.println(testList.get(x));
			
		}
		//6. Print all the Strings in reverse order.
		for (int x =  testList.size() - 1; x >= 0; x --) {
			System.out.println(testList.get(x));
		}
		//7. Print only the Strings that have the letter 'e' in them.
		for (String x: testList) {
			if (x.contains("E")) {
				System.out.println(x);
			}
		}
	}
}
