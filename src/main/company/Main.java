package main.company;

import java.util.*;

public class Main {

    public static void main(String[] args) {
	    int n;
        Scanner s = new Scanner(System.in);
        System.out.print("Enter number of elements in the array: ");
        n = s.nextInt();
        int[] a = new int[n];
        System.out.println("Enter all the elements");
        for(int i=0; i<n;i++)
        {
            a[i] = s.nextInt();
        }

        max(a);
        System.out.print("The max number in the array is: ");
        System.out.print(max(a));
        System.out.println();
        min(a);
        System.out.print("The min number in the array is: ");
        System.out.print(min(a));
        System.out.println();
        maxSum(a);
        System.out.print("The max sum of the array is: ");
        System.out.print(maxSum(a));
        System.out.println();
        System.out.print("The min sum of the array is: ");
        System.out.print(minSum(a));
    }


    //Es gibt einen Array mit n positiven Positionen

    //1. Ex: 3, 4, 8, 10, 4, 15 -> max: 15
    private static int max(int[] t) {
        int maximum = t[0];
        for(int i=1; i<t.length;i++){
            if(t[i]>maximum){
                maximum = t[i];
            }
        }
        return maximum;
    }

    //2. Ex: 3, 4, 8, 10, 4, 15 -> min: 3
    private static int min(int[] b){
        int minimum = b[0];
        for(int i=1; i<b.length;i++){
            if(b[i]<minimum){
                minimum = b[i];
            }
        }
        return minimum;
    }

    //3. Max sum in an array. Ex: 3, 4, 8, 10, 4, 15 -> max sum: 4+8+4+10+15= 41
    private static long maxSum(int[] arr){
        long max_value = 0;
        int n = arr.length;
        Arrays.sort(arr);
        for(int j=n-1; j >= 1; j--){
            max_value += arr[j];
        }
        return max_value;
    }

    //4. Max sum in an array. Ex: 3, 4, 8, 10, 4, 15 -> min sum: 3+4+8+10+4= 29
    private static long minSum(int[] sir){
        long min_value = 0;
        int n = sir.length;
        Arrays.sort(sir);
        for(int i=0; i< n-1; i++){
            min_value += sir[i];
        }
        return  min_value;
    }
}
