public class Sun3 {

    static void printName(Holder<? extends Person> box) {
        System.out.println(box.get().getName());
    }
    static void putStudent(Holder<? super Student> box) {
        box.set(new Student("NewStudent"));
    }

    static void copyValue(Holder<? extends Person> from, Holder<? super Person> to) {
        to.set(from.get());
    }

 
    static double doubled(Holder<? extends Number> box) {
        return box.get().doubleValue() * 2;
    }

    public static void main(String[] args) {
        Holder<Student> b1 = new Holder<>(new Student("Sara"));
        Holder<Teacher> b2 = new Holder<>(new Teacher("Omar"));
        Holder<Person> bb = new Holder<>(new Person("Generic person"));
        Holder<Object> bo = new Holder<>("any object");

        System.out.println(" printName");
        printName(b1);   
        printName(b2);   
        printName(bb);   
        System.out.println("putStudent");
        putStudent(b1);     
        putStudent(bb);     
        putStudent(bo);     
        printName(b1);   
        printName(bb);   

        System.out.println("copyValue");
        Holder<Person> target = new Holder<>(new Person("empty"));
        Holder<Object> targetObj = new Holder<>("empty");

        copyValue(b1, target);     
        copyValue(b2, target);     
        copyValue(bb, target);     
        copyValue(b2, targetObj);  
        System.out.println(target.get() + " | " + targetObj.get());


System.out.println("THE NUMBER");
        Holder<Integer> bi = new Holder<>(21);
        Holder<Double> bd = new Holder<>(1.75);
        System.out.println(doubled(bi)); 
        System.out.println(doubled(bd)); 
    }
}