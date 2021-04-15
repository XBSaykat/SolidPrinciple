# SOLID PRINCIPLE Java

* **S For: Single responsibility principle** 
  - A class should have only one reason to change.
    * **What I understood**
      - This means that one class should only have one responsibility.
    * **Scenario**  
        - Let’s take the print() method in Book class. The role of the print() is to print a text from model class. It violate pojo class formation.



* **O For: Open/Closed principle**
    - Software entities should be open for extension, but closed for modification.
    * **What I understood**
        - This means that if we are required to add a new feature to the project, it is good practice to not modify the existing code but rather write new code that will be used by the existing code.
    * **Scenario**
       -Let’s say we have a class called TimeOfDayGreeting with a single method getGreetingFromTimeOfDay. We would like to display a greeting message when the user opens the app. This message must be based on the time of the day.



* **L For: Liskov Substitution Principle** 
    - Child classes should never break the parent class type definitions.
  * **What I understood**
    - This means that a Sub class should override the methods from a parent class that does not break the functionality of the parent class.
  * **Scenario**
    -Let’s say we have a interface ClickListener. This interface is implemented by the fragments 1 & 2. We would need to implement the ClickListener interface in both the fragments. Our requirement is to increment click count in fragment 2 but decrement click count in fragment 1.



* **I For: Interface Segregation Principle** 
    - No client should be forced to depend on methods it does not use.The number of members in the interface that is visible to the dependent class should be minimised.Large classes implement multiple smaller interfaces that group functions according to their usage
  * **What I understood**
    - This means that if an interface becomes too fat, then it should be split into smaller interfaces so that the client implementing the interface does not implement methods that are of no use to it.
    * **Scenario**
    -Let’s take the TextWatcher interface in Android. We know that the TextWatcher interface has 3 methods. This is an example of how this principle is violated, since we only use one of the methods most of the time.



* **D For: Dependency inversion principle** 
    - High-level modules should not depend on low-level modules. Both should depend on abstractions. Abstractions should not depend upon details.
  * **What I understood**
  -  If you use a class insider another class, this class will be dependent of the class injected.
  * **Scenario**
    - Let’s say we have a class called JobTracker. The requirement is to update users via email or call based on the urgency of the job.