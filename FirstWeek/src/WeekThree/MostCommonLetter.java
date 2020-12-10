package WeekThree;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MostCommonLetter {

    public static void main(String[] args) {

        String userInput = readInput();
        List<Character> sortedArrayOfCharacters = sortUserInput(userInput);

        printMostCommonLetters(sortedArrayOfCharacters, userInput);

    }

    public static String readInput() {
        System.out.print("Enter the string: ");
        Scanner input = new Scanner(System.in);
        String userInput = input.nextLine();
        return userInput;
    }

    public static List<Character> sortUserInput(String userInput) {
        List<Character> listOfCharactersInInput = new ArrayList<Character>();
        String userInputToLowerCase = userInput.toLowerCase();
        for (int i = 0; i < userInputToLowerCase.length(); i++) {
            if (!listOfCharactersInInput.contains(userInputToLowerCase.charAt(i)) &&
                    (userInputToLowerCase.charAt(i) >= 'a' && userInputToLowerCase.charAt(i) <= 'z')) {
                listOfCharactersInInput.add(userInputToLowerCase.charAt(i));
            }
        }
        return listOfCharactersInInput;
    }

    public static void printMostCommonLetters(List<Character> listOfCharacters, String userInput) {
        int mostCommonLeter1 = 0;
        char mostCommonCharacter = ' ';
        int mostCommonLeter2 = 0;
        char mostCommonCharacter2 = ' ';
        for (int i = 0; i < listOfCharacters.size(); i++) {
            int counter = 0;
            for (int j = 0; j < userInput.length(); j++) {
                if (userInput.toLowerCase().charAt(j) == listOfCharacters.get(i)) {
                    counter++;
                }
            }
            if (counter > mostCommonLeter1) {
                mostCommonLeter1 = counter;
                mostCommonCharacter = listOfCharacters.get(i);
            } else if (counter > mostCommonLeter2) {
                mostCommonLeter2 = counter;
                mostCommonCharacter2 = listOfCharacters.get(i);
            }
        }
        System.out.println("The most common letters are: " + mostCommonCharacter + " - " + mostCommonLeter1 +
                " occurrences, and " + mostCommonCharacter2 + " - " + mostCommonLeter2 + " occurrences.");
    }
}

