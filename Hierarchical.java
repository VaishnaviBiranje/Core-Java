class Vechical{
    Vechical(){
        System.out.println("vechial is calling..");
    }
}

class Car extends Vechical{
     Car(){
        System.out.println("Car is calling..");
     }
}

class Bus extends Vechical{
    Bus(){
        System.out.println("Bus is calling..");
    }
}

class Hierarchical{
    public static void main(String args[]){
        Car c = new Car();
        Bus b = new Bus();

    }
}