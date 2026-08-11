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
  public static int indexOfMin(DynamicArray list, int from) {
    int minIndex = from;
    for (int i = from + 1; i < list.size(); i++) {
      if (list.get(i) < list.get(minIndex)) {
        minIndex = i;
      }
    }
    return minIndex;
  }

  public static void swap(DynamicArray list, int i, int j) {
    int temp = list.get(i);
    list.set(i, list.get(j));
    list.set(j, temp);
  }

  public static void selectionSort(DynamicArray list) {
    for (int i = 0; i < list.size() - 1; i++) {
      int min = indexOfMin(list, i);  // find the smallest remaining element
      swap(list, i, min);             // move it into position i
    }
  }
}
