# First Java Task
## Overview
Building a basic calculator using Java console I/O

->  The Calculater.java is in src/main/java/org.example/
## Features
How It Works:

Menu Display:
The program shows a menu with five options:
Addition
Subtraction
Multiplication
Division
Exit
Users type a number (1–5) to pick an operation.

User Input:

It uses a Scanner to read input from the console.
After picking an operation, the user enters two numbers to calculate (e.g., 5 and 3 for 5 + 3).

Calculations:

The program has four methods:
add(a, b): Returns a + b
subtract(a, b): Returns a - b
multiply(a, b): Returns a * b
divide(a, b): Returns a / b (checks for division by zero)
Based on the user's choice, it calls the right method and shows the result (e.g., "5.00 + 3.00 = 8.00").

Loop for Multiple Calculations:

The program runs in a while loop, so after each calculation, it shows the menu again.
It stops only when the user selects Exit (option 5).

Error Handling:

If the user enters something invalid (like letters instead of numbers), it shows an error message and asks again.
For division, it checks if the second number is zero to avoid errors.

How to Run It:

Save the code in a file named Calculator.java.
Use a Java IDE (like VS Code or IntelliJ) or terminal:
Compile: javac Calculator.java
Run: java Calculator

Screenshots:

![Screenshot 2025-06-23 155659](https://github.com/user-attachments/assets/8c419187-8f2e-4c77-bdcb-269f99f794dd)


![Screenshot 2025-06-23 155714](https://github.com/user-attachments/assets/fb9a3828-f595-4760-aa9a-6e6e16bb11ed)


![Screenshot 2025-06-23 155723](https://github.com/user-attachments/assets/3fed25d4-9192-4dd5-889e-5a6bb5901257)


