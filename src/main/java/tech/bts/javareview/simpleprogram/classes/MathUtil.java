package tech.bts.javareview.simpleprogram.classes;

public class MathUtil {

    public static double power(double base, double exponent) {

        double result = 1;

        for (int i = 1; i < exponent; i++) {
            result = result * base;
        }

        return result;
    }

    public static double factorial(double n) {

        double result = 1;

        for (int i = 0; i <= n; i++) {
            result = result * i;

        }

        return result;
    }
}
