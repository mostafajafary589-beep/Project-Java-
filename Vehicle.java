
class Vehicle {
    private final String name;
    Vehicle(String name) { this.name = name; }
    String getName() { return name; }
    @Override public String toString() { return getClass().getSimpleName() + "(" + name + ")"; }
}
class Car extends Vehicle { Car(String name) { super(name); } }
class Bike extends Vehicle { Bike(String name) { super(name); } }

class Crate<T> {
    private T value;
    Crate(T value) { this.value = value; }
    T get() { return value; }
    void set(T value) { this.value = value; }
}