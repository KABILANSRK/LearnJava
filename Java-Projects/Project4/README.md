# String Operations Program

## Overview
This program demonstrates various string operations in Java. It performs the following tasks:
1. Identifies vowels and consonants in a given string.
2. Reverses the string.
3. Converts the string to uppercase.
4. Checks whether the string is a palindrome.

The program is modular, with operations implemented in a separate class for better code organization.

---

## Features
1. **Vowel and Consonant Identification**: Determines if each character in the string is a vowel or a consonant.
2. **String Reversal**: Reverses the input string and displays the result.
3. **Uppercase Conversion**: Converts all characters in the string to uppercase.
4. **Palindrome Check**: Determines if the input string is a palindrome.

---

## How It Works
The program consists of two classes:
1. **`strings` Class**: Contains the `main` method to handle user input and call the appropriate methods from the `operations` class.
2. **`operations` Class**: Implements the methods for each string operation:
    - `vc(String s)`: Identifies vowels and consonants.
    - `rev(String s)`: Reverses the string.
    - `upper(String s)`: Converts the string to uppercase.
    - `pal(String s)`: Checks if the string is a palindrome.

---

## Input/Output
### Input
The user is prompted to enter a string.

### Output
The program outputs:
- Characters labeled as vowels or consonants.
- The reversed string.
- The string in uppercase.
- Whether the string is a palindrome.

---

## Example
### Input:
```
Enter the string:
hello
```

### Output:
```
h - Consonant
e - Vowel
l - Consonant
l - Consonant
o - Vowel
Reversed String: olleh
Uppercase String: HELLO
Palindrome Check: Not a Palindrome
```

---

## How to Run
1. Compile the files:
   ```
   javac strings.java operations.java
   ```
2. Run the program:
   ```
   java strings
   ```

---

## Concepts Learned
- String manipulation in Java.
- Modular programming by separating logic into multiple classes.
- Use of conditional statements for decision-making.
- Basic palindrome checking logic.

---
