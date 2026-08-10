# Dynamic Array

A growable array of ints, built from a fixed-size array that doubles in capacity
when it fills up. This is the reference code for Chapter 1 — the classes here are
assembled exactly as the chapter notes build them up, step by step.

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
        Main.java           # a small demo
  scripts/
    run.sh                  # compile everything and run the DynamicArray demo
```

## How to compile and run

- `scripts/run.sh` — compiles all source into `out/` and runs the `Main` demo.

There is no build tool and no test suite: testing is introduced later in the
course. The script above is all you need.

## What's here

- `dynamicarray.DynamicArray` — the growable array, with `add`, `get`, `set`,
  `size`, `contains`, `indexOf`, and `remove`, plus a private `grow` that doubles
  the backing storage.
- `dynamicarray.ArrayUtils` — a namespace of general-purpose algorithms
  (`selectionSort`, and its `indexOfMin` and `swap` helpers) that touch a
  `DynamicArray` only through its public operations.
- `dynamicarray.Main` — a runnable demo that exercises every operation.
