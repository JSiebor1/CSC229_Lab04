package com.mycompany.csc229_lab04;

/**
 *
 * @author jsieb
 */
public class CSC229_Lab04 {

    public void hello(int n) {
        if (n != 0) { // working case
            System.out.println("Hello World"); // prints "Hello World"
            hello(n - 1); // decrements n
        }
    }

    public int sum(int n1, int n2) {
        int sum = 0;

        if (n1 % 7 == 0) { // n1 divisible by 7
            sum += n1; // adds n1 to sum
        }

        if (n1 == n2) { // base case
            return sum; 
        } else {
            return sum + sum(n1 + 1, n2); // adds all the sums and 
        }
    }

    public int binarySearch(int[] arr, int low, int high, int x) {
        if (high >= low) {
            int mid = low + (high - low) / 2; // eliminates the other side with adding low

            if (arr[mid] == x) {
                return mid; // returns position of found element
            }

            if (arr[mid] > x) {
                return binarySearch(arr, low, mid - 1, x); // decrements the ceiling
            }

            return binarySearch(arr, mid + 1, high, x); // increments the floor
        }

        return -1; // element not found
    }

}
