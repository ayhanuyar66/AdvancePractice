package day01_variables;

import java.util.Scanner;

public class C01_Deneme {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter the first number
        System.out.print("Enter the first number: ");
        double number1 = scanner.nextDouble();

        // Prompt the user to enter the second number
        System.out.print("Enter the second number: ");
        double number2 = scanner.nextDouble();

        // Perform addition and store the result in the variable 'sum'
        double sum = number1 + number2;

        // Perform subtraction and store the result in the variable 'difference'
        double difference = number1 - number2;

        // Perform multiplication and store the result in the variable 'product'
        double product = number1 * number2;

        // Perform division and store the result in the variable 'quotient'
        double quotient = number1 / number2;

        // Display the sum
        System.out.println("Sum: " + sum);

        // Display the difference
        System.out.println("Difference: " + difference);

        // Display the product
        System.out.println("Product: " + product);

        // Display the quotient
        System.out.println("Quotient: " + quotient);
    }
}









