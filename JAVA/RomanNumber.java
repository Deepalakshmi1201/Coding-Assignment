package JAVA;

import java.util.Scanner;

public class RomanNumber {

    public static int romanToInt(String s) {
        int result = 0;
        int prevValue = 0;

        // Convert the Roman numeral to uppercase to handle both cases
        s = s.toUpperCase();

        for (int i = s.length() - 1; i >= 0; i--) {
            char currentChar = s.charAt(i);
            int currentValue;

            switch (currentChar) {
                case 'I':
                    currentValue = 1;
                    break;
                case 'V':
                    currentValue = 5;
                    break;
                case 'X':
                    currentValue = 10;
                    break;
                case 'L':
                    currentValue = 50;
                    break;
                case 'C':
                    currentValue = 100;
                    break;
                case 'D':
                    currentValue = 500;
                    break;
                case 'M':
                    currentValue = 1000;
                    break;
                default:
                    return -1; 
            }

            if (currentValue < prevValue) {
                result -= currentValue;
            } else {
                result += currentValue;
            }

            prevValue = currentValue;
        }

        return result;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String romanNumeral = in.nextLine();
        int integerVal = romanToInt(romanNumeral);
        System.out.println("The integer value of " + romanNumeral + " is " + integerVal);

        in.close();
    }
}
