 package com.statefarm;

public class BankAccount {

    private float cents = 0.0f;

    //Adds cents to the bank account
    public void deposit(long cents) {
        this.cents += cents;
    }

    //Removes cents from the bank account
    private void withdraw(long cents) {
        this.cents -= cents;
    }

    //Returns the current balance on the bank account
    private float balance() {
        return this.cents;
    }

    //Returns true if the balance on the account is negative
    private boolean isOverDrawn() {
        if (this.cents < 0) {
            return true;
        }
        return false;
    }
}
