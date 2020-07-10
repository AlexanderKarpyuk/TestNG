package ru.lanit.testng;

public class Math {

    public Object sumTest(Double one, Double two) {
        System.out.println("Складываем " + one + " и " + two);
        return one + two;
    }

    public Object subTest(Double one, Double two) {
        System.out.println("Вычитаем " + one + " и " + two);
        return one - two;
    }

    public Object mulTest(Double one, Double two) {
        System.out.println("Умножаем " + one + " и " + two);
        return one * two;
    }

    public Object divTest(Double one, Double two) {
        System.out.println("Делим " + one + " и " + two);
        return one / two;
    }
}
