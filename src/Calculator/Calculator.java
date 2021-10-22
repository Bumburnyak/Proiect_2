package Calculator;

import java.lang.StringBuffer;

public class Calculator {
    public static final double DEBUG_VALUE_1 = 5.0;
    public static final double DEBUG_VALUE_2 = 3.5;
    private double a;
    private double b;
    public Calculator(double a, double b) {
        this.a = a;
        this.b = b;
    }

    public Calculator(){
        this.a = DEBUG_VALUE_1;
        this.b = DEBUG_VALUE_2;
    }

    public void setVal1(double a) {
        this.a = a;
    }

    public double getVala() {
        return a;
    }

    public void setVal2(double b) {
        this.b = b;
    }

    public double getValb() {
        return b;
    }

    //possible operations

    //summation
    public double sum(double  a, double b){
        return a + b;
    }

    //difference
    public double dif(double  a, double b){
        return a - b;
    }

    //multiplication
    public double mult(double  a, double b){
        return a * b;
    }

    public String toString() {
        StringBuffer sb = new StringBuffer();
        sb.append("The Object state is: a->");
        sb.append(a);
        sb.append(" si b->");
        sb.append(b);
        sb.append(" , the last calculated value: ");

        return sb.toString();
    }
}
