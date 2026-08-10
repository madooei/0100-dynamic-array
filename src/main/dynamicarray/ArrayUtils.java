package dynamicarray;

/**
 * A namespace of general-purpose algorithms over a DynamicArray. Unlike
 * DynamicArray, this is not a blueprint: it holds no state and is never
 * instantiated. Each algorithm reaches the elements only through the public
 * size, get, and set operations.
 */
public final class ArrayUtils {

  private ArrayUtils() {
    // This class is a namespace, not a blueprint — don't instantiate it.
  }

  // Returns the index of the smallest element in a[from..size).
  public static int indexOfMin(DynamicArray a, int from) {
    int minIndex = from;
    for (int i = from + 1; i < a.size(); i++) {
      if (a.get(i) < a.get(minIndex)) {
        minIndex = i;
      }
    }
    return minIndex;
  }

  public static void swap(DynamicArray a, int i, int j) {
    int temp = a.get(i);
    a.set(i, a.get(j));
    a.set(j, temp);
  }

  public static void selectionSort(DynamicArray a) {
    for (int i = 0; i < a.size() - 1; i++) {
      int min = indexOfMin(a, i);  // find the smallest remaining element
      swap(a, i, min);             // move it into position i
    }
  }
}
