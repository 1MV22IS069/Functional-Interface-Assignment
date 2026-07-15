package com.cl.stringoperation;
import java.util.Scanner;

public class PerformOperation {

    public void performOperations() {

        Scanner sc = new Scanner(System.in);

        StringOperationImplementation soe = new StringOperationImplementation();

        System.out.print("Enter string: ");
        String str = sc.nextLine();

        System.out.println("Contains Java: " + soe.containsJava.check(str));

        System.out.println("First Character: " + soe.firstCharacter.perform(str));

        System.out.println("Ends With .java: " + soe.endsWithJava.check(str));

        System.out.println("Last Character: " + soe.lastCharacter.perform(str));

        System.out.println("Trim: " + soe.trim.perform(str));

        System.out.println("Is Empty: " + soe.isEmpty.check(str));

        System.out.println("Length: " + soe.length.perform(str));

        System.out.println("Lowercase: " + soe.lowerCase.perform(str));

        System.out.println("Remove Vowels: " + soe.removeVowels.perform(str));

        System.out.println("Replace Spaces: " + soe.replaceSpaces.perform(str));

        System.out.println("Reverse: " + soe.reverse.perform(str));

        System.out.println("Starts With A: " + soe.startsWithA.check(str));

        System.out.println("Only Alphabets: " + soe.onlyAlphabets.check(str));

        System.out.println("Only Digits: " + soe.onlyDigits.check(str));

        System.out.println("Has Special Characters: "
                + soe.hasSpecialCharacters.check(str));

        System.out.println("Length > 10: "
                + soe.lengthGreaterThan10.check(str));

        System.out.println("Palindrome: "
                + soe.palindrome.check(str));

        System.out.println("Email: "
                + soe.email.check(str));

        System.out.println("Blank: "
                + soe.isBlank.check(str));

        System.out.println("Character Count: "
                + soe.characterCount.perform(str));

        System.out.println("Consonant Count: "
                + soe.consonantCount.perform(str));

        System.out.println("Uppercase Count: "
                + soe.uppercaseCount.perform(str));

        System.out.println("Lowercase Count: "
                + soe.lowercaseCount.perform(str));

        System.out.println("Digit Count: "
                + soe.digitCount.perform(str));

        System.out.println("Word Count: "
                + soe.wordCount.perform(str));

        System.out.println("Uppercase: " + soe.upperCase.perform(str));

        System.out.println("Vowel Count: " + soe.vowelCount.perform(str));

        sc.close();
    }

}
