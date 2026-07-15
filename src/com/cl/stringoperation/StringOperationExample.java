package com.cl.stringoperation;
import java.util.Arrays;

public class StringOperationExample {
    StringOperation upperCase = s -> s.toUpperCase();
    StringOperation lowerCase = s -> s.toLowerCase();
    IntegerOperation length = s -> s.length();
    StringOperation reverse = s -> new StringBuilder(s).reverse().toString();
    PrintOperation printCharacters = s -> {
        for (char ch : s.toCharArray()) {
            System.out.print(ch + " ");
        }
    };

    BooleanOperation isEmpty = s -> s.isEmpty();

    StringOperation trim = s -> s.trim();

    StringOperation replaceSpaces = s -> s.replace(" ", "_");

    StringOperation removeVowels = s -> s.replaceAll("[AEIOUaeiou]", "");

    BooleanOperation startsWithA = s -> s.startsWith("A");

    BooleanOperation endsWithJava = s -> s.endsWith(".java");

    BooleanOperation containsJava = s -> s.contains("java");

    LongOperation vowelCount = s -> s.chars()
            .filter(c -> "AEIOUaeiou".indexOf(c) != -1)
            .count();
    BooleanOperation onlyAlphabets = s -> s.matches("[a-zA-Z]+");
    BooleanOperation onlyDigits = s -> s.matches("\\d+");
    BooleanOperation hasSpecialCharacters =
            s -> s.matches(".*[^a-zA-Z0-9 ].*");
    BooleanOperation lengthGreaterThan10 =
            s -> s.length() > 10;
    BooleanOperation palindrome =
            s -> s.equalsIgnoreCase(
                    new StringBuilder(s).reverse().toString()
            );
    BooleanOperation email =
            s -> s.matches("^[A-Za-z0-9+_.-]+@[A-Za-z0-9.-]+$");

    BooleanOperation isBlank =
            s -> s.trim().isEmpty();

    LongOperation consonantCount = s -> s.chars()
            .filter(Character::isLetter)
            .filter(c -> "AEIOUaeiou".indexOf(c) == -1)
            .count();

    LongOperation uppercaseCount = s -> s.chars()
            .filter(Character::isUpperCase)
            .count();

    LongOperation lowercaseCount = s -> s.chars()
            .filter(Character::isLowerCase)
            .count();

    LongOperation digitCount = s -> s.chars()
            .filter(Character::isDigit)
            .count();

    IntegerOperation characterCount = s -> s.length();

    IntegerOperation wordCount =
            s -> s.trim().split("\\s+").length;

    CharacterOperation firstCharacter = s -> s.charAt(0);

    CharacterOperation lastCharacter = s -> s.charAt(s.length() - 1);


    public static void main(String[] args) {
        PerformOperation po = new PerformOperation();

        po.performOperations();
    }
}
