package tech.bts.javareview.simpleprogram.classes;

public class Main {

    public static void main(String[] args) {

        Calculator calc = new Calculator(0);

        calc.add(100);
        calc.clear();


        calc.add(7);
        calc.add(3);
        calc.add(5);

        calc.div(2);


        System.out.println("Value " + calc.getValue());
        System.out.println("Operations " + calc.getOperationCount());



    }
}
