
 public class Animal {
    private final String name;
    Animal(String name) { this.name = name; }
    String getName() { return name; }
    @Override public String toString() { return getClass().getSimpleName() + "(" + name + ")"; }
}
class Dog extends Animal { Dog(String name) { super(name); } }
class Cat extends Animal { Cat(String name) { super(name); } }

class Box<T> {
    private T value;
    Box(T value) { this.value = value; }
    T get() { return value; }
    void set(T value) { this.value = value; }
}