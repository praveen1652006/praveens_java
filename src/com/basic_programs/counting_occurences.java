package com.basic_programs;
import java.util.Scanner;
public class counting_occurences {
    public static void main(String[] args) {
        Scanner obj=new Scanner(System.in);
        int a=obj.nextInt();
         int target=5;
         int c=0;
         while(a>0){
             int v=a%10;
             if(v==target){
                 c++;
             }
             a=a/10;
         }
         System.out.println(c);


    }
}
