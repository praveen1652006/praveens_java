package com.backtracking_recursion;
import java.util.Scanner;
import java.util.Arrays;
public class string_palindrome {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        String s = obj.nextLine();
        int n = s.length();
        System.out.println(palindrome(s,0));
        //System.out.println(s);

    }

    static boolean palindrome(String s, int i) {
        if (i >= s.length() / 2) return true;
        else if (s.charAt(i) != s.charAt(s.length() - i - 1)) {
            return false;
        }
        return palindrome(s, i + 1);
    }
}
//    static boolean isPalindrome(String s) {
//        String st=convert(s);
//        return isPalindromefind(st,0);
//    }
//    static boolean isPalindromefind(String s,int i){
//        if(i>=s.length()/2) return true;
//        else if(s.charAt(i)!=s.charAt(s.length()-i-1)) return false;
//        return isPalindromefind(s,i+1);
//    }
//    static String convert(String s){
//        //String str=s.replaceAll("\\s+","").toLowerCase();
//        return s.replaceAll("[^a-zA-Z0-9]","").toLowerCase();
//    }
//}

