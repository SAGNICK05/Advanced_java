
//this algorithm optimises the checking if a number is prime or not
import java.util.*;

class Sieve_of_Eratosthenes {

    boolean[] sieveOfEratosthenes(int n) {
        boolean[] prime = new boolean[n + 1];
        Arrays.fill(prime, true);
        prime[0] = prime[1] = false;

        for (int i = 2; i * i <= n; i++) {
            if (prime[i]) {
                for (int j = i * i; j <= n; j += i) {
                    prime[j] = false;
                }
            }
        }
        return prime;
    }

    public static void main(String[] args) {
        Sieve_of_Eratosthenes sieve = new Sieve_of_Eratosthenes();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number till which prime is to be found");
        int n = sc.nextInt();
        boolean[] primes = sieve.sieveOfEratosthenes(n);
        for (int i = 2; i <= n; i++) {
            if (primes[i])
                System.out.println(i);
        }
        sc.close();
    }
}