interface Shape{
    double calcArea();
}

class Circle implements Shape{
    private double r;
    Circle(double r){
        this.r =r;
    }

    public double calcArea(){
        return 3.14*r*r;
    }
}

class Rectangle implements Shape{
    private double length;
    private double width;
    Rectangle(double length, double width){
        this.length = length;
        this.width = width;
    }

    public double calcArea(){
        return length*width;
    }
}

class InterfaceConcept{
    public static void main(String args[]){
        Circle c = new Circle(5);
        Rectangle r = new Rectangle(8,3);
        System.out.println("Area : " +c.calcArea());
        System.out.println("Area : " +r.calcArea());
    }
}