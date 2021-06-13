/**
 2D Array
 a. Desc -> A library for reading in 2D arrays of integers, doubles, or booleans from
 standard input and printing them out to standard output.
 b. I/P -> M rows, N Cols, and M * N inputs for 2D Array. Use Java Scanner Class
 c. Logic -> create 2 dimensional array in memory to read in M rows and N cols
 d. O/P -> Print function to print 2 Dimensional Array. In Java use PrintWriter with
 OutputStreamWriter to print the output to the screen.
 @Author: Pavan Saketh
 @Version: 1.0
 @Since: 12-06-2021

 */
import java.util.*;
public class TwoDimensionalArray {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Rows and Columns");
        int rows = sc.nextInt();
        int columns = sc.nextInt();
        int[][] array = new int[rows][columns];

        System.out.println("Enter Values to insert in the 2D array: ");

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                array[i][j] = sc.nextInt();
            }
        }
        twodarray(rows,columns,array);
    }
       public static void twodarray(int rows, int columns, int[][] array)
       {

        for(int i = 0 ;i < rows ; i++){

            for (int j = 0 ; j < columns ;j++){

                System.out.println(array[i][j]+" ");

            }

            System.out.println(" ");

        }

    }
}
