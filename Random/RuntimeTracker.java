package org.example;

public class Main {
    public static void main(String[] args) {
        long nanoStart = System.nanoTime();
        long startTime = System.currentTimeMillis();

        long password = 9999999999L;
        long cycle = 0;
        while(cycle < password){
            cycle++;
        }
        long nanoEnd = System.nanoTime();
        long endTime = System.currentTimeMillis();
        long nanoRun = nanoEnd - nanoStart;

        long runTime = endTime - startTime;
        long timeSeconds = runTime / 1000;

        System.out.println("Total runtime: " + timeSeconds + " seconds");
        System.out.println("Total runtime: " + runTime + " milliseconds");
        System.out.println("Total runtime: " + nanoRun + " nanoseconds");
    }
}

