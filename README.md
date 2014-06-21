#Exception Extensions

A library for giving you the exception handling you've always wanted. 

##Usage

1. Add the following static import: 

```java 
import static com.techmale.exception_extension.ExceptionExtensions;
```
2. All Java exceptions are extended by default so use the Exceptions in the following way, Checked and Unchecked: 
```java
IllegalArgumentException.when(myVar.equals("Foo"), "Bad value for myVar: %s", myvar);
```


##Extending
###Adding your own Exceptions
```java
import com.techmale.exception_extension.ExceptionExtensions;

public class MyApplicationExceptionExtensions{

    public static final ExceptionExtensions<InstantiationException> InstantiationException = new ExceptionExtensions(InstantiationException.class);

}
```

###Adding extra functionality
```java
import com.techmale.exception_extension.ExceptionExtensions;

public class MyExceptionExtensions<T extends Exception> extends ExceptionExtensions<T> {

    public static final MyExceptionExtensions<IllegalArgumentException> IllegalArgumentException = new MyExceptionExtensions(IllegalArgumentException.class);

    protected MyExceptionExtensions(Class clazz) {
        super(clazz);
    }

    public void whenNot(boolean condition, String msg, Object... args) throws T {
        when(!condition,msg,args);
    }

}
```


##Authors

Ross Illingworth
James Gee
