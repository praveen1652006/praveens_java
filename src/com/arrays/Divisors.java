package com.arrays;
import java.util.List;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
public class Divisors{
    public static List< Integer > printDivisors(int n) {
        ArrayList <Integer>d=new ArrayList<>();
        for(int i=1;i<=Math.sqrt(n);i++) {
            if (n % i == 0) {
                d.add(i);
                if (n / i != i) {
                    d.add(n / i);
                }
            }

        }
        Collections.sort(d);
        return d;
    }
    public static void main(String[] args){
        Scanner obj=new Scanner (System.in);
        int n=obj.nextInt();
        List<Integer> k=printDivisors(n);
        System.out.println(k);
    }
}
