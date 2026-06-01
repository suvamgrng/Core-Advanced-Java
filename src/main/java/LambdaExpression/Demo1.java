package LambdaExpression;

import java.util.Scanner;

@FunctionalInterface
interface MathOperation {
    int operate(int a, int b);
}

public class Demo1 {

    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {

            System.out.print("Enter first number: ");
            int num1 = sc.nextInt();

            System.out.print("Enter second number: ");
            int num2 = sc.nextInt();

            System.out.print("Enter operator (+, -, *): ");
            String opr = sc.next();

            MathOperation add      = (a, b) -> a + b;
            MathOperation sub      = (a, b) -> a - b;
            MathOperation multiply = (a, b) -> a * b;

            switch (opr) {
                case "+":
                    System.out.println("Result: " + add.operate(num1, num2));
                    break;
                case "-":
                    System.out.println("Result: " + sub.operate(num1, num2));
                    break;
                case "*":
                    System.out.println("Result: " + multiply.operate(num1, num2));
                    break;
                default:
                    System.out.println("Invalid operator!");
            }
        }
    }
}