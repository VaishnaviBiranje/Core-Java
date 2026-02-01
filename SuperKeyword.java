class Car{
    
    Car(){
        System.out.println("This is car constructor");

    }
    void speed(){
        System.out.println("average speed");
    }

}

class MarutiSuzuki extends Car{
    
    MarutiSuzuki(){
       super();
       
        System.out.println("This is marutisuzuki constructor");

    }
     
    void speed(){
        super.speed();
        System.out.println("high speed");
    }

}


class SuperKeyword{
    public static void main(String args[]){
        MarutiSuzuki m = new MarutiSuzuki();
        Car c = new Car();
        //System.out.println(c.color);
        m.speed();

    }
} 