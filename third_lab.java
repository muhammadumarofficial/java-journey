// java Lab#3
// 2nd Semester

import java.util.Scanner;

public class third_lab {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

// =====================================================================================

        // Question 1: Season Calculator
        System.out.print("Enter month number: ");
        int month = input.nextInt();

        if (month == 12 || month == 1 || month == 2) {
            System.out.println("Season is Winter");
        } else if (month == 3 || month == 4 || month == 5) {
            System.out.println("Season is Spring");
        } else if (month == 6 || month == 7 || month == 8) {
            System.out.println("Season is Summer");
        } else if (month == 9 || month == 10 || month == 11) {
            System.out.println("Season is Autumn");
        } else {
            System.out.println("Invalid month number.");
        }


// =====================================================================================

        // Question 2: Even or Odd
        System.out.print("Enter a number: ");
        int num = input.nextInt();

        if (num % 2 == 0) {
            System.out.println(num + " is even number");
        } else {
            System.out.println(num + " is odd number");
        }


// =====================================================================================

        // Question 3: Factorial
        System.out.print("Enter a number: ");
        num = input.nextInt();  // reuse same variable
        int result = 1;

        for (int i = 1; i <= num; i++) {
            result = result * i;
        }

        System.out.println(result + " is factorial of " + num);


// =====================================================================================

        // Question 4: Division Without / Operator
        int quotient = 0;

        System.out.print("Enter dividend: ");
        int dividend = input.nextInt();

        System.out.print("Enter divisor: ");
        int divisor = input.nextInt();

        while (dividend >= divisor) {
            dividend = dividend - divisor;
            quotient++;
        }

        int remainder = dividend;

        System.out.println("Quotient: " + quotient);
        System.out.println("Remainder: " + remainder);


// =====================================================================================

        // Question 5: Prime or Not Prime
        System.out.print("Enter a number to check prime: ");
        int checkPrime = input.nextInt();
        boolean isPrime = true;

        if (checkPrime <= 1) {
            isPrime = false;
        } else {
            for (int i = 2; i <= checkPrime / 2; i++) {
                if (checkPrime % i == 0) {
                    isPrime = false;
                    break;
                }
            }
        }

        if (isPrime) {
            System.out.println(checkPrime + " is a prime number");
        } else {
            System.out.println(checkPrime + " is not a prime number");
        }

        input.close();
    }
}
