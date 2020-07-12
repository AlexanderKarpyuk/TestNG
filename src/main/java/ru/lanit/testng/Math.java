package ru.lanit.testng;

import ru.lanit.testng.exceptions.IncorrectInputException;
import ru.lanit.testng.exceptions.OperatorNotFoundException;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.text.DecimalFormat;
import java.text.NumberFormat;

/**
 * Класс калькулятор, считывет с консоли математический оператор и два числа.
 * На основании которых производит вычисления и выводит результат в консоль.
 */
public class Math {
    public static void main(String[] args) {
        Math math = new Math();
        NumberFormat numberFormat = new DecimalFormat("0.#");

        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in)))
        {
            System.out.println("Вас приветствует калькулятор 2000. v0.1");
            System.out.println("\"ОАО Майкрософт\". Все права защищены.");
            getLoading();
            System.out.println("Внимание! Это альфа версия, пока доступны только 4 операции: " +
                    "сложение, вычитание, умножение и деление.");
            System.out.println("Для выхода из калькулятора введите exit");
            System.out.println("Введите выражение (с пробелами!) в формате: \"120 / 3\"");

            String tmp;

            //Бесконечный цикл, поку в консоль не будет введено "exit"
            while(!(tmp = reader.readLine()).equals("exit")) {
                String[] console = tmp.split("\\s");
                double d1, d2, result;
                String operator = null;

                //Парсинг значени в дабл, поиск оператора, в случае неудачи выкидывается исключение, цикл повторяется.
                try {
                    if (console.length < 3) {
                        throw new IncorrectInputException();
                    }
                    operator = console[1];
                    d1 = Double.parseDouble(console[0]);
                    d2 = Double.parseDouble(console[2]);
                    switch (operator) {
                        case "+" :
                            System.out.println(numberFormat.format(math.sumTest(d1, d2)));
                            break;
                        case "-" :
                            System.out.println(numberFormat.format(math.subTest(d1, d2)));
                            break;
                        case "*" :
                            System.out.println(numberFormat.format(math.mulTest(d1, d2)));
                            break;
                        case "/" :
                            System.out.println(numberFormat.format(math.divTest(d1, d2)));
                            break;
                        default:
                            //Кастомный эксепшн
                            throw new OperatorNotFoundException();
                    }
                } catch (NumberFormatException e) {
                    System.out.println("Вероятно вы ввели не числа. Попробуйте снова.");
                } catch (OperatorNotFoundException e) {
                    System.out.println("Оператор \"" + operator + "\" не найден. Попробуйте снова.");
                } catch (IncorrectInputException e) {
                    System.out.println("Введено недостаточно параметров или вы забыли пробелы. Попробуйте снова.");
                }
            }
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
    public double sumTest(double one, double two) {
        System.out.println("Складываем " + one + " и " + two);
        return one + two;
    }

    /**
     * Метод вычитания.
     * @param one - число.
     * @param two - число.
     * @return - возвращает разницу двух чисел.
     */
    public double subTest(double one, double two) {
        System.out.println("Из " + one + " вычитаем " + two);
        return one - two;
    }

    /**
     * Метод умножения.
     * @param one - множимое.
     * @param two - множитель.
     * @return - возвращает произведение двух чисел.
     */
    public double mulTest(double one, double two) {
        System.out.println("Умножаем " + one + " на " + two);
        return one * two;
    }

    /**
     * Метод деления.
     * @param one - делимое число.
     * @param two - число делитель.
     * @return - возвращает частное двух чисел.
     */
    public double divTest(double one, double two) {
        System.out.println("Делим " + one + " на " + two);
        return one / two;
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
