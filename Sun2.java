public class Sun2 {
    static void printName(Crate<? extends Vehicle> box) {
        System.out.println(box.get().getName());
    }

    
    static void putCar(Crate<? super Car> box) {
        box.set(new Car("NewCar"));
    }


    static void copyValue(Crate<? extends Vehicle> from, Crate<? super Vehicle> to) {
        to.set(from.get());
    }

    
    static double doubled(Crate<? extends Number> box) {
        return box.get().doubleValue() * 2;
    }

    public static void main(String[] args) {
        Crate<Car> b1 = new Crate<>(new Car("Toyota"));
        Crate<Bike> b2 = new Crate<>(new Bike("BMX"));
        Crate<Vehicle> bb = new Crate<>(new Vehicle("Generic vehicle"));
        Crate<Object> bo = new Crate<>("any object");

        System.out.println(" printName ");
        printName(b1);   
        printName(b2);  
        printName(bb);   

        System.out.println(" putCar");
        putCar(b1);    
        putCar(bb);    
        putCar(bo);
        printName(b1);   
        printName(bb);   

        System.out.println("copyValue ");
        Crate<Vehicle> target = new Crate<>(new Vehicle("empty"));
        Crate<Object> targetObj = new Crate<>("empty");

        copyValue(b1, target);    
        copyValue(b2, target);     
        copyValue(bb, target);     
        copyValue(b2, targetObj); 
        System.out.println(target.get() + " | " + targetObj.get());

        
        System.out.println("THE NUMBER");
        Crate<Integer> bi = new Crate<>(21);
        Crate<Double> bd = new Crate<>(1.75);
        System.out.println(doubled(bi));
        System.out.println(doubled(bd)); 
        
    }
}