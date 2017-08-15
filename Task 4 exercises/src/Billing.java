//import statement for scanner
import java.util.Scanner;

public class Billing {
    final static double TAX = 0.08;

    public static void main(String[] args) {
        //Declared variables
        double bill;

        //calls methods with one, then two, then 3 parameters
        bill = computeBill(24.99);
        System.out.println("The total for a photobook that costs $24.99 is $" + bill);


        bill = computeBill(17.50, 4);
        System.out.println("Total of 4 photobooks is: $" + bill);

        bill = computeBill(10.00, 6, 20.00);
        System.out.println("Total of 6 photobooks that cost $10 with a $20 coupon is $" + bill);
    }
//Overloaded methods for returning one, two, then three parameters
    public static double computeBill(double x){
        double bill = x + (x * TAX);
        return bill;

    }

    public static double computeBill(double x, int y){
        double bill = x * y;
        bill = bill + bill * TAX;
        return bill;
    }

    public static double computeBill(double x, int y, double z){
        double bill = x * y;
        bill = bill - z;
        bill = bill + bill * TAX;
        return bill;
  }
}
