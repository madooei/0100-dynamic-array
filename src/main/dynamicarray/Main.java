package dynamicarray;

/** A small demo of DynamicArray and ArrayUtils that you can run to see the chapter's code work. */
public final class Main {

  private Main() {
    // Entry-point holder — not instantiated.
  }

  public static void main(String[] args) {
    // One array, transformed step by step. We add 12 values, so the backing
    // array (initial capacity 10) has to grow along the way.
    DynamicArray numbers = new DynamicArray();
    int[] seed = {42, 7, 25, 10, 18, 3, 91, 56, 8, 73, 31, 64};
    for (int i = 0; i < seed.length; i++) {
      numbers.add(seed[i]);
    }
    System.out.println("size: " + numbers.size());   // 12, even though we started with room for 10
    print(numbers);

    System.out.println("get(0): " + numbers.get(0));
    System.out.println("contains(25)? " + numbers.contains(25));
    System.out.println("indexOf(91): " + numbers.indexOf(91));

    numbers.set(0, 999);
    numbers.remove(25);
    System.out.println("after set(0, 999) and remove(25):");
    print(numbers);

    ArrayUtils.selectionSort(numbers);   // same array, reordered in place
    System.out.println("after selectionSort (same array, now in order):");
    print(numbers);
  }

  // Prints the elements as [a, b, c], reaching them only through public operations.
  private static void print(DynamicArray a) {
    StringBuilder str = new StringBuilder();
    str.append("[");
    for (int i = 0; i < a.size(); i++) {
      str.append(a.get(i));
      if (i < a.size() - 1) {
        str.append(", ");
      }
    }
    str.append("]");
    System.out.println(str.toString());
  }
}
