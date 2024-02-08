

### Exercise 1: Creating Your First Interface

**Objective:** Understand how to declare an interface and implement it in a class.

**Step 1:** Declare an Interface
- Create an interface named `Animal`.
- Declare a method in the interface called `makeSound()` that does not take any arguments and does not return anything.

```java
public interface Animal {
    void makeSound();
}
```

**Step 2:** Implement the Interface in a Class
- Create a class named `Dog` that implements the `Animal` interface.
- Implement the `makeSound` method to print out "Woof".

```java
public class Dog implements Animal {
    @Override
    public void makeSound() {
        System.out.println("Woof");
    }
}
```

**Step 3:** Test Your Interface and Class
- Create a `Main` class with a `main` method.
- Inside the `main` method, create an instance of `Dog` and call the `makeSound` method.

```java
public class Main {
    public static void main(String[] args) {
        Animal myDog = new Dog();
        myDog.makeSound();
    }
}
```

### Exercise 2: Adding More Methods to the Interface

**Objective:** Learn to add more methods to an interface and implement them.

**Step 1:** Extend the `Animal` Interface
- Add another method to the `Animal` interface named `eat` that takes no arguments and returns nothing.

```java
public interface Animal {
    void makeSound();
    void eat();
}
```

**Step 2:** Implement the New Method in `Dog`
- Implement the `eat` method in the `Dog` class to print out "Eating food".

```java
public class Dog implements Animal {
    @Override
    public void makeSound() {
        System.out.println("Woof");
    }

    @Override
    public void eat() {
        System.out.println("Eating food");
    }
}
```

**Step 3:** Test the New Method
- In the `Main` class's `main` method, after calling `makeSound`, call the `eat` method on the `Dog` instance.

### Exercise 3: Implementing Multiple Interfaces

**Objective:** Learn how a class can implement multiple interfaces.

**Step 1:** Declare Another Interface
- Create an interface named `Pet`.
- Add a method called `play` that takes no arguments and returns nothing.

```java
public interface Pet {
    void play();
}
```

**Step 2:** Implement Multiple Interfaces in `Dog`
- Modify the `Dog` class to implement both `Animal` and `Pet` interfaces.
- Implement the `play` method to print out "Playing with ball".

```java
public class Dog implements Animal, Pet {
    // Existing methods
    @Override
    public void play() {
        System.out.println("Playing with ball");
    }
}
```

**Step 3:** Test Multiple Interface Implementation
- In the `Main` class's `main` method, create an instance of `Dog` and call the `play` method in addition to the others.