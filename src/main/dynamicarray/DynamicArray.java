package dynamicarray;

/**
 * A growable array of ints, backed by a fixed-size array that doubles its
 * capacity when it fills up. A client adds elements without ever declaring or
 * managing a capacity.
 */
public class DynamicArray {

  private int[] arr;   // the underlying fixed-size storage
  private int size;    // how many elements we've added so far

  public DynamicArray() {
    arr = new int[10];  // start with room for 10 elements
    size = 0;           // but the array is logically empty
  }

  public void add(int value) {
    if (size == arr.length) {
      grow();           // out of room — make the backing array bigger first
    }
    arr[size] = value;  // place the value in the next free slot
    size++;             // one more element now lives in the array
  }

  public int get(int index) {
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

  public int indexOf(int value) {
    for (int i = 0; i < size; i++) {
      if (arr[i] == value) {
        return i;   // found at index i
      }
    }
    return -1;      // not found
  }

  public boolean remove(int value) {
    int i = indexOf(value);
    if (i == -1) {
      return false;          // nothing to remove
    }
    // Shift later elements one slot left to close the gap, preserving order.
    // (The notes show a cheaper swap-with-last alternative that is correct only
    // when the contract does not promise to keep elements in order.)
    for (int j = i; j < size - 1; j++) {
      arr[j] = arr[j + 1];
    }
    size--;
    arr[size] = 0;           // clear the now-unused slot
    return true;
  }

  private void grow() {
    int[] bigger = new int[arr.length * 2];
    for (int i = 0; i < size; i++) {
      bigger[i] = arr[i];
    }
    arr = bigger;
  }
}
