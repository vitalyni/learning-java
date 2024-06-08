package lv.acodemy.classroom;

public class PlayWithStatements {
    public static void main(String[] args) {

        // if (if-else) / if-else-if

        /*
        if(condition) {
        // code to be executed
        }
         */

        // Exercise: if a > 5 ==> System.out.println("This is true!");

        int a = 10;
        if (a < 5) {
            System.out.println("This is true!");
        }

        // Exercise 2: Write program that will check if variable y is even

        int y = 8;
        if (y % 2 == 0) {
            System.out.println("y is even number");
        }

        // Exercise 3: Write program that will check if number is equal to 50

        int b = 50;
        if (b == 50) {
            System.out.println("b is equal to 50");
        }

        // >, <, <=, =>, ==, != (comparison operators);

        if (b != y) {
            System.out.println("b is not equal to y");
        }

        // Boolean --> is or has (prefix)

        boolean isSummer = true;
        if (isSummer) {
            System.out.println("It's time to go on vacation!");
        }

        // ========================== IF-ELSE ==========================

        /*
        if(condition) {
        will execute statement if true;
        } else {
        will execute statement if false;
        }
         */

        // Exercise 4: Write program that will check if number is positive;

        int z = -10;

        if (z >= 0) {
            System.out.println("Z is positive number");
        } else {
            System.out.println("Z is not positive number");
        }

        // Exercise 5: if name equal to John, then print out - We found John! or variable contains name John

        String name = "John";
        if (name.equals("John")) {
            System.out.println("Variable contains name John!");
        } else {
            System.out.println("Variable contains name: " + name);
        }

        // ========================== IF-ELSE-IF-ELSE ==========================

        /*
        if (condition1) {
        if condition1 is true => this code block will be executed
        } else if (condition2) {
        if condition2 is true => this code block will be executed
        } else {
        if no condition is not => this code block will be executed
        }
         */

        // Exercise 6: Write program that will check if variable > 10, check if variable == 10 and all other is less than 10

        int e = 12;

        if (e > 10) {
            System.out.println("Variable is more than 10");
        } else if (e == 10) {
            System.out.println("Variable is equal to 10");
        } else {
            System.out.println("Variable is less than 10");
        }

        // Exercise 7: Create array with numbers, iterate through it and check if number is positive, negative or equal to 0

        int[] numbers = {10, -5, 0, 25, -30, 15, -10, 5, -20};

        for (int number : numbers) {
            if (number > 0) {
                System.out.printf("Number: %d is positive number\n", number);
            } else if (number < 0) {
                System.out.printf("Number: %d is negative number\n", number);
            } else {
                System.out.printf("Number: %d is equal to 0\n", number);
            }
        }

        // Exercise 8: Excellent (90-100), Good (75-89), OK (50-74), NOK (0-49)

        int[] grades = {95, 45, 63, 75, 24, 89, 56};

        for (int grade : grades) {
            if (grade >= 90 && grade <= 100) {
                System.out.printf("Grade %d is excellent!\n", grade);
            } else if (grade >= 75 && grade <= 90) {
                System.out.printf("Grade %d is good!\n", grade);
            } else if (grade >= 50 && grade <= 75) {
                System.out.printf("Grade %d is OK!\n", grade);
            } else if (grade >= 0 && grade <= 50) {
                System.out.printf("Grade %d is NOK!\n", grade);
            } else {
                System.out.printf("Grade %d is unknown!\n", grade);
            }
        }

        // Exercise 9: Create temperature classifier
        // Temperature < -10 (Holodno) / from 0 to 10 (Prohlando) / from 10 to 20 (Teplo) / from 20 to 30 (Zharko) / > 30 (Ochenj hot)

        int[] temperatura = {-5, 15, 1, 31, 22, -2, 7, -12};

        for (int temperature : temperatura) {
            if (temperature >= -10 && temperature <= -1) {
                System.out.printf("Na ulice %d gradusa(ov) i tam holodno!\n", temperature);
            } else if (temperature >= 0 && temperature <= 10) {
                System.out.printf("Na ulice %d gradusa(ov) i tam prohlando!\n", temperature);
            } else if (temperature >= 10 && temperature <= 20) {
                System.out.printf("Na ulice %d gradusa(ov) i tam teplo!\n", temperature);
            } else if (temperature >= 20 && temperature <= 30) {
                System.out.printf("Na ulice %d gradusa(ov) i tam zharko!\n", temperature);
            } else if (temperature > 30) {
                System.out.printf("Na ulice %d gradusa(ov) i tam  ochenj hot!\n", temperature);
            } else {
                System.out.printf("Neponatno naskoljko holodno ili zharko na ulice!\n", temperature);
            }
        }
    }
}