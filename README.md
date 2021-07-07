# Oberon-Java-Assessment-Prep

## Problems

1a. Make a class called **Review** and create a field `radius` with getter and setter methods, so that you can find the circumference of a circle.
   (Circumference Equation: C = 2πr)
   
1b. Make a circumference() method which returns a `double` (the circumference). Overload it for `int` and `double` parameter types.

2. Create a public static method called `total` with two `double` parameters named 'bill' and 'tipPercentage'. 
   - Find out what the final bill will come out to(Equation: bill + ((tipPercentage / 100) * bill) = total)


3. Create a public static method called `even`, that take in an array of `Integers`. Return all the even numbers from the array.


4. Create a package called **carShop**. Inside **carShop** create a new class called **Car**. Make instance properties that can't be accessed outside **Car**,
   these properties should be Strings named `model`, `make`, `color`, and an integer named `year`. Create a constructor that takes in 3 strings and one integer
   that sets the `model`, `make`, `color`, and `year`. Write getters and setters for each property.(Remember we can generate these by right clicking and choosing Getters and Setters)
   

5. Inside **carShop** create another class called **Customer** and make instance properties that can't be accessed outside **Customer**,
   these properties should be string called `firstName` and `lastName`. Create a constructor that takes in two strings that sets 
   `firstName` and `lastName`. Write getters and setters for each property. Make the **Car** class inherit from **Customer**.
   

6. Create an interface named **Sentence**

    -Specify an instance method named `sayMake` that accepts no arguments and returns a string

    -Make your *Car* class implement the *Sentence* interface

    -The implementation of the `sayMake` method on the Car class should return the following message: 
      ```
      Hey there firstName lastName, it looks like your color, year, make, model is ready to go!`
      ```
    

