package com.yuriybishel.model;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Objects;

public class BankAccount implements Comparable<BankAccount> {
    private String accountNumber;
    private String accountCode;
    private String ownerLastName;
    private double balance;
    private Date openingDate;
    private double annualInterestRate;

    public BankAccount() {
    }


    public BankAccount(String accountNumber, String accountCode, String ownerLastName, double balance, Date openingDate, double annualInterestRate) {
        this.accountNumber = accountNumber;
        this.accountCode = accountCode;
        this.ownerLastName = ownerLastName;
        this.balance = balance;
        this.openingDate = openingDate;
        this.annualInterestRate = annualInterestRate;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public String getAccountCode() {
        return accountCode;
    }

    public String getOwnerLastName() {
        return ownerLastName;
    }

    public double getBalance() {
        return balance;
    }

    public Date getOpeningDate() {
        return openingDate;
    }

    public double getAnnualInterestRate() {
        return annualInterestRate;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public void setAccountCode(String accountCode) {
        this.accountCode = accountCode;
    }

    public void setOwnerLastName(String ownerLastName) {
        this.ownerLastName = ownerLastName;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public void setOpeningDate(Date OpeningDate) {
        this.openingDate = OpeningDate;
    }

    public void setAnnualInterestRate(double annualInterestRate) {
        this.annualInterestRate = annualInterestRate;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        BankAccount that = (BankAccount) o;
        return accountNumber == that.accountNumber && accountCode == that.accountCode && Double.compare(that.balance, balance) == 0 && Double.compare(that.annualInterestRate, annualInterestRate) == 0 && Objects.equals(ownerLastName, that.ownerLastName) && Objects.equals(openingDate, that.openingDate);
    }

    @Override
    public int hashCode() {
        return Objects.hash(accountNumber, accountCode, ownerLastName, balance, openingDate, annualInterestRate);
    }

    @Override
    public String toString() {
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd.MM.yyyy");
        return "Account Number: " + accountNumber +
                "\nAccount Code: " + accountCode +
                "\nOwner Last Name: " + ownerLastName +
                "\nBalance: " + balance +
                "\nOpening Date: " + dateFormat.format(openingDate) +
                "\nAnnual Interest Rate: " + annualInterestRate;
    }

    @Override
    public int compareTo(BankAccount o) {
        if(this.accountNumber.equals(o.accountNumber)){
            if(this.openingDate.equals(o.openingDate)) {
                return this.ownerLastName.compareTo(o.ownerLastName);
            }
            return this.openingDate.compareTo(o.openingDate);
        }
        return this.accountNumber.compareTo(o.accountNumber);

    }
}
