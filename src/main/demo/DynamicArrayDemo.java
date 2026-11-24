package demo;

import dynamicarray.DynamicArray;

/** A demo of DynamicArray: add twelve values, then look up, change, and remove some. */
public final class DynamicArrayDemo {

  private DynamicArrayDemo() {
    // This class should not be instantiated!
  }

  public static void main(String[] args) {
    // We add 12 values, so the backing array (initial capacity 10) has to grow along the way.
    DynamicArray numbers = new DynamicArray();
    int[] seed = {42, 7, 25, 10, 18, 3, 91, 56, 8, 73, 31, 64};
    for (int i = 0; i < seed.length; i++) {
      numbers.add(seed[i]);
    }

    // Expect 12, even though we started with room for 10.
    System.out.println("size: " + numbers.size());
    print(numbers);

    // Expect 42.
    System.out.println("get(0): " + numbers.get(0));

    // Expect true.
    System.out.println("contains(25)? " + numbers.contains(25));

    // Expect 6.
    System.out.println("indexOf(91): " + numbers.indexOf(91));

    // Expect 999 in front and 25 gone.
    numbers.set(0, 999);
    numbers.remove(25);
    System.out.println("after set(0, 999) and remove(25):");
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
