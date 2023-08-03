### State design pattern

State is a behavioral design pattern that allows an object to change the behavior when its internal state changes.

The main idea of State pattern is to allow the object for changing its behavior without changing its class. Also, by implementing it, the code should remain cleaner without many if/else statements.

### Problem Statement:

Imagine we have a package which is sent to a post office, the package itself can be ordered, then delivered to a post office and finally received by a client. Now, depending on the actual state, we want to print its delivery status.

The simplest approach would be to add some boolean flags and apply simple if/else statements within each of our methods in the class. That won't complicate it much in a simple scenario. However, it might complicate and pollute our code when we'll get more states to process which will result in even more if/else statements.

### Solution:

Besides, all logic for each of the states would be spread across all methods. Now, this is where the State pattern might be considered to use. Thanks to the State design pattern, we can encapsulate the logic in dedicated classes, apply the Single Responsibility Principle and Open/Closed Principle, have cleaner and more maintainable code.

![](/Users/sudhanshu/Documents/Repo/design-patterns/src/resources/State-1.webp)

context is going to delegate the behavior to the state implementation. In other words, all incoming requests will be handled by the concrete implementation of the state.

We see that logic is separated and adding new states is simple – it comes down to adding another State implementation if needed.
