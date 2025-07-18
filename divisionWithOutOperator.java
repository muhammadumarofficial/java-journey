import java.util.Scanner;
class divisionWithOutOperator{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int quotient=0;

        System.out.print("Enter dividend : ");
        int dividend = scan.nextInt();

        System.out.print("Enter divisor: ");
        int divisor = scan.nextInt();

        for(;dividend >= divisor ;){
            dividend = dividend - divisor;
            quotient++;
        }

        int remainder = dividend;
        System.out.println(remainder);
       

        

    }
}