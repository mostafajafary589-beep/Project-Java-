public class Wed3 {
    static void printName(Folder<? extends Employee> box) {
        System.out.println(box.get().getName());
    }

   
    static void putManager(Folder<? super Manager> box) {
        box.set(new Manager("NewManager"));
    }

 
    static void copyValue(Folder<? extends Employee> from, Folder<? super Employee> to) {
        to.set(from.get());
    }

 
    static double doubled(Folder<? extends Number> box) {
        return box.get().doubleValue() * 2;
    }

    public static void main(String[] args) {
        Folder<Manager> b1 = new Folder<>(new Manager("Hadi"));
        Folder<Developer> b2 = new Folder<>(new Developer("Lina"));
        Folder<Employee> bb = new Folder<>(new Employee("Generic employee"));
        Folder<Object> bo = new Folder<>("any object");

        System.out.println("printName");
        printName(b1);   
        printName(b2);   
        printName(bb);  
       

        System.out.println("putManager");
        
        putManager(bb);    
        putManager(bo);     
        printName(b1);  
        printName(bb);  

        System.out.println("copyValue");
        Folder<Employee> target = new Folder<>(new Employee("empty"));
        Folder<Object> targetObj = new Folder<>("empty");

        copyValue(b1, target);     
        copyValue(b2, target);     
        copyValue(bb, target);    
        copyValue(b2, targetObj); 
        System.out.println(target.get() + " | " + targetObj.get());

System.out.println("THE NUMBER");
        Folder<Integer> bi = new Folder<>(21);
        Folder<Double> bd = new Folder<>(1.75);
        System.out.println(doubled(bi)); 
        System.out.println(doubled(bd)); 
      
    }
}