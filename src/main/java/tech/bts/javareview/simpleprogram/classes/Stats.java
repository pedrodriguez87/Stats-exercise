package tech.bts.javareview.simpleprogram.classes;

public class Stats {

    private double sum;
    private double count;
    private double average;
    private double max = Double.MIN_VALUE;
    private double min = Double.MAX_VALUE;


    public void add(double number) {
        this.sum += number;
        this.count++;
        this.average = sum/count;

        if (number > max){
            this.max = number;
        }
        if (number < min){
            this.min = number;
        }


        // I was trying to do it in this way before...
        //this.Min = number;
        //if (Min > Max){
            //this.Max = number;
        //}

    }

    public double getSum() {
        return sum;
    }

    public double getCount() {
        return count;
    }

    public double getAverage() {
        return average;
    }

    public double getMax() {
        return max;
    }

    public double getMin() {
        return min;
    }
}