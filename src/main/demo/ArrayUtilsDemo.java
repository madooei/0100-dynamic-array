package demo;

import dynamicarray.ArrayUtils;
import dynamicarray.DynamicArray;

/** A demo of ArrayUtils: selection sort on the example the notes trace. */
public final class ArrayUtilsDemo {

  private ArrayUtilsDemo() {
    // This class should not be instantiated!
  }

  public static void main(String[] args) {
    DynamicArray numbers = new DynamicArray();
    int[] seed = {42, 7, 25, 10};
    for (int i = 0; i < seed.length; i++) {
      numbers.add(seed[i]);
    }
    System.out.print("before: ");
    print(numbers);

    // The same array, reordered in place. Expect [7, 10, 25, 42].
    ArrayUtils.selectionSort(numbers);
    System.out.print("after:  ");
    print(numbers);
  }

  // Prints the elements as [a, b, c], reaching them only through public operations.
  private static void print(DynamicArray list) {
    StringBuilder str = new StringBuilder();
    str.append("[");
    for (int i = 0; i < list.size(); i++) {
      str.append(list.get(i));
      if (i < list.size() - 1) {
        str.append(", ");
      }
    }
    str.append("]");
    System.out.println(str.toString());
  }
}
