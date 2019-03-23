package _00_IntroToArrays;


import java.util.Random;

public class _00_ArrayCheatSheet {
	public static void main(String[] args) {
		//1. make an array of 5 Strings
		String[] names = new String[5];
		names[0]="Bob";
		names[1]="Jeff";
		names[2]="Sam";
		names[3]="Mason";
		names[4]="Jack";
		
		
		//2. print the third element in the array
		System.out.println(names[2]);
		//3. set the third element to a different value
		names[2]="Rick";
		//4. print the third element again
		System.out.println(names[2]);
		//5. use a for loop to print all the values in the array
		//   BE SURE TO USE THE ARRAY'S length VARIABLE
		for (int i = 0; i < names.length; i++) {
			System.out.println(names[i]);
		}
		
		//6. make an array of 50 integers
		int[] counters = new int[50] ;
		Random r = new Random();
		//7. use a for loop to make every value of the integer array a random number
		for (int i = 0; i < counters.length; i++) {
			counters[i]= r.nextInt(50);
		}
		//8. without printing the entire array, print only the smallest number in the array
		int smallest = counters[0];
		for (int i = 0; i < counters.length; i++) {
			if(smallest>counters[i]) {
				smallest=counters[i];
			}
			System.out.println(counters[i]);
		}
		System.out.println(smallest);
		//9 print the entire array to see if step 8 was correct
		
		//10. print the largest number in the array.
		int largest = counters[0];
		for (int i = 0; i < counters.length; i++) {
			if(largest<counters[i]) {
				largest=counters[i];
			}
			
		}
		System.out.println(largest);
	}
}