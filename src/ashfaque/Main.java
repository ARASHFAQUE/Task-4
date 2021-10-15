package ashfaque;

import java.math.BigInteger;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        MyCalculator myCalculator =new MyCalculator();

        System.out.print("Enter the number you want the sum of: ");
        int a = input.nextInt();
        int sum = myCalculator.divisorSum(a);
        System.out.println("The sum of divisors of the number " + a + " is: " + sum + "\n");

        System.out.print("Enter the number you want the factorial: ");
        int b = input.nextInt();
        BigInteger factorial = myCalculator.findFactorial(b);
        System.out.println("The factorial of the number " + b + " is: " + factorial);
    }

    /*
    Name: Md. Ashfaqur Rahman
    ID: 2012020129
    Section: C
    Email: cse_2012020129@lus.ac.bd
    Date: 15-10-2021
    */
}
