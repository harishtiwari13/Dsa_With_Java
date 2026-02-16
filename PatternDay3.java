import java.util.*;
public class PatternDay3 {
    public static void hulk(int rows){
        for(int a = 1 ; a <= rows ; a++){
            for(int b = 1 ; b <= rows ; b++){
                if(a == 1 || a == rows || b == 1 || b == rows){
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
    public static void main(String[] args){
        Scanner j = new Scanner(System.in);
        System.out.print("Enter the Rows: ");
        int num = j.nextInt();
        System.out.println("The Original Rows are: " + num);
        hulk(num);
    }
}