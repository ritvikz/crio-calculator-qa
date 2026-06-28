package com.crio.qcalc;

public class StandardCalculator {


    private int result;

    public int getResult() {
        return result;
    }

    private void setResult(int value) {
        this.result = value;
    }

    public void add(int num1, int num2) {
        setResult(num1 + num2);
    }

    public void subtract(int num1, int num2) {
        setResult(num1 - num2);
    }

    public void multiply(int num1, int num2) {
        setResult(num1 * num2);
    }

    public void divide(int num1, int num2) {
        if (num2 != 0) {
            setResult(num1 / num2);
        } else {
            System.out.println("Error: Cannot divide by zero.");
            setResult(0); 
        }
    }

    public void clearResult() {
        result = 0;
    }

    public void printResult() {
        System.out.println("Standard Calculator Result: " + getResult());
    }

    public static void getVersion() {
        System.out.println("Standard Calculator 1.0");
    }
}
