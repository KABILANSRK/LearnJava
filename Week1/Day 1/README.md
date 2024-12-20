# Calculator Program

This is a simple command-line calculator program written in Java. It allows users to perform basic arithmetic operations such as addition, subtraction, multiplication, and division.

## Features
- Addition of two numbers.
- Subtraction of two numbers.
- Multiplication of two numbers.
- Division of two numbers (with a check for zero division).

## Prerequisites
- Java 8 or higher should be installed on your machine.

## Installation
To run this program, follow these steps:

1. Clone the repository:
[GitHub Repo](https://github.com/KABILANSRK/LearnJava.git)

2. Navigate to the project directory:
cd Week1  
cd Day1

3. Compile the Java files:
javac calculations.java Calculator.java

4. Run the program:
java calculations

## How to Use
Once the program is running, you will be prompted to choose an operation:
1. Addition
2. Subtraction
3. Multiplication
4. Division
5. Exit

You can enter your numbers when prompted, and the program will perform the chosen operation. It will continue asking for input until you select the "Exit" option.

## Example Usage
Enter the option you want to perform:

Addition  
Subtraction  
Multiplication  
Division  
Exit

1   
Enter a number a= 5  
Enter a number b= 3 Sum: 8

## How It Works
- The program prompts the user to input two numbers.
- Depending on the option selected, it calls the corresponding method (`add()`, `sub()`, `mul()`, `div()`) from the `Calculator` class.
- For division, the program checks if the divisor is zero and asks for a valid input if necessary.

## Acknowledgments
- This project was created as part of learning Java programming concepts.

