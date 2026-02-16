import java.util.*;
public class CountUpperAndLowerCaseAndSpaceInAStringDay3 {
    public static void tony(String p){
        String g = "";
        for(int a = 0 ; a < p.length() ; a++){
            char ch = p.charAt(a);
            int d = ch;
            if((d >= 65 && d <= 90) || (d >= 97 && d <= 122) || d == 32){
                g += String.valueOf(ch);
            }
            else{
                continue;
            }
        }
        System.out.println("The Modified String is: " + g);
        hulk(g);
    }
    public static void hulk(String s){
        int upperCase = 0;
        int lowerCase = 0;
        int space = 0;
        for(int b = 0 ; b < s.length() ; b++){
            char l = s.charAt(b);
            int k = l;
            if(k >= 65 && k <= 90){
                upperCase++;
            }
            else if(k >= 97 && k <= 122){
                lowerCase++;
            }
            else if(k == 32){
                space++;
            }
        }
        System.out.println("The UpperCase Letter Are: " + upperCase);
        System.out.println("The LowerCase Letter Are: " + lowerCase);
        System.out.println("The Spaces Are: " + space);
    }
    public static void main(String[] args){
        Scanner j = new Scanner(System.in);
        System.out.print("Enter the String: ");
        String f = j.nextLine();
        System.out.println("The Original String is: " + f);
        tony(f);
    }
}