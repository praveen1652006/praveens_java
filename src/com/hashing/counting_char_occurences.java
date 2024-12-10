package com.hashing;
import java.util.Scanner;
import java.util.Arrays;
public class counting_char_occurences {
    public static void main(String[] args) {
        Scanner obj=new Scanner(System.in);
//        String a=obj.nextLine();
//        // hashing
//        int[] hash=new int[256];
//        for(int i=0;i<a.length();i++){
//            hash[a.charAt(i)-'a']+=1;
//        }
//        // fetching
//        //char k;
//        for(int i=0;i<3;i++){
//            char k=obj.next().charAt(0);
//            System.out.println(hash[k-'a']);
//
//        }
//    }
//} counting 256 charcters
        String a=obj.nextLine();
        // hashing
        int[] hash=new int[256];
        for(int i=0;i<a.length();i++){
            hash[a.charAt(i)]+=1;
        }
        // fetching
        //char k;
        for(int i=0;i<3;i++){
            char k=obj.next().charAt(0);
            System.out.println(hash[k]);

        }
    }
}
