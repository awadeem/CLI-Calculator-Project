package cd.rr.calculator;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        // Your solution here!
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to the CLI Calculator");
        System.out.println("-----------------------------");

        System.out.println("First Number: ");
        double firstNumber = input.nextDouble();
        System.out.println("Second Number: ");
        double secondNumber = input.nextDouble();

        System.out.println("1: Addition");
        System.out.println("2: Subtraction");
        System.out.println("3: Multiplication");
        System.out.println("4: Division");
        System.out.println("5: Exit");

        System.out.println("Choose your operation:");
        int n = input.nextInt();

        switch (n){
            case 1:
                double add = firstNumber + secondNumber;
                System.out.println(add);
                break;
            case 2:
                double sub = firstNumber - secondNumber;
                System.out.println(sub);
                break;
            case 3:
                double multiply = firstNumber*secondNumber;
                System.out.println(multiply);
                break;
            case 4:
                double div = firstNumber/secondNumber;
                break;
            case 5: default:
                System.exit(0);

        }

    }
}
