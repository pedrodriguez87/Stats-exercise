package tech.bts.javareview.simpleprogram;

import tech.bts.javareview.simpleprogram.classes.MathUtil;

import java.util.*;

public class Main {

    public static void main(String[] args) {

        System.out.println("hello world");

        //Create a variable
        int age;
        double price;

        // Assign a value
        age = 15;

        // Declare and assign
        double weight = 40.5;

        if (age>=18) {
            System.out.println("adult");
        }else if (age>=13){
            System.out.println("teenager");
        }else{
            System.out.println("kid");
        }

        int i = 1;
        while (i <= 10) {
            System.out.println(i);
            i++;
        }

        for (int j = 0; j <= 10; j++) {

        }

        List<String> names = new ArrayList<>();
        names.add("apple");
        names.add("peer");

        System.out.println(names.get(0));


        // Create a immutable list with some values
        List<Integer> numbers =
                Arrays.asList(8,4,6,5);

        Map<String, Integer> ages = new HashMap<>();
        ages.put("john", 30);
        ages.put("Mary", 25);

        System.out.println( ages.get("john"));

        // "final" double sirve para decir que ese es el valor final
        // de la variable y que no puede cambiar

        final double price2 = 200;
        final double discount = 20;
        final double finalPrice = price2 - discount;
        // Cant do it: finalPrice = price;

        //Para llamar una funcion
        printHello("john", 25);
        printHello("Maria", 31);

        final double p = MathUtil.power(2, 10);
        System.out.println("2*10 = " + p);
    }

    static double power(double base, double exponent) {

        double result = 1;

        for (int i = 1; i < exponent; i++) {
            result = result * base;
        }

        return result;
    }

    /** prints hello */
    static void printHello(String name, int age) {
        System.out.println("hello " + name + ", your age is " + age);
    }

}
