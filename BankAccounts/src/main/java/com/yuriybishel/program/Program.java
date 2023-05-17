package com.yuriybishel.program;

import com.yuriybishel.model.BankAccount;
import com.yuriybishel.model.BankAccountList;
import com.yuriybishel.util.Generator;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Comparator;
import java.util.Date;

public class Program {
    public static void main(String[] args) throws ParseException {
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd.MM.yyyy");

        BankAccount account1 = new BankAccount("1234567890", "001", "Ivanov", 1000.0, dateFormat.parse("20.01.2005"), 2.5);
        BankAccount account2 = new BankAccount("0987654321", "002", "Petrov", 2000.0, dateFormat.parse("20.01.2005"), 2.5);
        BankAccount account3 = new BankAccount("1357924680", "003", "Sidorov", 3000.0, dateFormat.parse("20.01.2005"), 2.0);
        BankAccount account4 = new BankAccount("2468013579", "004", "Kuznetsov", 4000.0, dateFormat.parse("10.09.2015"), 1.5);
        BankAccount account5 = new BankAccount("3692581470", "005", "Smirnov", 5000.0, dateFormat.parse("10.09.2007"), 1.0);
        BankAccount account6 = new BankAccount("4801673259", "006", "Novikov", 6000.0, dateFormat.parse("10.09.2015"), 3.5);
        BankAccount account7 = new BankAccount("5926837140", "007", "Fedorov", 7000.0, dateFormat.parse("09.09.2012"), 2.0);
        BankAccount account8 = new BankAccount("7165924830", "008", "Makarov", 8000.0, dateFormat.parse("10.09.2013"), 1.5);
        BankAccount account9 = new BankAccount("8241759360", "009", "Ibragimov", 9000.0, dateFormat.parse("10.09.2015"), 2.0);
        BankAccount account10 = new BankAccount("9374625180", "010", "Kovalenko", 10000.0, dateFormat.parse("10.09.2011"), 1.0);

        System.out.println(account1);
        System.out.println(account2);
        System.out.println(account3);
        System.out.println(account4);
        System.out.println(account5);
        System.out.println(account6);
        System.out.println(account7);
        System.out.println(account8);
        System.out.println(account9);
        System.out.println(account10);

        BankAccountList list = new BankAccountList();
        list.addBankAccount(account1);
        list.addBankAccount(account2);
        list.addBankAccount(account3);
        list.addBankAccount(account4);
        list.addBankAccount(account5);
        list.addBankAccount(account6);
        list.addBankAccount(account8);
        list.addBankAccount(account9);
        list.addBankAccount(account10);


        Comparator<BankAccount> sortByAccountNumber = new Comparator<BankAccount>() {
            @Override
            public int compare(BankAccount o1, BankAccount o2) {
                return o1.getAccountNumber().compareTo(o2.getAccountNumber());
            }
        };
        list.getAccounts().sort(sortByAccountNumber);
        System.out.println("\nСОРТИРОВКА ПО НОМЕРУ СЧЕТА\n");
        System.out.println(list.getAccounts().toString());


        Comparator<BankAccount> accountCodeComparator = new Comparator<BankAccount>() {
            @Override
            public int compare(BankAccount o1, BankAccount o2) {
                return o1.getAccountCode().compareTo(o2.getAccountCode());
            }
        };
        list.getAccounts().sort(accountCodeComparator);
        System.out.println("\nСОРТИРОВКА ПО КОДУ\n");
        System.out.println(list.getAccounts().toString());


        Comparator<BankAccount> OwnerLastNameComparator = new Comparator<BankAccount>() {
            @Override
            public int compare(BankAccount o1, BankAccount o2) {
                return o1.getOwnerLastName().compareTo(o2.getOwnerLastName());
            }
        };
        list.getAccounts().sort(OwnerLastNameComparator);
        System.out.println("\nСОРТИРОВКА ПО ФАМИЛИИ\n");
        System.out.println(list.getAccounts().toString());


        Comparator<BankAccount> BalanceComparator = new Comparator<BankAccount>() {
            @Override
            public int compare(BankAccount o1, BankAccount o2) {
                return Double.compare(o1.getBalance(), o2.getBalance());
            }
        };
        list.getAccounts().sort(BalanceComparator);
        System.out.println("\nСОРТИРОВКА ПО БАЛАНСУ\n");
        System.out.println(list.getAccounts().toString());


        Comparator<BankAccount> openingDateComparator = new Comparator<BankAccount>() {
            @Override
            public int compare(BankAccount o1, BankAccount o2) {
                return o1.getOpeningDate().compareTo(o2.getOpeningDate());
            }
        };
        list.getAccounts().sort(BalanceComparator);
        System.out.println("\nСОРТИРОВКА ПО ДАТЕ\n");
        System.out.println(list.getAccounts().toString());


        Comparator<BankAccount> annualInterestRateComparator = new Comparator<BankAccount>() {
            @Override
            public int compare(BankAccount o1, BankAccount o2) {
                return Double.compare(o1.getAnnualInterestRate(), o2.getAnnualInterestRate());
            }
        };
        list.getAccounts().sort(annualInterestRateComparator);
        System.out.println("\nСОРТИРОВКА ПО ПРОЦЕНТАМ\n");
        System.out.println(list.getAccounts().toString());

        int i = account3.compareTo(account2);
        System.out.println(i);


        /*BankAccountList list = new BankAccountList();
        for (int i = 0; i < 10; i++) {
            BankAccount account = Generator.generateRandomBankAccount();
            list.addBankAccount(account);
            System.out.println(list.getAccounts().toString());*/
        }
    }

