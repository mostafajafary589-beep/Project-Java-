class Device {
    private final String name;
    Device(String name) { this.name = name; }
    String getName() { return name; }
    @Override public String toString() { return getClass().getSimpleName() + "(" + name + ")"; }
}
class Phone extends Device { Phone(String name) { super(name); } }
class Laptop extends Device { Laptop(String name) { super(name); } }

class Container<T> {
    private T value;
    Container(T value) { this.value = value; }
    T get() { return value; }
    void set(T value) { this.value = value; }
}
