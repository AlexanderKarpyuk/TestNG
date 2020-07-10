package ru.lanit.testng;

import java.text.DecimalFormat;

public class Math {

    public static void main(String[] args) {
        Math math = new Math();
        System.out.println(math.divTest(2, 2));
        Object obj = math.divTest(2, 3);
        System.out.println((Double)obj + 1);
    }

    public Object sumTest(double one, double two) {
        System.out.println("Складываем " + one + " и " + two);
        DecimalFormat format = new DecimalFormat("0.#");
        return format.format(one + two);
    }

    public Object subTest(double one, double two) {
        System.out.println("Вычитаем " + one + " и " + two);
        DecimalFormat format = new DecimalFormat("0.#");
        return format.format(one - two);
    }

    public Object mulTest(double one, double two) {
        System.out.println("Умножаем " + one + " и " + two);
        DecimalFormat format = new DecimalFormat("0.#");
        return format.format(one * two);
    }

    public Object divTest(double one, double two) {
        System.out.println("Делим "+ one + " и " + two);
        DecimalFormat format = new DecimalFormat("0.#");
        return format.format(one / two);
    }
}
