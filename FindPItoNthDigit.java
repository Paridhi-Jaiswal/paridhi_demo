import java.util.Scanner;   


public class FindPItotheNthDigit {
  
  public static void main(String[] args) {

    Scanner input = new Scanner(System.in);

    int num;  
    double pi = Math.PI;

    // Prompt user for input:
    System.out.print("Please enter a number for which to cut PI off at: ");
    num = input.nextInt();

    // Return PI rounded to nth decimal.
    System.out.println( );
    System.out.println("PI rounded to the " + num + " decimal: ");
    System.out.printf("%." + num + "f", pi);
  }
}
