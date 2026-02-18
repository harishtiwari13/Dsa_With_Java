import java.util.*;
public class SumOfDigitsOfANumber {
    public static void tony(int a){
        int sum = 0;
        int temp = a;
        while(a > 0){
            int num = a % 10;
            sum += num;
            a = a / 10;
        }
        System.out.println("The Sum Of Digits Of: " + temp + " is: " + sum);
    }
    public static void main(String[] args){
        Scanner j = new Scanner(System.in);
        System.out.print("Enter the Number: ");
        int n = j.nextInt();
        System.out.println("The Original Number is: " + n);
        tony(n);
    }
}