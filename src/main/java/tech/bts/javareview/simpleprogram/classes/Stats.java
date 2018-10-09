package tech.bts.javareview.simpleprogram.classes;

public class Stats {

    private double Sum;
    private double Count;
    private double Average;
    private double Max = Double.MIN_VALUE;
    private double Min = Double.MAX_VALUE;


    public void add(double number) {
        this.Sum += number;
        this.Count++;
        this.Average = Sum/Count;

        if (number > Max){
            this.Max = number;
        }
        if (number < Min){
            this.Min = number;
        }


        // I was trying to do it in this way before...
        //this.Min = number;
        //if (Min > Max){
            //this.Max = number;
        //}

    }

    public double getSum() {
        return Sum;
    }

    public double getCount() {
        return Count;
    }

    public double getAverage() {
        return Average;
    }

    public double getMax() {
        return Max;
    }

    public double getMin() {
        return Min;
    }
}