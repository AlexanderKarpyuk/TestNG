package ru.lanit.framework.steps;


import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import ru.lanit.testng.Math;


/**
 * Юнит тесты для класса Math.
 */
public class MathTest extends Assert {
    Math math;

    @BeforeClass
    public void setUp() {
        System.out.println("Подготовка перед тестами");
        math = new Math();
    }

    @AfterClass
    public void tearDown() {
        System.out.println("Подчищаем после тестов");
    }

    /**
     * Позитивынй тест для метода сложения - sumTest().
     * @param one Входной параметр №1 для тестируемого метода.
     * @param two Входной параметр №2 для тестируемого метода.
     * @param three Ожидаемое значение.
     */
    @Test(dataProvider = "positiveSumData", dataProviderClass = TestData.class)
    public void testPositiveSum(double one, double two, double three) {
        double result = math.sumTest(one, two);
        assertEquals(result, three, "Значения не равны");
        System.out.println(String.format("Результат выполнения: %f Ожидаемый результат: %f", result, three));
    }

    /**
     * Негативный тест для метода сложения - sumTest().
     * @param one Входной параметр №1 для тестируемого метода.
     * @param two Входной параметр №2 для тестируемого метода.
     *            Ожидаемый результат: выброс исключения.
     */
    @Test(dataProvider = "negativeData", dataProviderClass = TestData.class)
    public void testNegativeSum(double one, double two, double three) {
        double result = math.sumTest(one, two);
        assertNotEquals(result, three, "Значения равны!");
        System.out.println(String.format("Результат выполнения: %f Результат не должен совпасть с: %f",
                result, three));
    }

    /**
     * Позитивынй тест для метода вычитания - subTest().
     * @param one Входной параметр №1 для тестируемого метода.
     * @param two Входной параметр №2 для тестируемого метода.
     * @param three Ожидаемое значение.
     */
    @Test(dataProvider = "positiveSubData", dataProviderClass = TestData.class)
    public void testPositiveSub(double one, double two, double three) {
        double result = math.subTest(one, two);
        assertEquals(result, three, "Значения не равны");
        System.out.println(String.format("Результат выполнения: %f Ожидаемый результат: %f", result, three));
    }

    /**
     * Негативный тест для метода вычитания - subTest().
     * @param one Входной параметр №1 для тестируемого метода.
     * @param two Входной параметр №2 для тестируемого метода.
     *            Ожидаемый результат: выброс исключения.
     */
    @Test(dataProvider = "negativeData", dataProviderClass = TestData.class)
    public void testNegativeSub(double one, double two, double three) {
        double result = math.subTest(one, two);
        assertNotEquals(result, three, "Значения равны!");
        System.out.println(String.format("Результат выполнения: %f Результат не должен совпасть с: %f",
                result, three));
    }

    /**
     * Позитивынй тест для метода умножения - mulTest().
     * @param one Входной параметр №1 для тестируемого метода.
     * @param two Входной параметр №2 для тестируемого метода.
     * @param three Ожидаемое значение.
     */
    @Test(dataProvider = "positiveMulData", dataProviderClass = TestData.class)
    public void testPositiveMul(double one, double two, double three) {
        double result = math.mulTest(one, two);
        assertEquals(result, three, "Значения не равны");
        System.out.println(String.format("Результат выполнения: %f Ожидаемый результат: %f", result, three));
    }

    /**
     * Негативный тест для метода умножения - mulTest().
     * @param one Входной параметр №1 для тестируемого метода.
     * @param two Входной параметр №2 для тестируемого метода.
     *            Ожидаемый результат: выброс исключения.
     */
    @Test(dataProvider = "negativeData", dataProviderClass = TestData.class)
    public void testNegativeMul(double one, double two, double three) {
        double result = math.mulTest(one, two);
        assertNotEquals(result, three, "Значения равны!");
        System.out.println(String.format("Результат выполнения: %f Результат не должен совпасть с: %f",
                result, three));
    }

    /**
     * Позитивынй тест для метода деления - divTest().
     * @param one Входной параметр №1 для тестируемого метода.
     * @param two Входной параметр №2 для тестируемого метода.
     * @param three Ожидаемое значение.
     */
    @Test(dataProvider = "positiveDivData", dataProviderClass = TestData.class)
    public void testPositiveDiv(double one, double two, double three) {
        double result = math.divTest(one, two);
        assertEquals(result, three, "Значения не равны");
        System.out.println(String.format("Результат выполнения: %f Ожидаемый результат: %f", result, three));
    }

    /**
     * Негативный тест для метода деления - divTest().
     * @param one Входной параметр №1 для тестируемого метода.
     * @param two Входной параметр №2 для тестируемого метода.
     *            Ожидаемый результат: выброс исключения.
     */
    @Test(dataProvider = "negativeData", dataProviderClass = TestData.class)
    public void testNegativeDiv(double one, double two, double three) {
        double result = math.divTest(one, two);
        assertNotEquals(result, three, "Значения равны!");
        System.out.println(String.format("Результат выполнения: %f Результат не должен совпасть с: %f",
                result, three));
    }
}
