### Factory design pattern

### Intent:
Factory Method is a creational design pattern that provides an interface for creating objects in a superclass, but allows subclasses to alter the type of objects that will be created.

![](/Users/sudhanshu/Documents/Repo/design-patterns/src/creational/factory/resources/factory-method-en-2x.png)

### Problem Statement:
Imagine that you’re creating a logistics management application. The first version of your app can only handle transportation by trucks, so the bulk of your code lives inside the Truck class.

After a while, your app becomes pretty popular. Each day you receive dozens of requests from sea transportation companies to incorporate sea logistics into the app.

![](/Users/sudhanshu/Documents/Repo/design-patterns/src/creational/factory/resources/problem1-en-2x.png)

At present, most of your code is coupled to the Truck class. Adding Ships into the app would require making changes to the entire codebase. Moreover, if later you decide to add another type of transportation to the app, you will probably need to make all of these changes again.

### Solution:
The Factory Method pattern suggests that you replace direct object construction calls (using the new operator) with calls to a special factory method. Don’t worry: the objects are still created via the new operator, but it’s being called from within the factory method. Objects returned by a factory method are often referred to as products.
![](/Users/sudhanshu/Documents/Repo/design-patterns/src/creational/factory/resources/solution1-2x.png)

At first glance, this change may look pointless: we just moved the constructor call from one part of the program to another. However, consider this: now you can override the factory method in a subclass and change the class of products being created by the method.

There’s a slight limitation though: subclasses may return different types of products only if these products have a common base class or interface. Also, the factory method in the base class should have its return type declared as this interface.
![](/Users/sudhanshu/Documents/Repo/design-patterns/src/creational/factory/resources/solution2-en-2x.png)

For example, both Truck and Ship classes should implement the Transport interface, which declares a method called deliver. Each class implements this method differently: trucks deliver cargo by land, ships deliver cargo by sea. The factory method in the RoadLogistics class returns truck objects, whereas the factory method in the SeaLogistics class returns ships.

![](/Users/sudhanshu/Documents/Repo/design-patterns/src/creational/factory/resources/solution3-en-2x.png)

The code that uses the factory method (often called the client code) doesn’t see a difference between the actual products returned by various subclasses. The client treats all the products as abstract Transport. The client knows that all transport objects are supposed to have the deliver method, but exactly how it works isn’t important to the client.

### Structure
![](/Users/sudhanshu/Documents/Repo/design-patterns/src/creational/factory/resources/structure-2x.png)

### Applicability
```text
. Use the Factory Method when you don’t know beforehand the exact types 
  and dependencies of the objects your code should work with.
. Use the Factory Method when you want to provide users of your library 
  or framework with a way to extend its internal components.
. Use the Factory Method when you want to save system resources by
  reusing existing objects instead of rebuilding them each time.
```


