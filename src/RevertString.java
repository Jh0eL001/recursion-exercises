/*
 * 2025-04-08.
 * Character occurence in a string
 * PB| charCount(word, pos, char) = 0              | pos > word.length()
 * PR| charCount(word, pos, char) = 1 + charCount(word, pos, char) | pos < word.length() 
 * CC| pos > 0 , word.length > 0
 */

public class RevertString {

  public static String revert(String word) {
    String rWord = "";
    return revert(word, word.length() - 1, rWord);
  }

  private static String revert(String word, int pos, String rWord) {
    // if there is no more elements to check
    if (pos < 0)
      return rWord;
    rWord += word.charAt(pos);
    // we start from the end of the word and finish in word[0]
    return revert(word, pos - 1, rWord);
  }

  public static void main(String[] args) {
    String word = "AnitaLavaLaTina";
    System.out.println("The reverse word of " + word + " is: \n" + revert(word));
  }
}