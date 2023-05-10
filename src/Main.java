import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        PalindromeChecker palindromeChecker = new PalindromeChecker();
        System.out.println("Welcome to the Palindrome Checker!");
        System.out.println("Now lets see if your word or phrase is a palindrome.");
        System.out.print("Enter your word or phrase: ");
        String text = input.nextLine();
        System.out.println("Is is a palindrome?: " + palindromeChecker.isPalindrome(text));
    }
}