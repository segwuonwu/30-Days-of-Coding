/*
 * Your local library needs your help! Given the expected 
 * and actual return dates for a library book, create a program 
 * that calculates the fine (if any). The fee structure is as follows:
 * 1. If the book is returned on or before the expected return date,
 * 	  no fine will be charged (i.e.: fine = 0)
 * 2. If the book is returned after the expected return day but still 
 * 	  within the same calendar month and year as the expected return date,
 *    fine = 15Hackos * (number of days late)
 * 3. If the book is returned after the expected return month but still within 
 *    the same calendar year as the expected return date, the
 *    fine = 500Hackos * (number of months late)
 * 4. If the book is returned after the calendar year in which it was 
 *    expected, there is a fixed fine of 1000Hackos
 */
package libraryFine;

import java.io.*;
import java.util.*;

public class Solution {
	static final int YEARLY_FINE = 10000;
    static final int MONTHLY_FINE = 500;
    static final int DAYLY_FINE = 15;

	public static void main(String[] args) {
		System.out.println("Enter the actual date seprated with space "
				+ "and the expected date in a new line  ");
        Scanner sc = new Scanner(System.in);
        int actual_day = sc.nextInt();
        int actual_month = sc.nextInt();
        int actual_year = sc.nextInt();
        int exp_day = sc.nextInt();
        int exp_month = sc.nextInt();
        int exp_year = sc.nextInt();
        
        int diff_day = actual_day-exp_day;
        int diff_month = actual_month-exp_month;
        int diff_year =  actual_year - exp_year;
        
        int fine = 0;
        
        if(diff_day>0 && diff_month == 0) {
        	fine = DAYLY_FINE * diff_day;
        	System.out.println(fine);
        }
        else if(diff_month>0 && diff_year == 0) {
        	fine = MONTHLY_FINE * diff_month;
        	System.out.println(fine);
        }
        else if(diff_year>0) {
        	System.out.println(YEARLY_FINE);
        }
        else {
        	System.out.println(fine);
        }
        
        sc.close();

	}

}
