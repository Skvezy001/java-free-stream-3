package AliaksandrPuhachou_Hw2Task4;

import java.util.Random;

public class RandomGeneratotDemo {
    public static void main(String[] args) {
        Random randomGenerator = new Random();
        int unboundRandom = randomGenerator.nextInt();
        int boundRandom = randomGenerator.nextInt(15);
        int thirdRandom = randomGenerator.nextInt(101);

        System.out.println("unboundRandom = " + unboundRandom);
        System.out.println("boundRandom = " + boundRandom);
        System.out.println("thirdRandom = " + thirdRandom);

        System.out.println("Sum of random numbers = " + (unboundRandom+boundRandom+thirdRandom));

         }
}
