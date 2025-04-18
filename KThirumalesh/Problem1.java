import java.util.*;
class Problem1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter first number (a): ");
        double a = scanner.nextDouble();

        System.out.print("Enter second number (b): ");
        double b = scanner.nextDouble();

        System.out.print("Enter operation (add, subtract, multiply, divide): ");
        String operation = scanner.next();

        Calculator calculator = new Calculator();

        switch (operation.toLowerCase()) {
            case "add":
                System.out.println("Result: " + calculator.add(a, b));
                break;
            case "subtract":
                System.out.println("Result: " + calculator.subtract(a, b));
                break;
            case "multiply":
                System.out.println("Result: " + calculator.multiply(a, b));
                break;
            case "divide":
                if (b != 0) {
                    System.out.println("Result: " + calculator.divide(a, b));
                } else {
                    System.out.println("Error: Division by zero");
                }
                break;
            default:
                System.out.println("Invalid operation");
        }

        scanner.close();
    }
}

class Calculator {
    public double add(double a, double b) {
        return a + b;
    }

    public double subtract(double a, double b) {
        return a - b;
    }

    public double multiply(double a, double b) {
        return a * b;
    }

    public double divide(double a, double b) {
        return a / b;
    }
}