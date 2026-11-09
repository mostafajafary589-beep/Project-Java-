class Person {
    private final String name;
    Person(String name) { this.name = name; }
    String getName() { return name; }
    @Override public String toString() { return getClass().getSimpleName() + "(" + name + ")"; }
}
class Student extends Person { Student(String name) { super(name); } }
class Teacher extends Person { Teacher(String name) { super(name); } }

class Holder<T> {
    private T value;
    Holder(T value) { this.value = value; }
    T get() { return value; }
    void set(T value) { this.value = value; }
}
