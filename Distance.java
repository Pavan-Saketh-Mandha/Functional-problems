/**
 Write a program Distance.java that takes two integer command-line arguments x
 and y and prints the Euclidean distance from the point (x, y) to the origin (0, 0). The
 formulae to calculate distance = sqrt(x*x + y*y). Use Math.power function
 @Author: Pavan Saketh
 @Version: 1.0
 @Since: 12-06-2021

 */

import java.util.*;
public class Distance {
    public static void main(String[] args) {
        System.out.println("Enter x and y values:");
        Scanner value = new Scanner(System.in);
        int x = value.nextInt();
        int y = value.nextInt();

        edistance(x,y);
    }
      public static void edistance(int x, int y)
      {
        //distance calculating code
         double distance = Math.sqrt(x * x + y * y);
        System.out.println("The Euclidean Distance is : "+ distance);
    }
}
