# banking-atm-management-system
🏦 Bank Management & ATM Simulation System (Java)

A console-based banking application developed using Core Java that simulates real-world banking and ATM operations. This project demonstrates Object-Oriented Programming (OOP), transaction management, and modular application design.

📖 Project Description

This system allows users to manage a bank account through two interactive modules:

Bank Section – Full account management features

ATM Section – Quick access banking operations

All transactions are recorded and stored dynamically, allowing users to review their banking activity anytime.

✨ Features
🏦 Bank Section

✔ Create an account with account holder name and account number
✔ Deposit money with amount validation
✔ Withdraw money with balance checking
✔ Link Aadhaar number
✔ Link PAN number
✔ Change account holder name
✔ View complete transaction history

🏧 ATM Section

✔ Withdraw cash
✔ Check available balance
✔ View Mini Statement (last 3 transactions)

🧠 Java Concepts Used

This project is built using fundamental Java concepts:

🔹 Object-Oriented Programming

Encapsulation using private data members

Public methods to access and modify account details

Class-based structure (BankAccount, BankApp)

🔹 Java Collections

ArrayList<String> used to store transaction history dynamically

🔹 Control Flow

Loops for menu-driven system

Conditional statements for validations and decision-making

🔹 User Input Handling

Scanner class for interactive console input

🔹 Modular Programming

Separate methods for Bank Section and ATM Section

🗂 Project Structure
BankApp.java
│
├── BankAccount Class
│   ├── deposit()
│   ├── withdraw()
│   ├── displayDetails()
│   ├── linkAadhaar()
│   ├── linkPAN()
│   ├── changeName()
│   ├── printTransactions()
│   ├── miniStatement()
│   └── getBalance()
│
└── BankApp Class (Main Program)
    ├── bankSection()
    ├── atmSection()
    └── main()

▶ How to Run the Project
🔧 Requirements

Java JDK 8 or later

Any terminal / command prompt

🚀 Steps

Clone the repository or download the source code

Save the file as BankApp.java

Open terminal in the project directory

Compile the program:

javac BankApp.java


Run the program:

java BankApp

🔮 Future Enhancements

🚀 Add PIN authentication for ATM security
🚀 Store account data using File Handling or Database (MySQL)
🚀 Support multiple bank accounts
🚀 Add date & timestamp for each transaction
🚀 Create a GUI version using Java Swing or JavaFX

🎯 Learning Outcomes

Through this project, I improved my understanding of:

Designing real-world applications using Java

Applying OOP principles effectively

Managing transactions and user data

Writing structured and modular programs

👨‍💻 Author

Shivam Torvi
Java Developer | Learning DSA & Software Development
