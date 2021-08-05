package cd.rr.calculator;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        // Your solution here!
            for(int i=0;i<=5;i++) {

            Scanner input = new Scanner(System.in);
            System.out.println("Welcome to the CLI Calculator");
            System.out.println("-----------------------------");

            System.out.println("Operations:");

            System.out.println("1: Addition");
            System.out.println("2: Subtraction");
            System.out.println("3: Multiplication");
            System.out.println("4: Division");
            System.out.println("5: Exit");

            System.out.println("Choose your operation:");
            int n = input.nextInt();

            System.out.println("First Number: ");
            double firstNumber = input.nextDouble();
            System.out.println("Second Number: ");
            double secondNumber = input.nextDouble();




            switch (n) {
                case 1:
                    double add = firstNumber + secondNumber;
                    System.out.println("Result:" + add);
                    break;
                case 2:
                    double sub = firstNumber - secondNumber;
                    System.out.println("Result:" + sub);
                    break;
                case 3:
                    double multiply = firstNumber * secondNumber;
                    System.out.println("Result:" + multiply);
                    break;
                case 4:
                    if (secondNumber==0){
                        System.out.println("Error: Cannot divide by 0");
                    }
                    else{
                    double div = firstNumber / secondNumber;
                    System.out.println("Result:" + String.format("%.2f",div));
                    }

                    break;
                case 5:
                default:
                    System.out.println("Good bye!");
                    System.exit(0);


            }
        }


    }
}
