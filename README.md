# Dynamic Array

A growable array of ints, built from a fixed-size array that doubles in capacity when it fills up.

## Prerequisites

- JDK 17+

## Repository layout

```plaintext
code/
  README.md
  .gitignore
  src/
    main/
      dynamicarray/
        DynamicArray.java   # the growable array
        ArrayUtils.java     # general-purpose algorithms over it
      demo/                 # one demo per class you implement
        DynamicArrayDemo.java
        ArrayUtilsDemo.java
  scripts/
    run.sh                  # compile everything and run one demo
```

## How to compile and run

- `scripts/run.sh demo.DynamicArrayDemo` — compiles all source into `out/` and runs that one demo. Every class you implement has its own demo.

There is no build tool and no test suite: testing is introduced later in the course. The script above is all you need.

## What's here

- `dynamicarray.DynamicArray` — the growable array, with `add`, `get`, `set`, `size`, `contains`, `indexOf`, and `remove`, plus a private `grow` that doubles the backing storage.
- `dynamicarray.ArrayUtils` — a namespace of general-purpose algorithms (`selectionSort`, and its `indexOfMin` and `swap` helpers) that touch a `DynamicArray` only through its public operations.
- `demo.DynamicArrayDemo` and `demo.ArrayUtilsDemo` — one demo per class, each on an example from the notes.
