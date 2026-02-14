import java.util.*;
public class CountVowelsInAStringDay1 {
    // This Method for Converting the String to Lower Case
    public static void tony(String s){
        String t = "";
        for(int b = 0 ; b < s.length() ; b++){
            char ch = s.charAt(b);
            int d = ch;
            if(d >= 65 && d <= 90){
                char k = (char) (ch + 32);
                t += String.valueOf(k);
            }
            else{
                t += String.valueOf(ch);
            }
        }
        System.out.println("The Lower Case String is: " + t);
        roggers(t);
    }
    // This Method is For Counting the Vowels And Consonants
    public static void roggers(String p){
        int vowels = 0;
        int consonants = 0;
        for(int d = 0 ; d < p.length() ; d++){
            char q = p.charAt(d);
            int l = q;
            if(q == 'a' || q == 'e' || q == 'i' || q == 'o' || q == 'u'){
                vowels++;
            }
            else if(l >= 97 && l <= 122){
                consonants++;
            }
            else{
                continue;
            }
        }
        System.out.println("The Total Vowels Are: " + vowels);
        System.out.println("The Total Consonants Are: " + consonants);
    }
    public static void main(String[] args){
        Scanner j = new Scanner(System.in);
        System.out.print("Enter the String: ");
        String g = j.nextLine();
        System.out.println("The Original String is: " + g);
        tony(g);
    }
}