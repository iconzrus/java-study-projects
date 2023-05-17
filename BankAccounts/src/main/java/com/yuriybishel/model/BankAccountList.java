package com.yuriybishel.model;

import java.util.ArrayList;
import java.util.Date;

public class BankAccountList {
    private ArrayList<BankAccount> accounts;

    public BankAccountList() {
        accounts = new ArrayList<BankAccount>();
    }

    public ArrayList<BankAccount> getAccounts() {
        return accounts;
    }

    public BankAccount getBankAccountByNumber(String AccountNumber) {
        for (BankAccount account : accounts) {
            if (account.getAccountNumber().equals(AccountNumber)) {
                return account;
            }
        }
        return null;
    }

    public BankAccount getBankAccountByDate(Date date) {
        for (BankAccount account : accounts) {
            if (account.getOpeningDate().equals(date)) {
                return account;
            }
        }
        return null;
    }

    public BankAccount getBankAccountByOwner(String name) {
        for (BankAccount account : accounts) {
            if (account.getOwnerLastName().equals(name)) {
                return account;
            }
        }
        return null;
    }

    public void addBankAccount(BankAccount account) {
        this.accounts.add(account);
    }
}

