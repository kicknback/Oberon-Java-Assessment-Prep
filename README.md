# Oberon-Java-Assessment-Prep

## Problems

1a. Create a public static method that takes in a double called radius, so that you can find the circumference of a circle.
   (Circumference Equation: C = 2πr)
   
1b. make the circumference method work with integers and doubles by using method overloading

2. Create a public static method called "total" that takes in two arguments, these arguments should be doubles. 
   One of these doubles should be the bill, and the other should be the tip percentage. Find out what the final bill will come out to(Equation: bill * 1.tip% = total)

3. Create a public static method called even, that take in an array of Integers. Return all the even numbers from the array.

4. Create a package called **carShop**. Inside carShop create a new class called **Car**. Make instance properties that can't be accessed outside **Car**,
   these properties should be Strings named model, make, color, and an integer named year. Create a constructor that takes in 3 strings and one integer
   that sets the model, make, color, and year. Write getters and setters for each property.(Remember we can generate these by right clicking and choosing Getters and Setters)
   
5. Inside carShop create another class called **Customer** and make instance properties that can't be accessed outside **Customer**,
   these properties should be string called firstName and lastName. Create a constructor that takes in two strings that sets 
   firstName and lastName. Write getters and setters for each property. Make the **Car** class inherit from **Customer**.
   
6. Create an interface named **Sentence**

    -Specify an instance method named 'sayMake' that accepts no arguments and returns a string

    -Make your *Car* class implement the *Sentence* interface

    -The implementation of the sayMake method on the Car class should return the following message: 
      
      Hey there firstName lastName, it looks like your color, year, make, model is ready to go!

    

