import java.util.*;
public class CountEvenAndOddElementsInTheArrayDay2 {
    public static void roggers(int[] a){
        int evenCount = 0;
        int oddCount = 0;
        for(int b = 0 ; b < a.length ; b++){
            if(a[b] % 2 == 0){
                evenCount++;
            }
            else{
                oddCount++;
            }
        }
        System.out.println("The Total Even Numbers Are: " + evenCount);
        System.out.println("The Total Odd Numbers Are: " + oddCount);
    }
    public static void main(String[] args){
        Scanner j = new Scanner(System.in);
        System.out.print("Enter the Array Size: ");
        int size = j.nextInt();
        if(size == 0){
            System.out.println("The Array is Empty");
            System.out.println("Invalid Number!");
            System.out.println("Please Again Re-Enter The Valid Size Or Number!");
            return;
        }
        int[] arr = new int[size];
        System.out.println("Enter the Array Elements: ");
        for(int t = 0 ; t < arr.length ; t++){
            arr[t] = j.nextInt();
        }
        System.out.println("The Original Array is: ");
        System.out.println(Arrays.toString(arr));
        roggers(arr);
    }
}