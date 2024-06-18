package lv.acodemy.classroom;

public class FirstHomeWork {

        public static void main(String[] args) {

            // 1. Easy peasy
            int number1 = 10;
            if (number1 > 0) {
                System.out.println("Positive number");
            }

            // 2. Odd or even
            int number2 = 4;
            if (number2 % 2 == 0) {
                System.out.println("Even number");
            }

            // 3. Age group classifier
            int age = 20;
            if (age < 18) {
                System.out.println("Teenager");
            } else {
                System.out.println("Adult");
            }

            // 4. Leap year checker
            int year = 2024;
            if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
                System.out.println("Leap year");
            }

            // 5. Multiple conditions
            int number3 = 50;
            if (number3 > 0 && number3 % 2 == 0 && number3 < 100) {
                System.out.println("Valid number");
            }

            // 6. Nested conditions
            int number4 = 8;
            if (number4 > 0) {
                if (number4 % 2 == 0) {
                    System.out.println("Positive and Even");
                }
            }

            // 7. Character type identifier:
            char character = 'a';
            if (character == 'a' || character == 'b' || character == 'c' || character == 'd' || character == 'e' ||
                    character == 'A' || character == 'B' || character == 'C' || character == 'D' || character == 'E') {
                System.out.println("Vowel");
            }

            // 8. BMI calculator
            double weight = 75;
            double height = 1.80;
            double bmi = weight / (height * height);
            System.out.println("Your BMI: " + bmi);
            if (bmi < 18.5) {
                System.out.println("Underweight");
            } else if (bmi >= 18.5 && bmi < 24.9) {
                System.out.println("Normal weight");
            } else if (bmi >= 25 && bmi < 29.9) {
                System.out.println("Overweight");
            } else {
                System.out.println("Obesity");
            }

            // 9. Final grade calculation
            int mathScore = 65;
            int scienceScore = 90;
            int englishScore = 77;
            double averageScore = (mathScore + scienceScore + englishScore) / 3;
            System.out.println("Average grade: " + averageScore);
            if (averageScore >= 90) {
                System.out.println("Grade: A");
            } else if (averageScore >= 80) {
                System.out.println("Grade: B");
            } else if (averageScore >= 70) {
                System.out.println("Grade: C");
            } else if (averageScore >= 60) {
                System.out.println("Grade: D");
            } else {
                System.out.println("Grade: F");
            }

            // 10. File extension checker
            String filename = "document.pdf";
            if (filename.endsWith(".txt") || filename.endsWith(".doc") || filename.endsWith(".pdf")) {
                System.out.println("Valid file extension");
            } else {
                System.out.println("Invalid file extension");
            }
        }
}
