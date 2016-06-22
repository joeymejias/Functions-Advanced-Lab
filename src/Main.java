import java.util.Scanner;

/**
 * Created by joey on 6/22/16.
 */
public class Main {
    public static void main(String[] args) {
        isEven(4);
        sameString("BACON", "bacon");
        printLetters("The world is a scary place...");
        randomNumber();
        calendar(30, 12, 1999);
        newWord("bacon");
        printNumbers(6);
        twoNumbers(1,2);
        convertCode();
        letterType();

        /*
            int a = 5;
            if (a % 2 == 0){
                System.out.println("true");
            } else {
                System.out.println("false");
            }
        */

    }


    /**
     * Write a function that takes in a number and returns true
     * if the number is even or false if the number is odd.
     * You may use control flow and multiple conditionals.
     *
     * @param a number passed
     * @return boolean denoting equal or note equal
     */

    public static boolean isEven(int a) {
        if (a % 2 == 0) {
            System.out.println("true");
            System.out.println("\n");
            return true;
        } else {
            System.out.println("false");
            System.out.println("\n");
            return false;
        }
    }

    /**
     * Write a function that takes in two words and compares them.
     * If the spelling is the same, the functions returns true, otherwise false.
     */
    public static boolean sameString(String string1, String string2) {
        if (string1.equalsIgnoreCase(string2)) {
            System.out.println("true");
            System.out.println("\n");
            return true;
        } else {
            System.out.println("false");
            System.out.println("\n");
            return false;
        }
    }

    /**
     * Write a function that takes in a word and prints out its every letter on a new line
     * before it sees the letter "w". If it encounters "w" the function should stop executing.
     */

    public static void printLetters(String string1) {
        char[] stringToCharArray = string1.toCharArray();
        for (char output : stringToCharArray) {
            if (output == 'w' || output == 'W') {
                break;
            } else {
                System.out.println(output);
            }
        }
    }

    /**
     * Write a function that generates a random number. Print it out.
     * If the number is greater that 50, return it, otherwise return -1.
     * You may use control flow and multiple conditionals.
     */

    public static int randomNumber() {
        int numToPrint = (int) (Math.random() * 100);
        System.out.println(numToPrint);
        if (numToPrint == 50) {
            System.out.println(50);
            return 50;
        } else {
            System.out.println(numToPrint);
            System.out.println("\n");
            return -1;
        }
    }

    /**
     * Write a function that takes in 3 integers:
     * day, month, and year and computes day, month, and year of the next day.
     * The function should return a string (e.g. day:12 month:11 year:1988)
     */

    public static String calendar(int day, int month, int year) {
        int newDay = day;
        int newMonth = month;
        int newYear = year;

        if (day < 30) {
            newDay = day + 1;
        } else if (day == 30 && month != 12) {
            newDay = 1;
            newMonth = month + 1;
        } else if (month < 12) {
            newMonth++;
        } else if (day == 30 && month == 12) {
            newDay = 1;
            newMonth = 1;
            newYear = year + 1;
        }

        System.out.println("day: " + newDay + " month: " + newMonth + " year: " + newYear);
        System.out.println("\n");
        return "day: " + newDay + " month: " + newMonth + " year: " + newYear;
    }

    /**
     * Write a function that takes in a word, omits every other letter in that word
     * and returns a new word. You can use control flow and multiple conditionals.
     */

    public static String newWord(String string1) {
        int i;
        for (i = 0; i <= string1.length(); i++) {
            System.out.print(string1.charAt(i));
            i++;
        }
        System.out.println("\n");
        return string1;
    }

    /**
     * Write a function that takes in a number greater than 5
     * and prints out all the numbers from 1 to that number except number 4.
     * Please use a while statement.
     */

    public static void printNumbers(int int1) {
        if (int1 < 5 || int1 == 5){
            System.out.println("Number is not greater than 5...");
        } else {
            int i = 0;
            while (i <= int1){
                if (i != 4){
                    System.out.println(i);
                }
                i++;
            }
        }
        System.out.println("\n");
    }

    /**
     * Write a function that takes in 2 numbers, and checks if they are the same.
     * If they are not the same, it adds 1 to every number and returns its sum.
     * If the numbers are the same, it adds 2 to every number and returns its sum.
     */
    public static int twoNumbers(int int1, int int2){
        if (int1 != int2){
            int1++;
            int2++;
            int sum = int1 + int2;
            System.out.println(sum);
            System.out.println("\n");
            return sum;
        } else if (int1 == int2){
            int1 += 2;
            int2 += 2;
            int sum = int1 + int2;
            System.out.println(sum);
            System.out.println("\n");
            return sum;
        }
        return 0;
    }

    /**
     * Write a function that asks the user to enter a country domain.
     * If the user types in "us", the function prints out "United States",
     * if the user enters "de", the function prints out "Germany",
     * if the user types in "hu" the response should be "Hungary".
     * In all other cases the function should print out "Unknown".
     * Please try to use a switch statement and
     * make sure the function works with a user's input of lower and
     * upper case strings.
     */

    public static void convertCode(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a two letter country code:");
        String countryCode = scanner.nextLine();
        String countryString;
        switch (countryCode) {
            case "us":  countryString = "United States";
                break;
            case "de":  countryString = "Germany";
                break;
            case "hu":  countryString = "Hungary";
                break;
            default: countryString = "Unknown";
                break;
        }
        System.out.println(countryString);
    }

    /**
     * Write a function that asks the user to type in a letter and
     * prints out whether the letter is a vowel or a consonant.
     * You may use control flow and multiple conditionals.
     */

    public static void letterType(){
        System.out.println("Please type a letter:");
        Scanner scanner = new Scanner(System.in);
        String letter = scanner.nextLine();
        if (letter.equalsIgnoreCase("a") ||
                letter.equalsIgnoreCase("e") ||
                letter.equalsIgnoreCase("i") ||
                letter.equalsIgnoreCase("o") ||
                letter.equalsIgnoreCase("u")){
            System.out.println("You entered a vowel!");
        } else if (letter.equalsIgnoreCase("y")){
            System.out.println("Y is sometimes a vowel. :)");
        } else {
            System.out.println("You entered a consonant!");
        }
    }
}




