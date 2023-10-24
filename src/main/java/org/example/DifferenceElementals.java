package org.example;

public class DifferenceElementals {
    public int differenceBetweenElementals(int[] numbers) {
        int largestNumber = 0;
        int smallestNumber = 0;

        if (numbers.length != 0) {
            for (int i = 0; i < numbers.length - 1; i++) {
                if (numbers[i] > largestNumber) {
                    largestNumber = numbers[i];
                }

                if (numbers[i] < smallestNumber) {
                    smallestNumber = numbers[i];
                }
            }
        }
        return (largestNumber - smallestNumber);
    }
}
