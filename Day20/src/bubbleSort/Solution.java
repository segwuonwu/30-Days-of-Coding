package bubbleSort;
import java.util.*;

public class Solution {
    public void bubbleSort(int[] a, int n){
    	int swaps = 0;
        for (int i = 0; i < n; i++) {
            // Track number of elements swapped during a single array traversal
            int numberOfSwaps = 0;
            
            for (int j = 0; j < n-1; j++) {
                // Swap adjacent elements if they are in decreasing order
                if (a[j] > a[j + 1]) {
                	int temp = a[j]; 
                    a[j] = a[j+1]; 
                    a[j+1] = temp; 
                    numberOfSwaps++;
                }
            }
           
            // If no elements were swapped during a traversal, array is sorted
            if (numberOfSwaps == 0) {
                break;
            }
            swaps += numberOfSwaps;
        }
        System.out.println("Array is sorted in " + swaps + " swaps.");
    }
    
    
    /* Prints the array element position */
    public void printElementPosition(int arr[]) 
    { 
        int n = arr.length; 
        
        System.out.println("First Element: "+ arr[0]);
        System.out.println("Last Element: "+ arr[n-1]);
    } 


    public static void main(String[] args) {
    	Solution bs = new Solution();
    	System.out.println("Enter the number of element in your array");
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] a = new int[n];
        System.out.println("Enter the element in your array");
        for(int a_i=0; a_i < n; a_i++){
            a[a_i] = in.nextInt();
        }
        // Write Your Code Here
        bs.bubbleSort(a, n);
        for(int i = 0; i<n; i++)
        	System.out.print(a[i] +" ");
        System.out.println();
        bs.printElementPosition(a);
        
        in.close();
    }
    
}

