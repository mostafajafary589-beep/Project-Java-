class Fruit {
    private final String name;
    Fruit(String name) { this.name = name; }
    String getName() { return name; }
    @Override public String toString() { return getClass().getSimpleName() + "(" + name + ")"; }
}
class Apple extends Fruit { Apple(String name) { super(name); } }
class Orange extends Fruit { Orange(String name) { super(name); } }

class Basket<T> {
    private T value;
    Basket(T value) { this.value = value; }
    T get() { return value; }
    void set(T value) { this.value = value; }
}