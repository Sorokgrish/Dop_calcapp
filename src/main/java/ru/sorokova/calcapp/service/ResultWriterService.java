package ru.sorokova.calcapp.service;

public class ResultWriterService {
    public static void printResult(double num1, double num2, double result, String operation) {

        System.out.println("Первое число: " + num1);
        System.out.println("Второе число: " + num2);
        System.out.println("Результат: " + result);
        System.out.println("Операция: " + operation);
    }
}
