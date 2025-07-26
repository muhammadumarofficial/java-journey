// java lab_5
// 2nd Semester 

import java.util.Scanner;

public class fifth_lab {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

// ============================================================================================

    // find the number of even and odd numbers in string of number
        System.out.print("Enter the Number String: ");
        String str = scan.nextLine() + " ";  
        int evenNum = 0, oddNum = 0;
        String temp = "";

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);

            if (ch != ' ') {
                temp += ch;
            } else if (!temp.equals("")) {
                int num = Integer.parseInt(temp);  

                if (num % 2 == 0) {
                    evenNum++;
                } else {
                    oddNum++;
                }

                temp = "";  
        }
    }

        System.out.println("Even Numbers in the String: " + evenNum);
        System.out.println("Odd Numbers in the String: " + oddNum);


// ============================================================================================

        // Conversion of first chracter of evry word into capital case
            System.out.println();
            System.out.println("Enter space-separated String :");
            String userInput = scan.nextLine();
            char[] inputAsChar = userInput.toCharArray();

            if(inputAsChar[0] >= 'a' && inputAsChar[0]<='z'){
                inputAsChar[0] = (char)(inputAsChar[0] - 32);
            }

            for(int i=1; i<inputAsChar.length ; i++){
                if(inputAsChar[i-1 ] == ' ' &&  inputAsChar[i] >= 'a' && inputAsChar[i]<='z' ){
                    inputAsChar[i] = (char)(inputAsChar[i] - 32);
                }
            }
                
            System.out.println("Capitalized String:");
            for(int i = 0; i < inputAsChar.length; i++) {
                System.out.print(inputAsChar[i]);   
            }

// ============================================================================================

        // Printing String in Inverse Order
            System.out.println();
            System.out.print("Enter String :");
            String str1 = scan.nextLine();
            char[] ch1 = str1.toCharArray();

            for(int i=ch1.length-1; i>=0; i--){
                System.out.print(ch1[i]);
            }     
               
    }
}
