import java.util.*;
public class CheckWhetherTheStringIsPalindromeOrNotDay2 {
    public static void thor(String p){
        String t = "";
        for(int b = 0 ; b < p.length() ; b++){
            char ch = p.charAt(b);
            int d = ch;
            if(d >= 65 && d <= 90){
                char l = (char) (ch + 32);
                t += String.valueOf(l);
            }
            else if(d >= 97 && d <= 122){
                t += String.valueOf(ch);
            }
            else{
                continue;
            }
        }
        System.out.println("The Changed String And Converted Into Lower-Case is: " + t);
        tony(t);
    }
    public static void tony(String g){
        String s = "";
        for(int a = g.length() - 1 ; a >= 0 ; a--){
            char q = g.charAt(a);
            s += q;
        }
        if(g.equals(s)){
            System.out.println(g + " : " + "This is a Palindrome String");
        }
        else{
            System.out.println(g + " : " + "This is Not a Palindrome String");
        }
    }
    public static void main(String[] args){
        Scanner j = new Scanner(System.in);
        System.out.print("Enter the String: ");
        String f = j.nextLine();
        System.out.println("The Original String is: " + f);
        thor(f);
    }
}