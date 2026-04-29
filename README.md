# 🌦️ Weather Calculator (Java)

![Java](https://img.shields.io/badge/Java-ED8B00?style=for-the-badge&logo=java&logoColor=white)

## Project Overview
This is a console-based **Weather Calculator program** built in Java.  
It allows users to input a number of years and then calculate weather-related data such as rainfall over time.

The program includes input validation to ensure users enter valid data before continuing.

---

## Features
-  User-friendly console interface
-  Input handling using Scanner
-  Input validation (prevents invalid years like 0 or negative numbers)
-  Designed for multi-year weather/rainfall calculations
-  Error messages for incorrect input

---

##  How It Works
1. The program welcomes the user:

Welcome to Jay's Weather Calculator!


2. The user is prompted to enter the number of years.

3. The program checks the input:
- If the user enters a value less than 1:
  - It displays an error message
  - It keeps asking until a valid number is entered

4. Once valid input is entered, the program continues to collect rainfall data (monthly/yearly depending on loop logic).

---

##  Input Validation Logic
The program uses a loop to ensure valid input:

- If `userYears < 1`, the program:
- Prints an error message
- Asks the user to re-enter a valid number

This prevents invalid calculations.

---

##  Technologies Used
- Java
- Scanner class (user input)
- Loops (`while`)
- Conditional statements (`if` / validation logic)

---

##  How to Run

### 1. Compile the program:
```bash
javac weatherTest.java

Weather Calculator Game View:
<img width="1480" height="1007" alt="image" src="https://github.com/user-attachments/assets/d2e92068-d735-41d7-adcd-109fda946f3a" />

