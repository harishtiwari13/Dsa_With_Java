import java.util.*;
public class MultiplicationTableUptoNDay3 {
    public static void roggers(int num){
        for(int a = 1 ; a <= num ; a++){
            for(int b = 1 ; b <= 10 ; b++){
                int mul = a * b;
                System.out.println(a + " x " + b + " = " + mul);
            }
            System.out.println();
        }
    }
    public static void main(String[] args){
        Scanner j = new Scanner(System.in);
        System.out.print("Enter the Number: ");
        int n = j.nextInt();
        System.out.println("The Mulitiplication Table From: " + 1 + " to " + n + " is: ");
        roggers(n);
    }
}