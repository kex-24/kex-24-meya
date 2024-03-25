# Doggo Quest

For this programming task, you will be simulating a dog park using Java. Your goal is to model dog behaviors and interactions using Object-Oriented Programming concepts. By the end of this exercise, you'll have a deeper understanding of Java classes, constructors, instance fields, methods, and encapsulation.

## Deadline
This assignment should be completed and submitted before the next lab session.

## Instructions
For detailed instructions on how to do and submit the assignment, please refer to the assignments section of the course materials.

## Preparation
- Complete the reading and exercises for Module 2: Looking Inside Classes.
- Ensure you have access to the OLI material either via the direct link provided in the course or via the educational platform used for this course.

## Learning Goals
This week's learning goals include:
- Understanding Java classes and objects
- Using constructors to create objects
- Implementing instance fields for object attributes
- Creating and using getters and setters
- Applying encapsulation in Java
- Managing object interactions with methods

## Getting Started
Create a new Java file named `Doggo.java` in the `src` folder. This file will contain the `Doggo` class.

## Assignment Description

### Exercise 1: Your First Dog

In the `Doggo` class, start by coding a main method. Within this main method, initialize variables representing a dog's characteristics:

- Name (`String`)
- Age (`int`)
- Breed (`String`)
- Energy level (`int`, from 0 to 10)
- Is asleep? (`boolean`)

Instantiate these variables with example values.

### Exercise 2: A Pack of Doggos

After creating a single dog, it's time to expand our dog park! Let's add two more dogs, each with their unique attributes. Print the details of all three dogs to the console.

Instead of manually managing each dog, we'll introduce a better solution: using objects.

### Exercise 3: Fields

Transition from using local variables in the main method to using instance fields in the Doggo class. Define the same fields (name, age, breed, energy level, asleep status) within your class, but do not assign any values yet.

### Exercise 4: Constructors

Implement a constructor for the `Doggo` class that allows you to set all the attributes at once upon instantiation.

### Exercise 5: Getters and Setters

For encapsulation, change your fields to private and create getter and setter methods for each field. Remember the naming conventions for boolean fields and methods.

### Exercise 6: A Dynamic Dog Park

Using the constructor and getter/setter methods you've implemented, create a few dog objects and print their details using the `printInfo` method that you'll create next.

### Exercise 7: printInfo Method

Implement a `printInfo()` method within the Doggo class. This method should print all relevant information about the dog, such as its name, age, breed, energy level, and sleeping status.

### Exercise 8: Play Time

Implement an `interact` method where one Doggo object can interact with another Doggo object. For example, you can simulate playing or barking interactions between two dogs.

### Exercise 9: The Shadowing Problem

Discuss and illustrate the concept of variable shadowing within a class and how the `this` keyword is used to prevent it.

## Submission Checklist

- Created a Doggo class with fields representing a dog's characteristics.
- Used a constructor to instantiate dog objects.
- Implemented getter and setter methods for class fields.
- Added a `printInfo` method to display dog information.
- Created an `interact` method to simulate interactions between two Doggo objects.
- Explored the concept of variable shadowing.

Please, ensure your code is well-commented and follows good coding practices. Submit your `Doggo.java` file before the deadline.