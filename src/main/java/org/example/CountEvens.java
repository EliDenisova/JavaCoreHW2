package org.example;

public class CountEvens {
    public int countingEvenElements(int[] numbers) {
        int countEven = 0;
        for(int num : numbers) {
            if (num%2 == 0) {
                countEven ++;
            }
        }
        return countEven;
    }
}
