import java.util.*;
public class PatternDay5 {
    public static void roggers(int rows){
        for(int a = 1 ; a <= rows ; a++){
            for(int space = 1 ; space <= rows - a ; space++){
                System.out.print(" ");
            }
            for(int b = 1 ; b <= a ; b++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
    public static void main(String[] args){
        Scanner j = new Scanner(System.in);
        System.out.print("Enter the Rows: ");
        int num = j.nextInt();
        System.out.println("The Total Rows is: " + num);
        roggers(num);
    }
}