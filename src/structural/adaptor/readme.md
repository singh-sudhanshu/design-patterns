### Adapter design pattern

Adapter is a structural design pattern, which allows incompatible objects to collaborate.

The Adapter acts as a wrapper between two objects. It catches calls for one object and transforms them to format and interface recognizable by the second object.

### Usage examples: 
The Adapter pattern is pretty common in Java code. It’s very often used in systems based on some legacy code. In such cases, Adapters make legacy code work with modern classes.

### Types:
It has two types.
1) Class Adapter: Using Java inheritance. It creates two-way adapter.
2) Object Adapter: Using Composition. 

### Example:
Iterator and Enumerator are the two interfaces which are good example of this pattern. Enumerator is old interface and Iterator has the enhanced ability to remove the elements from underlying collection with some improved method names.

These interfaces can work with each other using Adapter pattern.

### Example:
Fitting square pegs into round holes