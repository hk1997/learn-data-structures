package core.basics.loops.inclass;

import java.util.Scanner;

public class PrintNumbersWithInput {
    public static void main(String[] args) {
        /**
         * Write a program which takes an integer
         * n as input, and prints the numbers between
         * 1 2 3 4 5 ......n on the same line
         * separated by space.
         */
        // TODO: Write code to input n
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        // Initialize code for loop
        int i = 1;

        // Write Loop with condition and update logic
        while( i <= n){
            System.out.print(i +" ");
            i++;
        }
    }
}
