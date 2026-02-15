import java.util.*;
public class PatternDay1 {
    public static void main(String[] args){
        Scanner j = new Scanner(System.in);
        System.out.print("Enter the rows: ");
        int rows = j.nextInt();
        // printing the pattern
        for(int a = 1 ; a <= rows ; a++){
            for(int b = 1 ; b <= a ; b++){
                System.out.print(b + " ");
            }
            System.out.println();
        }
    }
}