/*
 * 2025-04-08.
 * Palindrome Checker
 * PB| isPalindrome(word, start, end) = true               | start >= end
 * PR| isPalindrome(word, start, end) = word.charAt(start) == word.charAt(end) && isPalindrome(word, start + 1, end - 1) | start < end
 * CC| word ∈ String, start ∈ ℕ⁺ (natural numbers), end ∈ ℕ⁺ (natural numbers), start ≤ end
 */

public class PalindromerChecker {

  public static boolean isPalindrome(String word) {
    return isPalindrome(word, 0, word.length() - 1);
  }

  private static boolean isPalindrome(String word, int start, int end) {
    // Base case: when start is greater than or equal to end, we have checked all
    // pairs
    if (start >= end) {
      return true;
    }

    // Check if the characters at start and end positions are the same
    if (word.charAt(start) != word.charAt(end)) {
      return false; // Return false if characters don't match
    }

    // Recursively check the next pair of characters
    return isPalindrome(word, start + 1, end - 1);
  }

  public static void main(String[] args) {
    String word = "anitalavalatina";
    System.out.println("Is '" + word + "' a Palindrome? \n" + isPalindrome(word));
  }
}
