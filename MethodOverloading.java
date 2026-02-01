class Calculator{
    int sum(int a,int b){
        return a+b;
    }
    float sum(float a, float b){
        return a+b;
    }
    int sum(int a, int b, int c){
        return a+b+c;
    }
}
class MethodOverloading{
    public static void main(String args[]){
        Calculator c = new Calculator();
        System.out.println(c.sum(4,6));
        System.out.println(c.sum(55,8,9));
        System.out.println(c.sum(3.2f,5.6f));

    } 
}