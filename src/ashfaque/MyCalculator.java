package ashfaque;

import java.math.BigInteger;

public class MyCalculator implements AdvancedArithmetic{

    @Override
    public int divisorSum(int n) {
        int total = 0;

        for (int i = 1; i <= n; i++)
        {
            if(n % i == 0)
            {
                total += i;
            }
        }
        return total;
    }

    @Override
    public BigInteger findFactorial(int n) {
        BigInteger factorial = BigInteger.ONE;

        for (int i = 1; i <= n; i++)
        {
            factorial = factorial.multiply(BigInteger.valueOf(i));
        }
        return factorial;
    }

    /*
    Name: Md. Ashfaqur Rahman
    ID: 2012020129
    Section: C
    Email: cse_2012020129@lus.ac.bd
    Date: 15-10-2021
    */
}
