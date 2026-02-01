abstract class Animal{
    String  color ;
    Animal(){
         color = "brown";
         System.out.println("Animal constructor calling");
    }
    void eat(){
        System.out.println("Animal eats...");
    }
    abstract void walk();

}

class Horse extends Animal{
    Horse(){
        System.out.println("Horse constructor calling");
    }
    void walk(){
        System.out.println("walk on 4 leg...");
    }
}

class Chicken extends Animal{
    Chicken(){
        System.out.println("chiken constructor calling");
    }
    void walk(){
        System.out.println("walk on 2 leg...");
    }
}

class AbstractClass{
    public static void main(String arg[]){
        Horse h = new Horse();
        h.walk();
        h.eat();
        System.out.println(h.color);
        Chicken c = new Chicken();
        c.walk();
        c.eat();
    }
}