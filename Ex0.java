import java.util.*;

public class Ex0 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Plase enter a number greater than 4 : ");
        int n;
        n = sc.nextInt();
        long startTime = System.currentTimeMillis();
        FindPrime(n);
        isPrime1(n);
        PrimeCounter(n);
        decompositionPrime(n);

        long endTime = System.currentTimeMillis();
        float duration = (endTime - startTime) / 100f;
        System.out.println("Runtime" + duration + "seconds");

        int id = 213338320;
        System.out.println("id == " + id);
    }


    public static void FindPrime(int n) {
        int p1;
        int p2;
        boolean foundPrime = false;
        for (p1 = 2; p1 <= n / 2 && foundPrime == false; p1++) {
            p2 = n - p1;
            if (isPrimeCh(p1) && isPrimeCh(p2)) {
                System.out.println(n + "=" + p1 + "+" + p2);
                foundPrime = true;
            }
        }
    }

    public static boolean isPrimeCh(int n) {
        if (n < 2) {
            return false;
        }
        for (int k = 2; k < n; k++) {
            if (n % k == 0) {
                return false;
            }
        }
        return true;
    }

    public static boolean isPrime1(int n) {
        boolean FoundPair = false;
        for (int p3 = 2; p3 < n && FoundPair==false; p3++) {
            int p4 = n + p3;
            if (isPrimeCh(p3) && isPrimeCh(p4)) {
                System.out.println( n+"="+p4 + "-" + p3);
                FoundPair = true;
            }

        }
        return false;
    }

    public static void PrimeCounter(int n) {
        int primeCount = 0;
        for (int i = 2; i < n; i++) {
            if (isPrimeCh(i)) {
                primeCount++;
            }
        }
        System.out.println(primeCount+"prime numbers between   [ 2 ,"  + n  + "]");
    }


    public static void decompositionPrime(int n) {
        int i = 2;
        System.out.print(n + "=");
        while (n > 1) {
            while (n % i == 0) {
                if (n != i) {
                    System.out.print(i + "*");
                } else {
                    System.out.println(n);
                }
                n = n / i; //aas
            }
            i++;
        }
    }
}


























