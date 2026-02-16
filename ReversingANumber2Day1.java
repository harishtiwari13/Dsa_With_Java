import java.util.*;
public class ReversingANumber2Day1 {
    public static void tony(int a){
        int rev = 0;
        while(a > 0){
            int ht = a % 10;
            rev = rev * 10 + ht;
            a = a / 10;
        }
        System.out.println("The Reversed Number is: " + rev);
    }
    public static void main(String[] args){
        Scanner j = new Scanner(System.in);
        System.out.print("Enter the Number: ");
        int num = j.nextInt();
        System.out.println("The Original Number is: " + num);
        tony(num);
    }
}