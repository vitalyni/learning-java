package lv.acodemy.classroom;

import java.sql.SQLOutput;

public class PlayWithString {
    public static void main(String[] args) {

        String name = "Vitalijs";
        String lastName = "Nikolajevs";

        // My name is Vitalijs Nikolajevs

        // Concatenation
        String myText = "My name is: " + name + " " + lastName;

        System.out.println(myText);
        System.out.println("My name is: " + name + " " + lastName);

        // Interpolation
        // %s - for text
        // %d - for numeric values

        String interpolation  = String.format("My name is: %s %s", name, lastName);
        System.out.println(interpolation);
        System.out.println(String.format("My name is: %s %s", name, lastName));

        String firstName = "Maksims";
        String surname = "Sergejevs";
        int age = 25;
        String city = "Riga";

        String textMy = firstName + " " + surname;
        System.out.println(textMy);

        String summary  = String.format("%s %s is %d years old and lives in %s", firstName, surname, age, city);
        System.out.println(summary);


    }
}
