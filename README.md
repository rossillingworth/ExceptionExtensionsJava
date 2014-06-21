##Exception Extensions

A library for giving you the exception handling you've always wanted. 

###Usage
Add the following static import: 
```java 
import static com.techmale.exception_extension.ExceptionExtensions;
```

In it's simplest form: 
```java
IllegalArgumentException.when(condition, message);

// e.g.
IllegalArgumentException.when(myVar.equals("Foo"), "Bad value for myVar");
```


###Extending
####Adding your own Exceptions
```java
import com.techmale.exception_extension.ExceptionExtensions;

public class MyApplicationExceptionExtensions{

    public static final ExceptionExtensions<InstantiationException> InstantiationException = new ExceptionExtensions(InstantiationException.class);

}
```

####Adding extra functionality
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


###Authors
- Ross Illingworth
- James Gee
