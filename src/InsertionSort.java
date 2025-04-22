
/*
 * 2025-04-21.
 * ExerciseName
 * PB|  |   
 * PR|  |   
 * CC| num ∈ ℕ⁺ (naturales positivos), div ∈ [1, num]
 */
import java.util.Arrays;

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

  static void insertionSortRecursive(int arr[], int n) {
    // Base case
    if (n <= 1)
      return;

    // Sort first n-1 elements
    insertionSortRecursive(arr, n - 1);

    // Insert last element at its correct position
    // in sorted array.
    int last = arr[n - 1];
    int j = n - 2;

    /*
     * Move elements of arr[0..i-1], that are
     * greater than key, to one position ahead
     * of their current position
     */
    while (j >= 0 && arr[j] > last) {
      arr[j + 1] = arr[j];
      j--;
    }
    arr[j + 1] = last;
  }

  public static void main(String[] args) {
    int[] array = { 15, 13, 12, 19, 11, 14 };
    System.out.println("Original array: " + Arrays.toString(array));
    iterativeInsertion(array, array.length);
    System.out.println("Sorted array: " + Arrays.toString(array));
  }
}