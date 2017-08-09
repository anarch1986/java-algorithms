package com.anarch1986.numbers;

import java.util.Arrays;

public class Sieve {

    public Boolean[] findPrimes(int n) {

        Boolean[] primes = new Boolean[n];
        Arrays.fill(primes, true);
        primes[0] = false;
        primes[1] = false;
        for (int i = 2; i < primes.length; i++) {
            if (primes[i]) {
                for (int j = 2; i * j < primes.length; j++) {
                    primes[i * j] = false;
                }
            }
        }
        return primes;
    }
}
