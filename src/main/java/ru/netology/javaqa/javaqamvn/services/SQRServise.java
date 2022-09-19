package ru.netology.javaqa.javaqamvn.services;

public class SQRServise {
    public static int calculate(int min, int max) {
        int index = 0;
        for (int i = 10; i <= 99; i++) {
            if ((i * i >= min) && (i * i <= max)) {
                index++;
            }
        }
        return index;
    }
}
