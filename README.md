# Modeling Bank Accounts
The objectives of this assignment are to:

- Be able to write a Java class definition with a main method that creates and uses instances (Objects) of another class.
  Be able to declare Java variables that refer to a class data type, in this project the BankAccount class, and are initialized by instances of that class (by calls to the class constructor).
- Be able to use the public methods, such as get and set methods of an Object to read and write values stored in that Object.
- Understand that the data stored in an Object can only be accessed by the public methods defined in that Object's class definition.


0. Create a class called BankingDriver with a main method (all the below steps you will put in the main in BankingDriver)
1. Create a BankAccount object called nicksAcct such that Nick initially has $450 in his checking account, and $550 in his savings account.
2. Create a BankAccount object called carolsAcct such that Carol initially has $600 in her checking account, and $700 in her savings account.
3. Print out a report of the checking and savings information on both Nick's and Carol's accounts using the printReport method in the BankAccount class. The output should look like this:

```
Nick checking: 450 savings: 550
Carol checking: 600 savings: 700
```

4. Print out the sum of all money in both Nick's and Carol's savings and checking accounts. That is, the sum of Nick's savings and checking added to the sum of Carol's savings and checking. (you must use methods from the BankAccount class here to obtain the various amounts that contribute to the final total). The output should look like this:

`Total money in all accounts: $2300`

5. Deposit $100 to Nick's checking account using the appropriate BankAccount class method.
6. Print out a report of the checking and savings information on Nick's account only using the appropriate method in the BankAccount class (same method used in step 3).
7. In a series of statements, move all of the money in Nick's accounts - both checking and savings - to Carol's checking account. This should leave Nick with no money at the end- i.e. both of his accounts have 0 money. There are several ways this may be accomplished. A suggestion is to use one or more intermediate variables to hold the values from Nick's account, then deposit that value to Carol's checking account. Note: you must get the values from Nick's account by calling the methods defined in the BankAccount class.
8. Print out a report of the checking and savings information on both Nick's and Carol's accounts using the appropriate method in the BankAccount class. (same as step 3).
   The correct output on the examples above would be:

```
Nick checking: 450 savings: 550
Carol checking: 600 savings: 700
Total money in all accounts: $2300
Nick checking: 550 savings: 550
Nick checking: 0 savings: 0
Carol checking: 1700 savings: 700
```

Remember- You must use the public methods of the BankAccount class in your code to achieve the steps listed above to get full credit. Pretend the BankingDriver does not know the amounts in the two BankAccount objects and has to use their public methods to get these values.
