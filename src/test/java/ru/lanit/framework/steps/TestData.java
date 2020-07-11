package ru.lanit.framework.steps;

import org.testng.annotations.DataProvider;

public class TestData {
    @DataProvider
    public static Object[][] positiveSumData() {
        return new Object[][] {
                {2, 3, 5},
                {-3, -2, -5},
                {0.5, 3, 3.5},
                {Integer.MIN_VALUE, Integer.MAX_VALUE, -1}
        };
    }

    @DataProvider
    public static Object[][] positiveSubData() {
        return new Object[][] {
                {5, 3, 2},
                {-3, -2, -1},
                {0.5, 3, -2.5},
                {Integer.MAX_VALUE, Integer.MAX_VALUE, 0}
        };
    }

    @DataProvider
    public static Object[][] positiveMulData() {
        return new Object[][] {
                {5, 2, 10},
                {-3, 2, -6},
                {0.5, 3, 1.5},
        };
    }

    @DataProvider
    public static Object[][] positiveDivData() {
        return new Object[][] {
                {9, 3, 3},
                {1.8, 2, 0.9},
                {-1.5, -2, 0.75},
                {Integer.MAX_VALUE, Integer.MAX_VALUE, 1}
        };
    }

    @DataProvider
    public static  Object[][] negativeData() {
        return new Object[][] {
                {"string", 2},
                {null, 2},
                {null,"string"}
        };
    }
}
