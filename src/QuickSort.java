import java.util.Random;

public class QuickSort {

  public static void ordenar(int[] nums) {
    ordenar(nums, 0, nums.length - 1);

    System.out.println("Lista ordenada:");
    for (int i = 0; i < nums.length; i++) {
      System.out.print(nums[i] + " ");
    }
  }

  public static void ordenar(int[] nums, int indInf, int indSup) {
    if (indInf >= indSup) {
      return;
    }

    int indPiv = new Random().nextInt(indSup - indInf + 1) + indInf;
    intercambiar(nums, indPiv, indSup);
    int pivote = nums[indSup];

    int posPiv = particionarRecursivo(nums, indInf, indSup - 1, pivote, indInf - 1);
    intercambiar(nums, posPiv + 1, indSup);

    ordenar(nums, indInf, posPiv);
    ordenar(nums, posPiv + 2, indSup);
  }

  private static int particionarRecursivo(int[] nums, int actual, int limite, int pivote, int i) {
    if (actual > limite) {
      return i;
    }

    if (nums[actual] <= pivote) {
      i++;
      intercambiar(nums, i, actual);
    }

    return particionarRecursivo(nums, actual + 1, limite, pivote, i);
  }

  private static void intercambiar(int[] nums, int a, int b) {
    if (a != b) {
      int temp = nums[a];
      nums[a] = nums[b];
      nums[b] = temp;
    }
  }
}
