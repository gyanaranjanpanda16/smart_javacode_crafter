package com.gyanaranjan.NWPro01;


import java.util.List;
import java.util.stream.Collectors;

    public class CollectorsTeeingProgram {
        public static void main(String[] args) {
            List<Integer> numbers = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

            // Calculate both the sum and the average of the list of numbers
            Stats stats = numbers.stream().collect(
                    Collectors.teeing(
                            Collectors.summingInt(Integer::intValue),   // Downstream collector 1: sum
                            Collectors.counting(),                     // Downstream collector 2: count
                            (sum, count) -> new Stats(sum, (double) sum / count)  // Merger function
                    )
            );

            // Output the results
            System.out.println("Sum: " + stats.sum);
            System.out.println("Average: " + stats.average);
        }

        // Stats class to hold the result
        static class Stats {
            int sum;
            double average;

            public Stats(int sum, double average) {
                this.sum = sum;
                this.average = average;
            }
        }
    }


