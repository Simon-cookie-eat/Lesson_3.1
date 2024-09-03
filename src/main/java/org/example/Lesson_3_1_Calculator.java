package org.example;

public class Lesson_3_1_Calculator {

    public int sum(int a, int b){
        int result = a + b;
        System.out.printf("Сумма %d и %d равна %d\n", a, b, result);
        return result;
    }

    public int sub(int a, int b){
        int result = a - b;
        System.out.printf("Разность %d и %d равна %d\n", a, b, result);
        return result;
    }

    public int mult(int a, int b){
        int result = a * b;
        System.out.printf("Произведение %d и %d равно %d\n", a, b, result);
        return result;
    }

    public int div(int a, int b){
        int result = a / b;
        System.out.printf("Частное %d и %d равно %d\n", a, b, result);
        return result;
    }

}
