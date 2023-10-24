package org.example;

public class NeighboringElements {
    public boolean zeroNeighboringElements(int[] numbers) {
        for (int i = 0; i < numbers.length - 1; i++) {
            if (numbers[i] == 0 && numbers[i + 1] == 0) {
                return true;
            }
        }
        return false;
    }
}
