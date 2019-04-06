package isPrime;

import java.util.Scanner;

public class Solution {
	
	static boolean isPrime(int n) {
		//Base case
		if(n==0 || n==1) {
			return false;
		}
		
		for(int i=2; i*i <= n; i++) {
			if(n%2 == 0) {
				return false;
			}
		}
		
		return true;
	}
	
	public static void main(String[] args) {
		System.out.println("Enter the number of test case ");
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		
		System.out.println("Enter a number");
		while(T --> 0) {
			int n = sc.nextInt();
			boolean check = isPrime(n);
			if(check) {
				System.out.println("Prime");
			}
			else {
				System.out.println("Not prime");
			}
		}
		
		sc.close();
	}

}
