package com.mycompany.project5;

public class Savings extends Account{
    // List of properties specific to the Savings account
    private int safetyDepositBoxID;
    private int safetyDepositBoxKey;

    // Constructor to initialize settings for the Savings properties
    public Savings(String name, String sSN, double initDeposit){
        super(name, sSN, initDeposit);
        accountNumber = "1" + accountNumber;
        setSafetyDepositBox();
    }

    @Override
    public void setRate(){
        rate = getBaseRate() - 0.25;
    }

    private void setSafetyDepositBox(){
        this.safetyDepositBoxID = (int) (Math.random() * Math.pow(10,3));
        this.safetyDepositBoxKey = (int) (Math.random() * Math.pow(10,4));
    }

    // List any methods specific to Savings account
    public void showInfo(){
        super.showInfo();
        System.out.println(
                " Your Savings Account Features"
                +"\n Safety Deposit Box ID: " + this.safetyDepositBoxID
                +"\n Safety Deposit Box Key: " + this.safetyDepositBoxKey
        );
    }
}
