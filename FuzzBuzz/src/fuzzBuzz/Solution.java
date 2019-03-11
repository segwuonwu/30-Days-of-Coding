package fuzzBuzz;

import java.util.Scanner;

public class Solution {
	
	static void fizzBuzz(int n) {
		int fizz = 0;
		int buzz = 0;
		for(int i = 1; i <= n; i++) {
			fizz++;
			buzz++;
			if(fizz ==3 && buzz == 5) {
				System.out.println("FizzBuzz");
				fizz = 0;
				buzz = 0;
			}else if(fizz == 3) {
				System.out.println("Fizz");
				fizz = 0;
			}else if(buzz == 5) {
				System.out.println("Buzz");
				buzz = 0;
			}else {
				System.out.println(i);
			}
			
		}
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter a number: ");
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		
		fizzBuzz(num);
		
		sc.close();
	}

}
