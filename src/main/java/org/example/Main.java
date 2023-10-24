package org.example;


public class Main {
    public static void main(String[] args) {
        CountEvens countEvens = new CountEvens();
        DifferenceElementals differenceElementals = new DifferenceElementals();
        NeighboringElements neighboringElements = new NeighboringElements();

        int[] arr = {1, 0, 0, 4, 1};
        System.out.println(countEvens.countingEvenElements(arr));
        System.out.println(differenceElementals.differenceBetweenElementals(arr));
        System.out.println(neighboringElements.zeroNeighboringElements(arr));
    }
}