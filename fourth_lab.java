public class fourth_lab {

    public static void main(String[] args) {
        
        // Uncomment the method you want to run
        
        // billCalculation(args);
        // printTable(args);
        // accessRuntimeValues(args);
        // intToCharConversion();
        // charToIntConversion();
        // charactersFromString(args);
        // printIndividualCharacters(args);
        // convertToUpperCase(args);
    }


// ================================================================================================

    // 1. Bill Calculation Program
    public static void billCalculation(String[] args) {
        if (args.length == 0) {
            System.out.println("Please provide units consumed as argument");
            return;
        }
        
        int units = Integer.parseInt(args[0]);
        double totalBill = 0;
        
        for (int i = 1; i <= units; i++) {
            if (i <= 100) {
                totalBill += 2;
            } else if (i <= 200) {
                totalBill += 3;
            } else if (i <= 300) {
                totalBill += 4;
            } else if (i <= 400) {
                totalBill += 5;
            } else if (i <= 500) {
                totalBill += 6;
            } else {
                totalBill += 7; // for units beyond 500
            }
        }
        
        System.out.println("Total bill for " + units + " units is: Rs. " + totalBill);
    }



// ================================================================================================

    // 2. Printing Table at Run Time
    public static void printTable(String[] args) {
        if (args.length != 3) {
            System.out.println("Please provide number, min and max values as arguments");
            return;
        }
        
        int number = Integer.parseInt(args[0]);
        int min = Integer.parseInt(args[1]);
        int max = Integer.parseInt(args[2]);
        
        for (int i = min; i <= max; i++) {
            System.out.println(number + "*" + i + "=" + (number * i));
        }
    }



// ================================================================================================

    // 3. Accessing All Runtime Values
    public static void accessRuntimeValues(String[] args) {
        for (int i = 0; i < args.length; i++) {
            System.out.println(args[i]);
        }
    }


// ================================================================================================

    // 4. Integer to Character Conversion
    public static void intToCharConversion() {
        char character = 65;
        System.out.println(character);
        System.out.println((char) 66);
    }

// ================================================================================================

    // 5. Character to Integer Conversion
    public static void charToIntConversion() {
        int value = 'A';
        System.out.println(value);
        System.out.println((int)'B');
    }

// ================================================================================================

    // 6. Characters from String
    public static void charactersFromString(String[] args) {
        if (args.length == 0) {
            System.out.println("Please provide a string argument");
            return;
        }
        
        String hello = args[0];
        char[] charray = hello.toCharArray();
        
        for (int i = 0; i < charray.length; i++) {
            System.out.println(charray[i]);
        }
    }

// ================================================================================================

    // 7. Accessing All Runtime Values and Printing Characters Individually
    public static void printIndividualCharacters(String[] args) {
        for (String arg : args) {
            char[] characters = arg.toCharArray();
            for (char c : characters) {
                System.out.println(c);
            }
        }
    }

// ================================================================================================

    // 8. Conversion to Upper Case
    public static void convertToUpperCase(String[] args) {
        if (args.length == 0) {
            System.out.println("Please provide string arguments");
            return;
        }
        
        for (String arg : args) {
            System.out.print(arg.toUpperCase() + " ");
        }
        System.out.println();
    }
}