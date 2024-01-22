package com.girmiti.assignment;

import java.util.Arrays;
import java.util.List;

@FunctionalInterface
interface Mapper {
    int map(int number);
}

public class SumOfEvenOdd {
	interface Condition {
        boolean test(int number);
    }
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

        int sumOfSquaresOdd = calculateSum(numbers, n -> n % 2 != 0, n -> n * n);
        System.out.println("Sum of squares for odd numbers: " + sumOfSquaresOdd);

        int sumOfSquaresEven = calculateSum(numbers, n -> n % 2 == 0, n -> n * n);
        System.out.println("Sum of squares for even numbers: " + sumOfSquaresEven);
    }

    private static int calculateSum(List<Integer> numbers, Condition condition, Mapper mapper) {
        int sum = 0;
        for (int number : numbers) {
            if (condition.test(number)) {
                sum += mapper.map(number);
            }
        }
        return sum;
    }
    
}

