package com.backtracking_recursion;
import java.util.Scanner;
public class sum_of_n_numbers {
    //parametersied way
     static int i=0;
    public static void main(String[] args) {
        Scanner obj=new Scanner(System.in);
        int n=obj.nextInt();
        //sum(n,i);
        //System.out.println(sum(n));
        System.out.println(fact(n));
    }
    static void sum(int n,int i){
        if(n==0) {
            System.out.print(i);
            return;
        }
        sum(n-1,i+n);

    }
    // functinal way -it returns the value unlike parametersied way
    static int sum(int n){
        if(n==0) return 0;
        return n+sum(n-1);
    }
    // factorial using functional way
    static int fact(int n){
        if(n==1) return 1;
        return n*fact(n-1);
    }
}
