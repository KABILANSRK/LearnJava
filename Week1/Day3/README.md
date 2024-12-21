# Array Operations Program

## Description
This program performs basic operations on an array of integers. Users can input a set of marks (up to 10) and calculate the following:
- Minimum value
- Maximum value
- Average value

The program is divided into two Java classes:
1. `arrayconc`: Handles user input and invokes operations.
2. `operations`: Contains methods to compute minimum, maximum, and average.

---

## Features
- Input validation to ensure proper bounds.
- Separation of concerns: logic divided into distinct classes.
- Simple implementation of array traversal and operations.

---

## How to Run
1. Save the following files:
   - `arrayconc.java`
   - `operations.java`
2. Compile the files using:
   ```bash
   javac arrayconc.java operations.java
   ```
3. Run the program using:
   ```bash
   java arrayconc
   ```

---

## Example Input/Output
### Input:
```
Enter the number of marks to be entered:
3
Enter the 1th mark:
78
Enter the 2th mark:
92
Enter the 3th mark:
85
```

### Output:
```
Minimum mark: 78
Maximum mark: 92
Average: 85.0
```

---

## Concepts Covered
- **Array Declaration and Traversal**: Loop through arrays to perform operations.
- **Methods**: Encapsulated logic for computations (`mini`, `maxi`, `average`).
- **Input Validation**: Ensures correct user input.
- **Modular Programming**: Logic split into separate files and classes.

---

## Future Enhancements
- Support for dynamic array sizes using `ArrayList`.
- Add functionality to sort the array.
- Provide a graphical user interface (GUI) for input and output.

---
