package com.oops.exception_handling;

import com.oops.Clone.labour;

import java.sql.SQLOutput;

public class Main {
    public static void main(String[] args) throws AmountCannotWithDrawnException, CloneNotSupportedException {
//        Account praveen=new Account(100);
//        System.out.println(praveen.getBalance());
//        praveen.withDrawMoney(99);
        labour lavanan=new labour("one",19);
        System.out.println(lavanan);
        labour praveen=(labour)(lavanan.Clone());
        System.out.println(praveen);
        praveen.arr[2]=49;
        System.out.println(lavanan);
        System.out.println(praveen);

    }
}
