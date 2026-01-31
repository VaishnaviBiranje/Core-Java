class Vechical{
String modelNo;
Vechical(){
    System.out.println("This is vechical..");
}
}

class Car extends Vechical{
Car(){
    System.out.println("this is car called..");
}
}


class SingleLevel{
    public static void main(String args[]){
    Car c = new Car();

    }    
}