import java.util.*;
public class FactorialOfANumberDay2 {
    public static void tony(int a){
        int fact = 1;
        for(int b = 1 ; b <= a ; b++){
            fact *= b;
        }
        System.out.println("The Factorial of: " + a + " is: " + fact);
    }
    public static void main(String[] args){
        Scanner j = new Scanner(System.in);
        System.out.print("Enter the Number: ");
        int num = j.nextInt();
        if(num < 0){
            System.out.println("Invalid Input!");
            System.out.println("Factorial is defined Or Calculated only for non-negative integers.");
            return;
        }
        System.out.println("The Original Number is: " + num);
        tony(num);
    }
}