//id : 213338320
import java.util.*;

//a). Find two prime numbers that add Up to the given number.
// The program needs to find two prime numbers whose sum is equal to the input number n which is a natural even number greater than 4.
// .and will print these primes in the form n = p1 + p2.(It checks pairs of numbers starting from 2 and looks for two primes whose sum equals n.)
// b). Find two prime numbers that subtract to give the given number.
// The program also needs to find two prime numbers p3 and p4 such that the difference between p4 and p3 equals n.
// It will print the result in the form n = p4 - p3. and searches for a pair of prime numbers where the larger one is n greater than the smaller one
// c). Count the Number of Prime Numbers Up to the Given Number. The program should count how many prime numbers exist in the range from 2 up to the input number n.
// The result will be printed as the total count of primes in that range.
// d). Decompose the Number into Prime Factors.The program should break down the input number n into its prime factor
//It continues dividing the number by the smallest prime factors (starting with 2),
// until n is reduced to 1. The program will print the prime factorization of n.
//
/**  a-d pseudocode
 * FUNCTION isPrimeCh(n) (Checks if a number is a prime number)
 *     FOR (k FROM 2 TO n - 1){
 *         IF n MOD k = 0 THEN
 *             RETURN FALSE
 *         IF
 *         }
 *     RETURN TRUE
 *   }
 *
 *
 * a) FUNCTION FindPrime(n)
 *     foundPrime = FALSE
 *     FOR (p1 FROM 2 TO (n / 2) AND foundPrime = FALSE){
 *         p2 = n - p1
 *         IF isPrimeCh(p1) AND isPrimeCh(p2){
 *             PRINT "a) ", n, "=", p1, "+", p2
 *             foundPrime = TRUE
 *             }
 * }
 *
 * b).FUNCTION isPrime1(n)
 *      FoundPair = FALSE
 *     FOR (p3 FROM 2 TO n - 1 AND FoundPair = FALSE )
 *        p4 = n + p3
 *         IF isPrimeCh(p3) AND isPrimeCh(p4) {
 *             PRINT "b) ", n, "=", p4, "-", p3
 *             FoundPair = TRUE
 *     }
 *  }
 *
 * c).FUNCTION PrimeCounter(n)
 *      primeCount = 0
 *     FOR( i FROM 2 TO n - 1) {
 *         IF isPrimeCh(i)
 *             INCREMENT primeCount
 *     PRINT "c) ", primeCount, " prime numbers in [2, ", n, "]"
 *     }
 * }
 *
 * d). FUNCTION decompositionPrime(n)
 *     PRINT "d) ", n, "="
 *     i = 2
 *  WHILE (n > 1){
 *         WHILE (n MOD i = 0)
 *             IF (n != i) {
 *  PRINT i, "*"
 *   ELSE
 *    PRINT n
 *   }
 *     n = n / i
 * }
 *         INCREMENT i
 *   }
 */


public class Ex0 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); // Receives a number from the user
        System.out.print("Plase enter a number greater than 4 : ");
        int n;
        n = sc.nextInt();
        long startTime = System.currentTimeMillis();
        if(n%2==0 && n>4) { //If the number entered by the user is divisible by 2 without a remainder and is greater than 4.
            FindPrime(n);
            isPrime1(n);
            PrimeCounter(n);
            decompositionPrime(n);
        }
        else {
            System.out.println("Error: you should enter a natural even > 4, ans smaller than 100000000 yet, you have entered "+ n +"  quiting!");
        }


        long endTime = System.currentTimeMillis();
        float duration = (endTime - startTime) / 1000f; // This action checks the runtime of the code
        System.out.println("e) " + duration + " seconds, the program runtime");

        int id = 213338320;
        System.out.println("f) " + id  + " this is solution for Ex0 (Intro2CS 2025A)");
    }


    public static void FindPrime(int n) {
        int p1;
        int p2;
        boolean foundPrime = false;
        for (p1 = 2; p1 <= n / 2 && foundPrime == false; p1++) {
            p2 = n - p1;
            if (isPrimeCh(p1) && isPrimeCh(p2)) { // p1 +p2 = p1 + n- p2 = n ( check if both p1 and p2 are prime)
                System.out.println("a) " +n + "=" + p1 + "+" + p2);
                foundPrime = true;
            }
        }
    }

    public static boolean isPrimeCh(int n) {
        for (int k = 2; k < n/2; k++) {
            if (n % k == 0) { // found number that divide n without reiminder, so there no need to continue checking
                return false;
            }
        }
        return true;
    }

    public static boolean isPrime1(int n) {
        boolean FoundPair = false;
        for (int p3 = 2; p3 < n && FoundPair==false; p3++) {
            int p4 = n + p3;
            if (isPrimeCh(p3) && isPrimeCh(p4)) { // p4-p3= p3+n (check if both p3 and p4 are prime).
                System.out.println("b)  "+n+"="+p4 + "-" + p3);
                FoundPair = true;
            }

        }
        return false;
    }

    public static void PrimeCounter(int n) {
        int primeCount = 0;
        for (int i = 2; i < n; i++) {
            if (isPrimeCh(i)) { // if i is prime
                primeCount++; // increment the prime count
            }
        }
        System.out.println("c) " +primeCount+" prime numbers in  [ 2 ,"  + n  + "]");
    }


    public static void decompositionPrime(int n) {
        int i = 2;
        System.out.print("d) " +n + "=");
        while (n > 1) {
            while (n % i == 0) { // If i is divisible by n with a remainder of 0
                if (n != i) { //  i is not equal to n.
                    System.out.print(i + "*");
                } else {
                    System.out.println(n);
                }
                n = n / i; //n = divide n by i
            }
            i++;
        }
    }
}


























