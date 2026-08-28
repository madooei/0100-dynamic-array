package dynamicarray;

/** A growable array of ints. */
public class DynamicArray {

  private int[] arr;
  private int size;

  public DynamicArray() {
    arr = new int[10];
    size = 0;
  }

  public void add(int value) {
    if (size == arr.length) {
      grow();
    }
    arr[size] = value;
    size++;
  }

  public int get(int index) {
    if (index < 0 || index >= size) {
      throw new IndexOutOfBoundsException();
    }
    return arr[index];
  }

  public void set(int index, int value) {
    if (index < 0 || index >= size) {
      throw new IndexOutOfBoundsException();
    }
    arr[index] = value;
  }

  public int size() {
    return size;
  }

  public boolean contains(int value) {
    return indexOf(value) != -1;
  }

  // Returns -1 if value is not found.
  public int indexOf(int value) {
    for (int i = 0; i < size; i++) {
      if (arr[i] == value) {
        return i;
      }
    }
    return -1;
  }

  // Removes the first occurrence of value, preserving insertion order.
  // Returns false if value is not found.
  public boolean remove(int value) {
    int i = indexOf(value);
    if (i == -1) {
      return false;
    }
    for (int j = i; j < size - 1; j++) {
      arr[j] = arr[j + 1];
    }
    size--;
    arr[size] = 0;           // clear the now-unused slot
    return true;
  }

  // Doubles the capacity.
  private void grow() {
    int[] bigger = new int[arr.length * 2];
    for (int i = 0; i < size; i++) {
      bigger[i] = arr[i];
    }
    arr = bigger;
  }
}
