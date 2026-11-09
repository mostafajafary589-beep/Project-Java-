public class Wed1 {

    static void printName(Basket<? extends Fruit> box) {
        System.out.println(box.get().getName());
    }

   
    static void putApple(Basket<? super Apple> box) {
        box.set(new Apple("NewApple"));
    }
    static void copyValue(Basket<? extends Fruit> from, Basket<? super Fruit> to) {
        to.set(from.get());
    }

   
    static double doubled(Basket<? extends Number> box) {
        return box.get().doubleValue() * 2;
    }

    public static void main(String[] args) {
        Basket<Apple> b1 = new Basket<>(new Apple("Fuji"));
        Basket<Orange> b2 = new Basket<>(new Orange("Valencia"));
        Basket<Fruit> bb = new Basket<>(new Fruit("Generic fruit"));
        Basket<Object> bo = new Basket<>("any object");

        System.out.println(" printName ");
        printName(b1); 
        printName(b2);  
        printName(bb); 
      

        System.out.println(" putApple");
        putApple(b1);    
       
        putApple(bb);    
        putApple(bo);     
        printName(b1);   
        printName(bb);   

        System.out.println(" copyValue ");
        Basket<Fruit> target = new Basket<>(new Fruit("empty"));
        Basket<Object> targetObj = new Basket<>("empty");

        copyValue(b1, target);    
        copyValue(b2, target);     
        copyValue(bb, target);    
        copyValue(b2, targetObj);  
        System.out.println(target.get() + " | " + targetObj.get());

     
System.out.println("THE NUMBER");
        Basket<Integer> bi = new Basket<>(21);
        Basket<Double> bd = new Basket<>(1.75);
        System.out.println(doubled(bi)); // ✅ 42.0
        System.out.println(doubled(bd)); // ✅ 3.5
     
    }
}