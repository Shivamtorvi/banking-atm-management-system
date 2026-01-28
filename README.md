# banking-atm-management-system
🏦 Bank Management & ATM Simulation System (Java)

A console-based banking application built using Core Java that simulates basic bank and ATM operations. This project demonstrates object-oriented design, transaction handling, and menu-driven program flow similar to real-world banking systems.

📌 Project Overview

This application allows a user to create and manage a bank account through two main modules:

Bank Section – Full account management

ATM Section – Quick banking operations

All transactions are recorded and can be reviewed anytime, just like a real banking system.

✨ Features
🏦 Bank Section

Create a bank account with account holder name and account number

Deposit money with validation

Withdraw money with balance checking

Link Aadhaar and PAN details

Update account holder name

View full transaction history

🏧 ATM Section

Withdraw cash

Check available balance

View Mini Statement (last 3 transactions)

🧠 Concepts Used

This project focuses on strong fundamentals of Java:

Object-Oriented Programming (OOP)

Encapsulation using private variables and public methods

Class and object design

Collections Framework

ArrayList used to store transaction history dynamically

Control Statements

Loops for menu-driven interface

Conditional statements for validations

User Input Handling

Java Scanner class for interactive console input

Modular Programming

Separate methods for Bank and ATM sections

🗂 Project Structure
BankApp.java
 ├── BankAccount class
 │     ├── deposit()
 │     ├── withdraw()
 │     ├── linkAadhaar()
 │     ├── linkPAN()
 │     ├── changeName()
 │     ├── printTransactions()
 │     ├── miniStatement()
 │     └── getBalance()
 │
 └── BankApp class (Main)
       ├── bankSection()
       ├── atmSection()
       └── main()

▶ How to Run

Install Java JDK 8 or later

Save the file as BankApp.java

Open terminal/command prompt in the project folder

Compile:

javac BankApp.java


Run:

java BankApp

🔮 Future Improvements

Add PIN authentication for ATM access

Store account data using file handling or database (MySQL)

Support multiple accounts

Add date & time stamps to transactions

Build a GUI version using Java Swing or JavaFX

🎯 Learning Outcome

This project helped strengthen my understanding of:

Designing real-world systems using Java

Managing state and transactions

Writing structured, modular programs
