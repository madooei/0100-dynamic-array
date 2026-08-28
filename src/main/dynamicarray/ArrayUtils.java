package dynamicarray;

/** A namespace of general-purpose algorithms over a DynamicArray. */
public final class ArrayUtils {

  private ArrayUtils() {
    // This class is a namespace, not a blueprint — don't instantiate it.
  }

  // Assumes list is not null. Returns the index of the smallest element
  // from index `from` to the end.
  public static int indexOfMin(DynamicArray list, int from) {
    int minIndex = from;
    for (int i = from + 1; i < list.size(); i++) {
      if (list.get(i) < list.get(minIndex)) {
        minIndex = i;
      }
    }
    return minIndex;
  }

  // Assumes list is not null.
  public static void swap(DynamicArray list, int i, int j) {
    int temp = list.get(i);
    list.set(i, list.get(j));
    list.set(j, temp);
  }

  // Assumes list is not null.
  public static void selectionSort(DynamicArray list) {
    for (int i = 0; i < list.size() - 1; i++) {
      int min = indexOfMin(list, i);
      swap(list, i, min);
    }
  }
}
