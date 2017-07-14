# Singleton Pattern
 This pattern restricts the instantiation of a class and ensures that only one instance of the class exists in the java virtual machine.
 ## Uses:
* Logging
* Drivers Object
* Caching
* Thread pool

It is also used in other design patterns like Abstract Factory, Builder, Prototype, Facade

## Implementation Methods:
### Eager Instantiation
Instance created at the time of loading class.
Easiest method: __Drawback is that an instance is created even though th client application may not be using it.__

Example:

```Java
public class Singleton {
    
    private static final Singleton instance = new Singleton();
    
    //private constructor to avoid client applications to use constructor
    private Singleton(){}

    public static Singleton getInstance(){
        return instance;
    }
}
```
This approach is best if the class is not using alot of resources. In the cases of file writing or database connection, this should be avoided.
It also does not make use of exception handling.

##Static Block Initialization
___________________________________
Similar to eager initialization except that it adds exception handling option.
```Java
public class Singleton {
    
    private static final Singleton instance;
    
    //private constructor to avoid client applications to use constructor
    private Singleton(){}
    
    static{
        try{
            instance = new Singleton();
        }catch (Exception e){
            throw new RuntimeException("Error creating singleton object");
        }
    }
    public static Singleton getInstance(){return instance;}

    public static Singleton getInstance(){
        return instance;
    }
}
```

This method also creates an instance before it is needed.

## Lazy Initialization

