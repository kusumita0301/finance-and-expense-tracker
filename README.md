# finance-and-expense-tracker
people find it difficult to track their income,expenses,savings, and spending habits. Manual tracking can lead to poor financial planning. The proposed system is a Java-based Personal Finance and Expense Tracker that allows users to record income and expenses, categorize transactions, monitor their balance, set budgets, and use financial summaries.
Personal Finance and Expense Tracker

Overview
The Personal Finance and Expense Tracker is a Java-based console application designed to help students and individuals manage their personal finances. The system allows users to record income and expenses, categorize transactions, set budgets, view transaction history, and generate financial summaries.
The project applies Java programming and Object-Oriented Programming concepts to a practical real-world problem.



Features
Add and manage income transactions
Add and manage expense transactions
Categorize expenses
View transaction history
Edit and delete transactions
Set a monthly budget
Track budget usage and remaining budget
Calculate total income and expenses
Calculate current balance and savings
Perform category-wise expense analysis
Save and load transaction data
Validate user input and handle errors
Technologies / Tools Used
Java -- Core programming language
OOP -- Classes, objects, inheritance, encapsulation, and polymorphism
Collections Framework -- Managing transaction records
File Handling -- Persistent data storage
Exception Handling -- Input and runtime error management
Git -- Version control
GitHub -- Source-code repository and collaboration
Project Structure



Requirements
Java Development Kit (JDK 8 or later)
Command Prompt / Terminal
Git (optional)
Check Java installation:
java -version
javac -version



Installation & Setup
1. Open the Project
cd PersonalFinanceTracker
2. Compile the Source Code
javac src/*.java
3.. Run the Application
java -cp src Main



How to Use
After launching the program, the user can select options from the main menu.
========================================
       PERSONAL FINANCE TRACKER
========================================

1. Add Income
2. Add Expense
3. View Transactions
4. Edit Transaction
5. Delete Transaction
6. Set Monthly Budget
7. View Financial Summary
8. Category Analysis
9. Save Data
10. Exit

Enter your choice:
Example: Add Income
Enter income amount: ₹30000
Enter income source: Salary
Income added successfully!
Example: Add Expense
Enter expense amount: ₹500
Enter expense category: Food

Expense added successfully!
Example: Financial Summary
----- FINANCIAL SUMMARY -----
Total Income  : ₹30000
Total Expense : ₹3500
Balance       : ₹26500
Monthly Budget : ₹10000
Remaining      : ₹6500



Testing Instructions
The application should be tested using both valid and invalid inputs.
Functional Tests
Test Case                                                          Expected Result
Add valid income                                  Income is added
 Add valid expense                               Expense is added 
View transactions                                 Transaction history is displayed
 Edit transaction                                     Selected transaction is updated 
Delete transaction                                 Selected transaction is removed 
Set budget                                                   Monthly budget is stored 
View                                                                  summary         
Correct financial                                      calculations are displayed

Validation Tests
Test Case                                                                       Expected Result
Negative amount                                                   Input is rejected 
Invalid menu choice                                             Error message is displayed 
Invalid transaction ID                                            Error message is displayed 
Incorrect input format                                            Input error is handled
 File read/write error                                                  Appropriate error message is displayed

