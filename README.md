# Account - Simulating Bank Account and Money Transfers

## Overview
The **Account** program models a basic banking system, allowing for account creation with an owner, balance, and account number. It also includes functionality to transfer money between accounts, with an exception thrown if there aren't enough funds available to complete the transaction. The application ensures that the current balance is displayed after any transaction attempt, regardless of its outcome.

This project demonstrates fundamental exception handling techniques in Java, including the creation and usage of custom exceptions (`NotEnoughMoneyException`) and the use of the `finally` block to guarantee that important information, like the account balance, is always shown.

## Key Components

### Account Class:
- Contains three primary attributes:
    - `owner`: The name of the account holder
    - `balance`: The current balance in the account
    - `accountNumber`: A unique identifier for the account
- The class constructor initializes these attributes.
- The `transfer(int amount)` method handles money transfers. If the transfer amount is greater than the balance, a custom exception (`NotEnoughMoneyException`) is thrown.

### Main Class:
- An `Account` object is created with a balance of 500.
- A transfer attempt is made for 600, which causes a `NotEnoughMoneyException` due to insufficient funds.
- The exception is caught and the relevant error message and stack trace are displayed.
- After every transaction, the `finally` block ensures the current balance is printed, regardless of success or failure.

## How to Execute the Program
1. Clone the repository to your local machine:
   ```bash
   git clone https://github.com/grzegorzkoniuszewski/Laboratorium9zad3.git
