package com.yuriybishel.util;

import com.yuriybishel.model.BankAccount;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Random;

public class Generator {
    private static Random random = new Random();

    public Generator() {
        this.random = new Random();
    }
    static SimpleDateFormat dateFormat = new SimpleDateFormat("dd.MM.yyyy");

    public static int generateInt(int min, int max) {
        return random.nextInt(max - min + 1) + min;
    }

    public static double generateDouble(double min, double max) {
        random = new Random();
        return min + (max - min) * random.nextDouble();
    }

    public static String generateAccountNumber() {
        return String.valueOf(generateInt(1000000000, 2000000000));
    }

    public static String generateAccountCode() {
        return String.valueOf(generateInt(1_000, 2_000));
    }

    public static String generateOwnerLastName() {
        return "Owner" + generateInt(1, 100);
    }

    public static Date generateOpeningDate() throws ParseException {
        int day = generateInt(1, 28);
        int month = generateInt(1, 12);
        int year = generateInt(2000, 2022);
        String dateString = String.format("%02d.%02d.%04d", day, month, year);
        return dateFormat.parse(dateString);
    }

    public static double generateAnnualInterestRate() {
        return generateDouble(0, 10);
    }
    public static BankAccount generateRandomBankAccount() throws ParseException {
        String accountNumber = generateAccountNumber();
        String accountCode = generateAccountCode();
        String ownerLastName = generateOwnerLastName();
        double balance = generateDouble(1, 9);
        Date openingDate = generateOpeningDate();
        double annualInterestRate = generateAnnualInterestRate();
        return new BankAccount(accountNumber, accountCode, ownerLastName, balance, openingDate, annualInterestRate);
    }
}
