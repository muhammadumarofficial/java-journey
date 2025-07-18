public class BasicPractice {
    // FUNCTION (method) that adds two numbers
    public static int addNumbers(int x, int y) {
        return x + y;
    }

    public static void main(String[] args) {

        // PRINT STATEMENT
        System.out.println("Hello, Java");

        // VARIABLES + DATA TYPES
        int age = 18;
        double salary = 34500.75;
        char gender = 'M';
        boolean isStudent = true;
        String city = "Sukkur";
        String name = "Muhammad Umar";

        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Salary: " + salary);
        System.out.println("Gender: " + gender);
        System.out.println("Student: " + isStudent);
        System.out.println("City: " + city);

        // ARITHMETIC OPERATORS
        int a = 10, b = 3;
        System.out.println("Addition: " + (a + b));
        System.out.println("Subtraction: " + (a - b));
        System.out.println("Multiplication: " + (a * b));
        System.out.println("Division: " + (a / b));       // integer division
        System.out.println("Modulus (Remainder): " + (a % b));

        // RELATIONAL OPERATORS
        System.out.println("a > b: " + (a > b));
        System.out.println("a == b: " + (a == b));

        // LOGICAL OPERATORS
        boolean x = true, y = false;
        System.out.println("x && y: " + (x && y));
        System.out.println("x || y: " + (x || y));
        System.out.println("!x: " + (!x));

        // IF-ELSE STATEMENT
        int marks = 65;
        if (marks >= 50) {
            System.out.println("Pass");
        } else {
            System.out.println("Fail");
        }

        // NESTED IF
        if (marks >= 90) {
            System.out.println("Grade A");
        } else if (marks >= 70) {
            System.out.println("Grade B");
        } else if (marks >= 50) {
            System.out.println("Grade C");
        } else {
            System.out.println("Grade F");
        }

        // SWITCH CASE
        int day = 2;
        switch (day) {
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            default:
                System.out.println("Other day");
        }

        // FOR LOOP
        System.out.println("For loop from 1 to 5:");
        for (int i = 1; i <= 5; i++) {
            System.out.println(i);
        }

        // WHILE LOOP
        System.out.println("While loop from 1 to 3:");
        int count = 1;
        while (count <= 3) {
            System.out.println(count);
            count++;
        }

        // DO-WHILE LOOP
        System.out.println("Do-while loop:");
        int d = 1;
        do {
            System.out.println("Value: " + d);
            d++;
        } while (d <= 2);

        // ARRAYS
        int[] scores = {90, 80, 70};
        System.out.println("Array values using normal for loop:");
        for (int i = 0; i < scores.length; i++) {
            System.out.println(scores[i]);
        }

        // FOR-EACH LOOP
        System.out.println("Array values using for-each loop:");
        for (int score : scores) {
            System.out.println(score);
        }

        // FUNCTION CALL
        int sum = addNumbers(10, 20);
        System.out.println("Sum from function: " + sum);
    }
}
