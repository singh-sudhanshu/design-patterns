### Builder design pattern

The Builder pattern provides a simple and safe way to build objects that have many optional parameters, so it addresses the telescoping constructor problem (which I describe shortly). In addition, with large constructors, which in most cases have several parameters of the same type, it is not always obvious which value belongs to which parameter. Therefore, the likelihood of mixing up parameter values is high.

### How does it work?

First, you create an instance of the Builder class by passing the mandatory fields to its constructor. Then, you set the values for the optional fields by calling the setter-like methods of the Builder class. Once you have set all the fields, you call the build method on the Builder instance. This method creates the Product by passing the previously set values to the Product’s constructor, and it eventually returns a new Product instance.