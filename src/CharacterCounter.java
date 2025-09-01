/*
 * 2025-04-08.
 * Character occurence in a string
 * PB| charCount(word, pos, char) = 0              | pos > word.length()
 * PR| charCount(word, pos, char) = 1 + charCount(word, pos, char) | pos < word.length() 
 * CC| pos > 0 , word.length > 0
 */

public class CharacterCounter {

  public static int charCount(String word, char character) {
    return charCount(word.toLowerCase(), character, 0);
  }



  public static void main(String[] args) {
    String word = "morocoOOoO";
    char letter = 'o';
    System.out.println("The word " + word + " has " + charCount(word, letter) + " occurences of the letter " + letter);
  }
}