import java.util.*;
import java.util.Arrays;
public class SecondLargestElementInTheArrayDay1 {
    public static void tony(int[] a){
        int firstLargest = Integer.MIN_VALUE;
        int secondLargest = Integer.MIN_VALUE;
        for(int b = 0 ; b < a.length ; b++){
            if(a[b] > firstLargest){
                secondLargest = firstLargest;
                firstLargest = a[b];
            }
            else if(a[b] != firstLargest && a[b] > secondLargest){
                secondLargest = a[b];
            }
        }
        System.out.println("The First Largest Element In The Array is: " + firstLargest);
        String result = (secondLargest != Integer.MIN_VALUE) ? "The Second Largest Element In The Array is: " + secondLargest : "There is No Second Largest Element in the Array Because All Element Are Same";
        System.out.println(result);
    }
    public static void main(String[] args){
        Scanner j = new Scanner(System.in);
        System.out.print("Enter the Array Size: ");
        int size = j.nextInt();
        int[] arr = new int[size];
        System.out.println("Enter the Array Elements: ");
        for(int t = 0 ; t < arr.length ; t++){
            arr[t] = j.nextInt();
        }
        System.out.println("The Original Array is: ");
        System.out.println(Arrays.toString(arr));
        tony(arr);
    }
}