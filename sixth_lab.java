import java.util.Scanner;

public class sixth_lab {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

// =========================================================================================
        // Character Repetition in String

        System.out.print("Enter the String :");
        String str = scan.nextLine();
        int[] count = new int[256];

        for(int i=0;i<str.length();i++){
            char ch = str.charAt(i);
            if(ch != ' '){
                 count[ch]++;
            } 
        }

        for (int i = 0; i < 256; i++) {
            if (count[i] > 0) {
                System.out.println((char)i + " appears " + count[i] + " times");
            }
        }

// =========================================================================================
        // Zodiac Finder

         System.out.print("Enter month (1-12): ");
        int month = scan.nextInt();

        System.out.print("Enter day (1-31): ");
        int day = scan.nextInt();

        String zodiac = "";

        if ((month == 12 && day >= 22) || (month == 1 && day <= 19)) {
            zodiac = "Capricorn";
        } else if ((month == 1 && day >= 20) || (month == 2 && day <= 17)) {
            zodiac = "Aquarius";
        } else if ((month == 2 && day >= 18) || (month == 3 && day <= 19)) {
            zodiac = "Pisces";
        } else if ((month == 3 && day >= 20) || (month == 4 && day <= 19)) {
            zodiac = "Aries";
        } else if ((month == 4 && day >= 20) || (month == 5 && day <= 20)) {
            zodiac = "Taurus";
        } else if ((month == 5 && day >= 21) || (month == 6 && day <= 20)) {
            zodiac = "Gemini";
        } else if ((month == 6 && day >= 21) || (month == 7 && day <= 22)) {
            zodiac = "Cancer";
        } else if ((month == 7 && day >= 23) || (month == 8 && day <= 22)) {
            zodiac = "Leo";
        } else if ((month == 8 && day >= 23) || (month == 9 && day <= 22)) {
            zodiac = "Virgo";
        } else if ((month == 9 && day >= 23) || (month == 10 && day <= 22)) {
            zodiac = "Libra";
        } else if ((month == 10 && day >= 23) || (month == 11 && day <= 21)) {
            zodiac = "Scorpio";
        } else if ((month == 11 && day >= 22) || (month == 12 && day <= 21)) {
            zodiac = "Sagittarius";
        } else {
            zodiac = "Invalid date!";
        }

        System.out.println("Zodiac Sign: " + zodiac);

// =========================================================================================
        // Anagram Checker 

        scan.nextLine(); 
        System.out.print("Enter first String : ");
        String str1 = scan.nextLine();
       
        System.out.print("ENter Second String :");
        String str2 = scan.nextLine();
       
        boolean isAnagram = true;

        if (str1.length() != str2.length()) {
            isAnagram = false;
        } else {
            for (int i = 0; i < str1.length(); i++) {
                char ch = str1.charAt(i);

                int count1 = 0;
                int count2 = 0;

                for (int j = 0; j < str1.length(); j++) {
                    if (str1.charAt(j) == ch) count1++;
                    if (str2.charAt(j) == ch) count2++;
                }

                if (count1 != count2) {
                    isAnagram = false;
                    break;
                }
            }
        }

        if (isAnagram)
            System.out.println("Anagram");
        else
            System.out.println("Not Anagram");
    }
    
}
