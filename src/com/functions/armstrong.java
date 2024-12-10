package com.functions;
public class armstrong {
    public static void main(String[] args) {
        for(int i=151;i<1000;i++){
            if(isArmstrong(i)){
                System.out.println(i);
            }
        }
    }
    static boolean isArmstrong(int n) {
        int og = n;
        int sum = 0, rem;
        while (n > 0) {
            rem = n % 10;
            sum = sum + (rem * rem * rem);
            n = n / 10;
        }
        return og == sum;
    }
}
