package com.switchcases;
import java.util.Scanner;
public class swit {
    public static void main(String[] args)
    {
        Scanner obj=new Scanner(System.in);
       // String fruit=obj.next();
        /*switch(fruit)
        {
            case "mango":
                System.out.println("yellow fruit");
                break;
            case "apple":
                System.out.println("red fruit");
                break;
            case "grape":
                System.out.println("violet grape");
                break;
            case "orange":
                System.out.println("orange coloured fruit");
                break;
            default:
                break;

        }*/
        // by using if else condition
        /*if(fruit.equals("mango")){
            System.out.println("yellow");
        }
        else if(fruit.equals("orange")){
            System.out.println("orange colour");
        }
        else if(fruit.equals("grape")){
            System.out.println("violet");
        }*/
        // by using enhanced switch case
       /* switch(fruit)
        {
            case "mango"->System.out.println("yellow");
            case "grape"->System.out.println("violet");
            case "apple"->System.out.println("red");
            case "orange"->System.out.println("og colour");
            default->System.out.println("invalid input");
        }*/
        // to determine the weekdays and weekend
        int k=obj.nextInt();
        switch (k) {
            case 1, 2, 3, 4, 5 -> System.out.println("weekdays");
            case 6, 7 -> System.out.println("weekends");
            default -> System.out.println("invalid input");
        }
    }
}
