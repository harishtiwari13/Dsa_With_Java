import java.util.*;
public class CountDigitsInANumberDay4 {
    public static void tony(int a){
        int temp = a;
        int count = 0;
        for( ; a > 0 ; a = a / 10){
            int num = a % 10 ;
            count++;
        }
        System.out.println("The Total digits In The Number: " + temp + " is: " + count);
    }
    public static void main(String[] args){
        Scanner j = new Scanner(System.in);
        System.out.print("Enter the Number: ");
        int n = j.nextInt();
        System.out.println("The Original Number is: " + n);
        tony(n);
    }
}