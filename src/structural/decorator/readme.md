### Decorator design pattern

BufferedInputStream, LineNumberInputStream are good examples of a Decorator design pattern in Java.

### Example:
### calculate the price of a sandwich:
#### Problem statement:
```text
Write a program which should calculate the price of a sandwich. Customers
can customize the the sandwich as per their requirements. They can add the
extra cheese and the program should be able to calculate the whole price
during runtime.
```
#### Solution:
```text
Seems like Decorator pattern is the good solution for the problems like
this because creating the class for every type of sandwich is not feasible.
```
1) The Decorator pattern allows us to extend the 
functionality of the class at runtime. 
2) Decorator uses composition instead inheritance because it's impossible to
extend the functionality at runtime using inheritance. 
3) So the extra properties can be added to base class Sandwich using decorator pattern.
```text
. Now, let's see our class structure, We have an abstract class Sandwich,
  with abstract method price() and a concrete implementation class 
  WhiteBreadSandwich, which costs $3.0

. Now, in order to provide extra cheese, which obviously incurs an extra
  cost, we are going to use the Decorator design pattern. We have a
  Decorator abstract class, which will act as a base for Decorators called
  SandwichDecorator, and a concrete implementation of this as
  CheeseDecorator.

. SandwichDecorator extends Sandwich, to be of the same type as the original
  object, which is getting decorated. This is a critical requirement of the
  Decorator pattern so that a decorated object can stand in place of the
  original object like it can be passed when a method expects the original
  object.
   
. Decorator adds functionality before or after delegating the task to the
  original object, which means in this example price of a
  WhiteBreadSandwich with Cheese will be calculated by the first
  calculating price of WhiteBreadSandwich and then the price of Cheese.
  
. Finally, I have a class called SandwichMaker, which will make the
  sandwich. It's will the client which demonstrate how the Decorator
  pattern adds new functionality on the fly at runtime. 
  
. I have also used BigDecimal to represent money instead of double
  primitive to follow best practices.
```
