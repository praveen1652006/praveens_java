package com.oops.exception_handling;

public class Account {
    private double balance;
    private double withDraw;

    Account(double balance) {
        this.balance = balance;
    }

    public void setBalance(int money) {
        this.balance = money;
    }

    public double getBalance() {
        return balance;
    }

    public void withDrawMoney(int drawMoney) throws AmountCannotWithDrawnException {
        try {
            double wD = this.balance - drawMoney;
            if (this.balance < drawMoney) {
                throw new AmountCannotWithDrawnException();
            }
            else{
                System.out.println("Amount is withDrawn ="+drawMoney+"Balance:"+wD);
            }
        } catch (AmountCannotWithDrawnException e) {
            System.out.println("not enough money to withdraw");
        }

    }
}


