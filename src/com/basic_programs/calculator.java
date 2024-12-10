package com.basic_programs;
import java.util.Scanner;
//import java.util.concurrent.StructureViolationException;

public class calculator {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        while (true) {
            int ans = 0;
            System.out.println("Enter the character:");
            char ch = obj.next().trim().charAt(0);
            if (ch == '+' || ch == '-' || ch == '*' || ch == '/' || ch == '%') {
                System.out.println("enter two numbers:");
                int a = obj.nextInt();
                int b = obj.nextInt();
                if (ch == '+') {
                    ans = a + b;
                }
                if (ch == '-') {
                    ans = a - b;
                }
                if (ch == '*') {
                    ans = a * b;
                }
                if (ch == '/') {
                    ans = a / b;
                }
                if (ch == '%') {
                    ans = a % b;
                }
            }
                else if (ch == 'x' || ch == 'X') {
                    break;
                } else {
                System.out.println("invalid operation");
            }
            System.out.println(ans);

        }
    }
}
