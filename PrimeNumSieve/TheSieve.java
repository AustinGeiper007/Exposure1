package PrimeNumSieve;
import java.util.Scanner;

public class TheSieve {
    public static void main(String[] args)
    {
        // This main method needs additions for the 100 point version.
        Scanner input = new Scanner(System.in);
        final int MAX = 100;
        boolean primes[];
        primes = new boolean[MAX];
        computePrimes(primes);
        displayPrimes(primes);
    }

    public static void computePrimes(boolean primes[])
    {
        System.out.println("\nCOMPUTING PRIME NUMBERS");
        // Assume everything is prime
        for(int i = 2; i < primes.length; i++){
            primes[i] = true;
        }

        for(int i = 2; i < primes.length; i++){
            // If true, its prime and sets multiples to false
            // False will do nothing, as its multiples should have already been covered
            if(primes[i]){
                // Check multiples of i
                for(int j = i*2; j < primes.length; j+=i){
                    primes[j] = false;
                }
            }
        }
    }

    public static void displayPrimes(boolean primes[])
    {
        System.out.println("\n\nPRIMES BETWEEN 1 AND "+ primes.length);

        // Output all values of the list
        for(int i = 2; i < primes.length; i++){
            if(primes[i] == true) {
                System.out.print(i + " ");
            }
        }

        System.out.println();
    }
}
