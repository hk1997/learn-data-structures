package core.twoDarrays;

import java.util.Scanner;

public class DeclareInputPrint {

    static void printArray(int[][] arr, int n, int m){
        for(int i=0; i<n;i++){
            for(int j=0; j<m;j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
    }

    /**
     * Write a program to take a 2d array with n rows
     * m columns as input.
     *
     * Input example:
     * 3 4
     * 1 2 3 4
     * 5 6 7 8
     * 9 10 11 12
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();

        int[][] arr = new int[n][m];

        for(int i=0; i<n; i++){
            for(int j=0; j<m; j++){
                arr[i][j] = sc.nextInt();
            }
        }

        printArray(arr, n, m);
    }
}
