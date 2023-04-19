package ru.netology.services;

public class VacationCalcService {
    public int calculateRestMonths(int income, int expenses, int threshold) {
        int restMonths = 0;
        int balance = 0;
        for (int month = 1; month <= 12; month++) {
            balance += income - expenses;
            if (balance >= threshold && restMonths < 3) {
                restMonths++;
                balance -= expenses + expenses * 2;
            }
        }
        return restMonths;
    }
}