/**
 Sum of three Integer adds to ZERO
 a. Desc -> A program with cubic running time. Read in N integers and counts the
 number of triples that sum to exactly 0.
 b. I/P -> N number of integer, and N integer input array
 c. Logic -> Find distinct triples (i, j, k) such that a[i] + a[j] + a[k] = 0
 d. O/P -> One Output is number of distinct triplets as well as the second output is to
 print the distinct triplets.
 @Author: Pavan Saketh
 @Version: 1.0
 @Since: 12-06-2021

 */
import java.util.*;
public class SumThreeNum {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Ente Array Size: ");
        int ArraySize = sc.nextInt();
        int [] array = new int[ArraySize];
        System.out.println("Enter elements in array : ");
        for(int i = 0;i < ArraySize ; i++ )
        {
            array [i] = sc.nextInt();
        }
        int length = array.length;
        findtriplets(array,length);
    }
    public static void findtriplets(int [] array,int length){

        boolean foundtriplet = false;
        int tripletCount = 0;

        for (int i = 0 ; i < length-2 ; i++)
        {
            for (int j = i+1 ; j < length-1 ; j++)
            {
                for (int k = j+1 ; k < length ; k++)
                {
                    if(array[i] + array[j] + array[k] == 0)
                    {
                        tripletCount++;
                        System.out.println(array[i]+" "+array[j]+" "+array[k]);
                        foundtriplet = true;
                    }
                }
            }
        }
        System.out.println("Total number of triplets are : "+tripletCount);

        if (foundtriplet)
        {
            System.out.println("No triplets in the below series");
        }

    }
}