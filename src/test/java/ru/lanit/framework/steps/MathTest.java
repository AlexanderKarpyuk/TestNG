package ru.lanit.framework.steps;


import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import ru.lanit.testng.Math;

public class MathTest extends Assert {

    @BeforeClass
    public void setUp() {
        System.out.println("Подготовка перед тестами");
    }

    @AfterClass
    public void tearDown() {
        System.out.println("Подчищаем после тестов");
    }

    @Test(dataProvider = "positiveSumData", dataProviderClass = TestData.class)
    public void testPositiveSum(double one, double two, double three) {
        assertEquals(new Math().sumTest(one, two), three, "Значения не равны");
    }

    @Test(dataProvider = "negativeData", dataProviderClass = TestData.class,
            expectedExceptions = {NullPointerException.class, ClassCastException.class}
    )
    public void testNegativeSum(Object one, Object two) {
        new Math().sumTest(one, two);
    }

    @Test(dataProvider = "positiveSubData", dataProviderClass = TestData.class)
    public void testPositiveSub(double one, double two, double three) {
        assertEquals(new Math().subTest(one, two), three, "Значения не равны");
    }

    @Test(dataProvider = "negativeData", dataProviderClass = TestData.class,
            expectedExceptions = {NullPointerException.class, ClassCastException.class}
    )
    public void testNegativeSub(Object one, Object two) {
        new Math().subTest(one, two);
    }

    @Test(dataProvider = "positiveMulData", dataProviderClass = TestData.class)
    public void testPositiveMul(double one, double two, double three) {
        assertEquals(new Math().mulTest(one, two), three, "Значения не равны");
    }

    @Test(dataProvider = "negativeData", dataProviderClass = TestData.class,
            expectedExceptions = {NullPointerException.class, ClassCastException.class}
    )
    public void testNegativeMul(Object one, Object two) {
        new Math().mulTest(one, two);
    }

    @Test(dataProvider = "positiveDivData", dataProviderClass = TestData.class)
    public void testPositiveDiv(double one, double two, double three) {
        assertEquals(new Math().divTest(one, two), three, "Значения не равны");
    }

    @Test(dataProvider = "negativeData", dataProviderClass = TestData.class,
            expectedExceptions = {NullPointerException.class, ClassCastException.class}
    )
    public void testNegativeDiv(Object one, Object two) {
        new Math().divTest(one, two);
    }
}
