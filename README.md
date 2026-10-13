# Assignment 2: Conditional Statements (if / else)

## Overview

This repository contains solutions to the problem set of Assignment 2, devoted to conditional statements and the `if` structure. All solutions are written in Java and were tested against the sample inputs given in the problem statements on informatics.msk.ru.

- Author: `<Full Name>`
- Group: `<Group>`
- Course: `<Course name>`
- Contest: https://informatics.msk.ru/mod/statements/view.php?id=276
- Deadline: Monday, 12 October 2026, 11:59 PM

## Learning Objectives

The assignment trains the following skills:

- Reading input with `Scanner` and writing output with `System.out`.
- Building correct conditions with comparison operators (`<`, `>`, `==`, `!=`) and logical operators (`&&`, `||`).
- Using `if`, `else if`, and `else` chains and covering all cases, including edge cases.
- Using the remainder operator `%` to check divisibility.
- Converting a word problem into a mathematical condition before writing code.

## Requirements

- JDK 11 or newer
- IntelliJ IDEA (recommended) or any other Java-compatible IDE
- Git

## How to Run

From the command line:

```bash
cd src
javac Task258.java
java Task258
```

Then enter the input values, each on a separate line, for example:

```
3
2
4
```

Expected output for the example above:

```
YES
```

In IntelliJ IDEA: open the project, open the required file, and run it with the green arrow next to the `main` method. Enter the input in the Run console.

## Implementation Notes

- Input is read with `java.util.Scanner`. Numbers separated by spaces or line breaks are handled identically by `nextInt()`.
- Divisibility checks use `%`. Division by zero is avoided by handling the case `a == 0` before any expression containing `% a` or `/ a`.
- Problems with possibly large values should use `long` instead of `int`. In Problem 266 the sign check can be written as `(x1 > 0) == (x2 > 0)` to avoid overflow in the product.
- Output strings (`YES`, `NO`, `INF`) are case sensitive and must match the statement exactly.

## Testing

Each solution was verified on the sample tests from the statement. Additional cases that were considered:

- Boundary values: `0`, `1`, negative numbers, and the largest values allowed by the constraints.
- Degenerate cases: `a = 0` in equations, `n = 1` in Problem 259, `k = n * m` excluded by the statement in Problem 258.
- Equal inputs in Problems 292 and 293.

## Submission

The repository link is submitted through the course platform. All solution files are committed and pushed to the `main` branch before the deadline.

```bash
git add .
git commit -m "Add solutions for Assignment 2"
git push origin main
```

## Academic Integrity

The solutions are submitted as the author's own work. The code is documented so that the logic of each solution can be explained on request.
