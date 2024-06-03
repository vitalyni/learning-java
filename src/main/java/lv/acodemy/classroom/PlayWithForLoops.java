package lv.acodemy.classroom;

public class PlayWithForLoops {
    public static void main(String[] args) {

        // Print numbers from 1 to 10;
        for (int i = 1; i <= 10; i++) {
            System.out.println(i);
        }

        // Print all even numbers from 2 to 20;

        for (int i = 2; i <= 20; i += 2) {
            System.out.println(i);
        }

        // Calculate the sum of numbers from 1 to 10;

        int sum = 0;
        for (int i = 1; i <= 10; i++) {
            sum = sum + i;
        }
        System.out.println("Sum:" + sum);

        // Print elements from an Array

        int[] numbers = {2, 7, 13, 21, 47, 77, 95};
        // for (int number : numbers) {
        // System.out.println(number);
        for (int i = 0; i < numbers.length; i++) {
            System.out.println(numbers[i]);
        }

        // Print numbers in reverse order from 10 to 1;

        for (int i = 10; i >= 1; i--) {
            System.out.println(i);
        }

        // Print multiplication table (5)

        int number = 5;
        for(int i = 1; i <=10; i++) {
            int result = number * i;
            System.out.println(String.format("%d * %d = %d", number, i, result));
        }

    }
}
