package ru.sorokova.calcapp._main;

import ru.sorokova.calcapp.service.ResultWriterService;
import ru.sorokova.calcapp.util.Calculator;

public class _Main {
    public static void main(String[] args) {
        double num1 = 10;
        double num2 = 5;
 
        // Вычисляем сумму
        double sumResult = Calculator.sum(num1, num2);  //метод add это метод сложения
        // Печатаем результат сложения
        ResultWriterService.printResult(num1, num2, sumResult, "Сложение");

        // Вычисляем разность
        double differenceResult = Calculator.subtract(num1, num2);
        // Печатаем результат вычитания
        ResultWriterService.printResult(num1, num2, differenceResult, "Вычитание");

        // Вычисляем произведение
        double productResult = Calculator.multiply(num1, num2);
        // Печатаем результат умножения
        ResultWriterService.printResult(num1, num2, productResult, "Умножение");
    }

    }

