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

    }
    
}
