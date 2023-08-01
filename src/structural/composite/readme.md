###  Composite design pattern

Composite is a structural design pattern that allows composing objects into a tree-like structure and work with the as if it was a singular object.

1) component – is the base interface for all the objects in the composition. It should be either an interface or an abstract class with the common methods to manage the child composites.
2) leaf – implements the default behavior of the base component. It doesn't contain a reference to the other objects.
3) composite – has leaf elements. It implements the base component methods and defines the child-related operations.
4) client – has access to the composition elements by using the base component object.