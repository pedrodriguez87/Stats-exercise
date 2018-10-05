package tech.bts.javareview.simpleprogram.classes;

public class Calculator {

    private double value;
    private int operationCount;

    // Constructor

    public Calculator(double value) {
        this.value = value;
        this.operationCount = 0;
    }

    public void add(double x) {
        this.value += x;
        this.operationCount++;
    }

    /** Resets the value to 0 */
    public void clear() {
        this.value = 0;
        this.operationCount = 0;
    }

    public void div(double x){
        this.value /= x;
        this.operationCount++;
    }

    public double getValue() {
        return value;
    }

    public int getOperationCount() {
        return operationCount;
    }
}
