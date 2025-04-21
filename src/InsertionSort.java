/*
 * 2025-04-21.
 * ExerciseName
 * PB|  |   
 * PR|  |   
 * CC| num ∈ ℕ⁺ (naturales positivos), div ∈ [1, num]
 */

public class InsertionSort {
  public static void iterativeInsertion(int[] A, int n) {
    for (int i = 1; i < n; i++) {
      int key = A[i];
      int j = i - 1;
      while (j >= 0 && A[j] > key) {
        A[j + 1] = A[j];
        j = j - 1;
      }
      A[j + 1] = key;
    }
  }

  public static void main(String[] args) {
    int[] array = { 8, 1, 9, 6, 7, 4, 5, 3, 2 };
    System.out.println("Original array: " + array);
    System.out.println("Sorted array: ");
    iterativeInsertion(array, array.length);
    for (int i : array) {
      System.out.print(i + ", ");
    }
  }
}