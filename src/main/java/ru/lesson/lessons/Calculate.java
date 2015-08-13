package ru.lesson.lessons;

public class Calculate {
    /**
     * Простой калькулятор, берет значения из входноного массива
     */
    public static void main(String[] arg) {
        System.out.println("Calculate...");
        int first = Integer.valueOf(arg[0]);
        int second = Integer.valueOf(arg[1]);
        int sum = first + second;
        System.out.println("Sum : " + sum);
    }
}