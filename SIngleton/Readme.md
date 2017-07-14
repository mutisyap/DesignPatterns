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

### Single Threaded Application:
We initialize when a call is made to create an instance
```Java
public class Singleton {

    private static Singleton instance;
    
    private Singleton(){}
    
    public static Singleton getInstance(){
        if(instance == null){
            instance = new Singleton();
        }
        return instance;
    }
}

```

If two threads call the constructor at the same time, we will have more that one instance at a time.


###Thread safe Application: Synchronized Application (For Multi-threaded Use)

The approach is making the global access method synchronized in this method.

Still there are two approaches:
#### Approach 1
```Java
public class Singleton {

    private static Singleton instance;
    
    private Singleton(){}
    
    public static synchronized Singleton getInstance(){
        if(instance == null){
            instance = new Singleton();
        }
        return instance;
    }
}

```
This approach provides thread safety and ensures only one instance is created for multithreaded applications.
It however has a major performance bottleneck 

#### Double Checked Locking

In this approach, the synchronized block is used inside the if condition with an additional check to ensure that only one instance of singleton class is created.

```Java
public class Singleton {

    private static Singleton instance;
    
    private Singleton(){}
    
    public static Singleton getInstance(){
        if(instance == null){
            synchronized (Singleton.class){
                if (instance == null){
                    instance = new Singleton();
                }
            }
        }
        return instance;
    }
}

```

NOTE:
Reflection will destory the singleton pattern, because with relfection, one can access even the private constructor and create an instance of the Singleton class.
