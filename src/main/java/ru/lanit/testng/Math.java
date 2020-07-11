package ru.lanit.testng;

public class Math {

    public Object sumTest(Object one, Object two) {
        System.out.println("Складываем " + one + " и " + two);
        return (double)one + (double)two;
    }

    public Object subTest(Object one, Object two) {
        System.out.println("Вычитаем " + one + " и " + two);
        return (double)one - (double)two;
    }

    public Object mulTest(Object one, Object two) {
        System.out.println("Умножаем " + one + " и " + two);
        return (double)one * (double)two;
    }

    public Object divTest(Object one, Object two) {
        System.out.println("Делим " + one + " и " + two);
        return (double)one / (double)two;
    }
}
