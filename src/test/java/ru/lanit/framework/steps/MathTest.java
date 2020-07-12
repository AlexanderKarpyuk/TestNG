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

    @BeforeClass
    public void setUp() {
        System.out.println("Подготовка перед тестами");
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
        assertEquals(new Math().sumTest(one, two), three, "Значения не равны");
    }

    /**
     * Негативный тест для метода сложения - sumTest().
     * @param one Входной параметр №1 для тестируемого метода.
     * @param two Входной параметр №2 для тестируемого метода.
     *            Ожидаемый результат: выброс исключения.
     */
    @Test(dataProvider = "negativeData", dataProviderClass = TestData.class,
            expectedExceptions = {NullPointerException.class, ClassCastException.class}
    )
    public void testNegativeSum(Object one, Object two) {
        new Math().sumTest(one, two);
    }

    /**
     * Позитивынй тест для метода вычитания - subTest().
     * @param one Входной параметр №1 для тестируемого метода.
     * @param two Входной параметр №2 для тестируемого метода.
     * @param three Ожидаемое значение.
     */
    @Test(dataProvider = "positiveSubData", dataProviderClass = TestData.class)
    public void testPositiveSub(double one, double two, double three) {
        assertEquals(new Math().subTest(one, two), three, "Значения не равны");
    }

    /**
     * Негативный тест для метода вычитания - subTest().
     * @param one Входной параметр №1 для тестируемого метода.
     * @param two Входной параметр №2 для тестируемого метода.
     *            Ожидаемый результат: выброс исключения.
     */
    @Test(dataProvider = "negativeData", dataProviderClass = TestData.class,
            expectedExceptions = {NullPointerException.class, ClassCastException.class}
    )
    public void testNegativeSub(Object one, Object two) {
        new Math().subTest(one, two);
    }

    /**
     * Позитивынй тест для метода умножения - mulTest().
     * @param one Входной параметр №1 для тестируемого метода.
     * @param two Входной параметр №2 для тестируемого метода.
     * @param three Ожидаемое значение.
     */
    @Test(dataProvider = "positiveMulData", dataProviderClass = TestData.class)
    public void testPositiveMul(double one, double two, double three) {
        assertEquals(new Math().mulTest(one, two), three, "Значения не равны");
    }

    /**
     * Негативный тест для метода умножения - mulTest().
     * @param one Входной параметр №1 для тестируемого метода.
     * @param two Входной параметр №2 для тестируемого метода.
     *            Ожидаемый результат: выброс исключения.
     */
    @Test(dataProvider = "negativeData", dataProviderClass = TestData.class,
            expectedExceptions = {NullPointerException.class, ClassCastException.class}
    )
    public void testNegativeMul(Object one, Object two) {
        new Math().mulTest(one, two);
    }

    /**
     * Позитивынй тест для метода деления - divTest().
     * @param one Входной параметр №1 для тестируемого метода.
     * @param two Входной параметр №2 для тестируемого метода.
     * @param three Ожидаемое значение.
     */
    @Test(dataProvider = "positiveDivData", dataProviderClass = TestData.class)
    public void testPositiveDiv(double one, double two, double three) {
        assertEquals(new Math().divTest(one, two), three, "Значения не равны");
    }

    /**
     * Негативный тест для метода деления - divTest().
     * @param one Входной параметр №1 для тестируемого метода.
     * @param two Входной параметр №2 для тестируемого метода.
     *            Ожидаемый результат: выброс исключения.
     */
    @Test(dataProvider = "negativeData", dataProviderClass = TestData.class,
            expectedExceptions = {NullPointerException.class, ClassCastException.class}
    )
    public void testNegativeDiv(Object one, Object two) {
        new Math().divTest(one, two);
    }
}
