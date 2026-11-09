class Employee {
    private final String name;
    Employee(String name) { this.name = name; }
    String getName() { return name; }
    @Override public String toString() { return getClass().getSimpleName() + "(" + name + ")"; }
}
class Manager extends Employee { Manager(String name) { super(name); } }
class Developer extends Employee { Developer(String name) { super(name); } }

class Folder<T> {
    private T value;
    Folder(T value) { this.value = value; }
    T get() { return value; }
    void set(T value) { this.value = value; }
}