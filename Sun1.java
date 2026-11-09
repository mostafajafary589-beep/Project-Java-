public class Sun1 {
    static void printName(Box<? extends Animal> box) {
        System.out.println(box.get().getName());
    }
    static void putDog(Box<? super Dog> box) {
        box.set(new Dog("NewDog"));
    }


    static void copyValue(Box<? extends Animal> from, Box<? super Animal> to) {
        to.set(from.get());
    }

   
    static double doubled(Box<? extends Number> box) {
        return box.get().doubleValue() * 2;
    }

    public static void main(String[] args) {
        Box<Dog> b1 = new Box<>(new Dog("Rex"));
        Box<Cat> b2 = new Box<>(new Cat("Luna"));
        Box<Animal> bb = new Box<>(new Animal("Generic animal"));
        Box<Object> bo = new Box<>("any object");

        System.out.println(" printName ");
        printName(b1);   
        printName(b2);  
        printName(bb);  

        System.out.println(" putDog");
        putDog(b1);    
        putDog(bb);     
        putDog(bo);     
        printName(b1);   
        printName(bb);   

        System.out.println(" copyValue");
        Box<Animal> target = new Box<>(new Animal("empty"));
        Box<Object> targetObj = new Box<>("empty");

        copyValue(b1, target);     
        copyValue(b2, target);    
        copyValue(bb, target);     
        copyValue(b2, targetObj);  
        System.out.println(target.get() + " | " + targetObj.get());

       
        System.out.println("THE NUMBER");
        Box<Integer> bi = new Box<>(21);
        Box<Double> bd = new Box<>(1.75);
        System.out.println(doubled(bi)); 
        System.out.println(doubled(bd)); 
       
    }
}
