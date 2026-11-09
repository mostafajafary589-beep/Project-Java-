public class Wed2 {

    static void printName(Container<? extends Device> box) {
        System.out.println(box.get().getName());
    }

    
    static void putPhone(Container<? super Phone> box) {
        box.set(new Phone("NewPhone"));
    }


    static void copyValue(Container<? extends Device> from, Container<? super Device> to) {
        to.set(from.get());
    }

    
    static double doubled(Container<? extends Number> box) {
        return box.get().doubleValue() * 2;
    }

    public static void main(String[] args) {
        Container<Phone> b1 = new Container<>(new Phone("Pixel"));
        Container<Laptop> b2 = new Container<>(new Laptop("ThinkPad"));
        Container<Device> bb = new Container<>(new Device("Generic device"));
        Container<Object> bo = new Container<>("any object");

        System.out.println(" printName ");
        printName(b1);   
        printName(b2);   
        printName(bb);  
       

        System.out.println(" putPhone ");
        putPhone(b1);    
     
        putPhone(bb);    
        putPhone(bo);    
        printName(b1);  
        printName(bb);  

        System.out.println(" copyValue");
        Container<Device> target = new Container<>(new Device("empty"));
        Container<Object> targetObj = new Container<>("empty");

        copyValue(b1, target);     
        copyValue(b2, target);    
        copyValue(bb, target);    
        copyValue(b2, targetObj); 
        System.out.println(target.get() + " | " + targetObj.get());

        System.out.println("THE NUMBERS:");
Container<Integer> bi = new Container<>(21);
        Container<Double> bd = new Container<>(1.75);
        System.out.println(doubled(bi)); 
        System.out.println(doubled(bd));
      
    }
}
