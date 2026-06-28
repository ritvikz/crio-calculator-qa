package com.crio.qcalc;

public class App {

    public String getGreeting() {
        return "Hello World!";
    }

    public static void main(String[] args) {
        System.out.println("Starting QCalc...");

        // Using StandardCalculator
        StandardCalculator calc = new StandardCalculator();

        calc.add(5, 3);
        calc.printResult();  // 8

        calc.subtract(10, 4);
        calc.printResult();  // 6

        calc.multiply(3, 7);
        calc.printResult();  // 21

        calc.divide(10, 2);
        calc.printResult();  // 5

        calc.divide(5, 0);    
        calc.printResult();  // Error + 0

        calc.clearResult();
        calc.printResult();  // 0

        StandardCalculator.getVersion();

        System.out.println("-----");

        // Using ScientificCalculator
        ScientificCalculator sciCalc = new ScientificCalculator();

        System.out.println("Cube of 4 = " + sciCalc.cubeOf(4.0));
        System.out.println("Square of 6 = " + sciCalc.squareOf(6.0));
        System.out.println("2 raised to 3 = " + sciCalc.powerOf(2, 3));
        System.out.println("Square root of 16 = " + sciCalc.squareRoot(16));
        System.out.println("Modulo of 5 % 2 = " + sciCalc.modulo(5, 2));
        System.out.println("Divide 10 / 4 = " + sciCalc.divide(10, 4));
    }
}
