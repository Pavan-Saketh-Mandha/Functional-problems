import java.util.Scanner;

/**
 Write a program WindChill.java that takes two double command-line arguments t
 and v and prints the wind chill. Use Math.pow(a, b) to compute ab. Given the
 temperature t (in Fahrenheit) and the wind speed v (in miles per hour), the
 National Weather Service defines the effective temperature (the wind chill) to be:
 Note: the formula is not valid if t is larger than 50 in absolute value or if v is larger
 than 120 or less than 3 (you may assume that the values you get are in that range).
 @Author: Pavan Saketh
 @Version: 1.0
 @Since: 12-06-2021

 */

public class WindChill {
    public static void main(String[] args) {
        System.out.println("Enter t and v values:");
        // taking two double command line arguments
        Scanner Double = new Scanner(System.in);
        double t = Double.nextDouble();
        double v = Double.nextDouble();

        // get the value of v^0.16
        double PowerOfV = Math.pow(v,0.16);

        //Formula for WindChill
        if (t > 50 || v > 120 || v < 3)
        {
            System.out.println("Invalid inputs");
            System.out.println("give values of : t < 50 , v < 120 and v > 3 ");
        }
        else
        {
            double w = 35.74 + 0.6215 + (0.4275 * t - 35.75) * PowerOfV;
            System.out.println("The value of Wind Chill : " + w);
        }
    }
}
