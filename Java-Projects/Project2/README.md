# Marks Evaluation Program

This program evaluates a student's marks and assigns a grade based on predefined ranges. Built using **Java**, it demonstrates the use of conditional statements, object-oriented programming principles, and clean modular code design.

## Key Features
- **Grade Evaluation**: Grades are assigned based on marks using conditionals.
- **Object-Oriented Design**: Encapsulation and abstraction for modularity.
- **User Input**: Accepts user input to dynamically calculate grades.

## Program Structure

### Classes
1. **`marks`**
   - Acts as the entry point for the program.
   - Takes user input and calls methods from the `evaluation` class.

2. **`evaluation`**
   - Contains the `eval` method which processes the marks and assigns grades.
   - Encapsulates the logic for evaluating marks.

### Logic
- **Grade Criteria**:
  - Marks between 90 and 100: `A`
  - Marks between 80 and 89: `B`
  - Marks between 70 and 79: `C`
  - Marks between 60 and 69: `D`
  - Marks below 50: `E`
- The program ensures valid input and prevents edge-case issues.

## Example

### Input
```
Enter the mark: 85
```

### Output
```
Mark: B
```

## How to Run
1. Save the files in the same directory with the following structure:
   - `marks.java`
   - `evaluation.java`
2. Compile the files:
   ```
   javac marks.java evaluation.java
   ```
3. Run the program:
   ```
   java marks
   ```

## Concepts Applied
- **Conditionals (`if-else`)**: For range-based evaluations.
- **Encapsulation**: Grading logic encapsulated in the `evaluation` class.
- **Abstraction**: Separation of concerns by dividing tasks between classes.
- **Object Creation**: Demonstrates class instantiation and method calls.

