package ru.lanit.framework.steps;

import org.testng.annotations.DataProvider;

/**
 * Класс с тестовыми даннными.
 */
public class TestData {
    /**
     * Данные для позитивного теста testPositiveSum.
     */
    @DataProvider
    public static Object[][] positiveSumData() {
        return new Object[][] {
                {2, 3, 5},
                {-3, -2, -5},
                {0.5, 3, 3.5},
                {Integer.MIN_VALUE, Integer.MAX_VALUE, -1}
        };
    }

    /**
     * Данные для позитивного теста testPositiveSub.
     */
    @DataProvider
    public static Object[][] positiveSubData() {
        return new Object[][] {
                {5, 3, 2},
                {-3, -2, -1},
                {0.5, 3, -2.5},
                {Integer.MAX_VALUE, Integer.MAX_VALUE, 0}
        };
    }

    /**
     * Данные для позитивного теста testPositiveMul.
     */
    @DataProvider
    public static Object[][] positiveMulData() {
        return new Object[][] {
                {5, 2, 10},
                {-3, 2, -6},
                {0.5, 3, 1.5},
        };
    }

    /**
     * Данные для позитивного теста testPositiveDiv.
     */
    @DataProvider
    public static Object[][] positiveDivData() {
        return new Object[][] {
                {9, 3, 3},
                {1.8, 2, 0.9},
                {-1.5, -2, 0.75},
                {Integer.MAX_VALUE, Integer.MAX_VALUE, 1}
        };
    }

    /**
     * Данные для негативного теста.
     */
    @DataProvider
    public static  Object[][] negativeData() {
        return new Object[][] {
                {2, 50, 0.555},
                {7777, 5555, 0},
                {0.5, -0.8, 5000}
        };
    }
}
