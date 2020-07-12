package ru.lanit.testng;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class Math {
    public static void main(String[] args) {
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in)))
        {
            System.out.println("Вас приветствует калькулятор 2000. v0.1");
            System.out.println("\"ОАО Майкрософт\". Все права защищены.");
            getLoading();
//            while (true) {
//               System.out.println("Какую операцию хотите совершить?");
//               System.out.println(String.format("Для сложения введите %s, вычитания %s, умножения  %s, деления %s",
//                       "+", "-", "*", "/"));
//            }
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    /**
     * Метод сложения.
     * @param one - число.
     * @param two - число.
     * @return - возвращает сумму двух чисел.
     */
    public Object sumTest(Object one, Object two) {
        System.out.println("Складываем " + one + " и " + two);
        return (double)one + (double)two;
    }

    /**
     * Метод вычитания.
     * @param one - число.
     * @param two - число.
     * @return - возвращает разницу двух чисел.
     */
    public Object subTest(Object one, Object two) {
        System.out.println("Вычитаем " + one + " и " + two);
        return (double)one - (double)two;
    }

    /**
     * Метод умножения.
     * @param one - множимое.
     * @param two - множитель.
     * @return - возвращает произведение двух чисел.
     */
    public Object mulTest(Object one, Object two) {
        System.out.println("Умножаем " + one + " и " + two);
        return (double)one * (double)two;
    }

    /**
     * Метод деления.
     * @param one - делимое число.
     * @param two - число делитель.
     * @return - возвращает частное двух чисел.
     */
    public Object divTest(Object one, Object two) {
        System.out.println("Делим " + one + " и " + two);
        return (double)one / (double)two;
    }

    /**
     * Выводит в консоль имитацию загрузки.
     */
    private static void getLoading() {
        String load = "";
        System.out.print("Загрузка: ");
        for (int i = 0; i <= 100; i+=20) {
            System.out.print(load + "|||");
            try {
                Thread.sleep(800);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println();
    }
}
