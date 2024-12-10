package com.arrays;

public class pattern_printing {
    public static void main(String[] args) {
        //pattern();
       // pattern1();
        square(5);
    }

    static void pattern() {
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5 - i - 1; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j < 2 * i + 1; j++) {
                System.out.print("*" + " ");
            }
            for (int j = 0; j < 5 - i - 1; j++) {
                System.out.print(" ");
            }
            System.out.println();
        }
    }

    static void pattern1() {
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j < 2 * (5 - i) - 1; j++) {
                System.out.print("*" + " ");
            }
            for (int j = 0; j < i; j++) {
                System.out.print(" ");
            }
            System.out.println();
        }
        }

    static void pattern2(int n) {
        for (int i = 1; i <= 2 * n - 1; i++) {
            int s = i;
            if (s > n) {
                i = 2 * n - i;
            }
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
    static void pattern3() {
        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= i; j++) {
                int x = j % 2;
                System.out.print(x);
            }
            System.out.println();
        }
    }
    static void pattern4(int n) {
        int start = 1;
        for (int i = 1; i <= n; i++) {
            if (i % 2 == 0) start = 0;
            else start = 1;
            for (int j = 1; j <= i; j++) {
                System.out.print(start);
                start = 1 - start;
            }
            System.out.println();
        }
    }
    static void pattern5(int n) {

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j);
            }
            for (int j = 1; j < 2 * n - (2 * i); j++) {
                System.out.print(" ");
            }
            for (int j = i; j >= 1; j--) {
                System.out.print(j);
            }
            System.out.println();
        }
    }
    static void pattern6(int n) {
        for (int i = 1; i <= n; i++) {
            for (char j = 'A'; j <= 'A' + i; j++) {
                System.out.print(j);
            }
            System.out.println();
        }
    }
    static void pattern7(int n) {
        for (int i = 1; i <= n; i++) {
            for (char j = 'A'; j <= 'A'+n-i; j++) {
                System.out.print(j);
            }
            System.out.println();
        }
    }
    static void pattern8(int n) {
        for (int i = 0; i < n; i++) {
            char c= (char) ('A'+i);
            for (char j = 0; j <=i; j++) {
                System.out.print(c);

            }
            System.out.println();
        }
    }
    static void patternk(int n) {
        for (int i = 1; i <=n; i++) {
            for (int j = 1; j <= n - i; j++) {
                System.out.print("-");
            }
            char ch='A';
            for (int j = 1; j <= 2 * (i-1) + 1; j++) {
                System.out.print(ch);
                if(j<i)ch++;
                else ch--;
            }
            for (int j = 1; j <=n - i; j++) {
                System.out.print("-");
            }
            System.out.println();
        }
    }
    static void p(int n){
        //char j;
        for(int i=0;i<=n;i++) {
            for(char j=(char)('E'-i);j<='E';j++){
                System.out.print(j);
            }
            System.out.println();

        }
    }
    static void patternf(int n){
        for(int i=1;i<=n;i++){
            for(int j=n;j>=i;j--){
                System.out.print("*");
            }
            for(int j=0;j<2*i-2;j++){
                System.out.print("-");
            }
            for(int j=n;j>=i;j--){
                System.out.print("*");
            }
            System.out.println();
        }
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
            for(int j=1;j<=2*n-(2*i);j++){
                System.out.print("-");
            }
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        }

    }
    static void pattern100(int n){
        int k=2*n-1;int e;
        for(int i=1;i<=k;i++){
            int s=i;
            if(s>n) s=2*n-i;
            for(int j=1;j<=s;j++) {
                System.out.print("*");
            }
            int x=2*n-2*i;
            if(i>n) x=2*i-2*n;
            for(int j=1;j<=x;j++){
                System.out.print("-");
            }
            for(int j=1;j<=s;j++) {
                System.out.print("*");
            }
            System.out.println();
        }

    }
    static void square(int n){
        for(int i=1;i<=n;i++){
            for(int j=1;j<=n;j++) {
                if (i == 1 || j == 1 || j == n  || i == n ) System.out.print("*");
                else System.out.print("-");
            }
            System.out.println();
        }
    }

}


