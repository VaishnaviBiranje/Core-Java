class Vechical{
    Vechical(){
        System.out.println("Vehical calling...");
    }
}

class FourWheeler extends Vechical{
    FourWheeler(){
        System.out.println("FourWheeler calling..");
    }
}

class Car extends FourWheeler{
    Car(){
        System.out.println("Car is calling..");
    }
}


class Multilevel{
    public static void main(String args[]){
        Car c =new Car();
    }
}