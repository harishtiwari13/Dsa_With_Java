import java.util.*;
public class ReverseTheDigitsDay1 {
    public static void thor(String g){
        boolean l = false;
        for(int d = 0 ; d < g.length() ; d++){
            char ch = g.charAt(d);
            if(d == 0 || d == g.length() - 1){
                if(ch == '0'){
                    hulk(g);
                    return;
                }
                else{
                    l = true;
                }
            }
        }
        if(l == true){
            int num = Integer.parseInt(g);
            roggers(num);
            return;
        }
    }
    public static void hulk(String p){
        String s= "";
        for(int t = p.length() - 1; t >= 0 ; t--){
            char q = p.charAt(t);
            s += String.valueOf(q);
        }
        System.out.println("The Reversed String Number: " + s);
    }
    public static void roggers(int a){
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
        System.out.print("Enter the String: ");
        String n = j.next();
        System.out.println("The Original String is: " + n);
        thor(n);
    }
}