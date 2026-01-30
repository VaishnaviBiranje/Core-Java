//    0  = 000
//    1  = 001
//    2  = 010
//    3  = 011
//    4  = 100
//    5  = 101
//    6  = 110
//    7  = 111

//lsb bit of odd is 1
//lsb bit of even is 0





class OddorEvenBitmani{

    public static void check(int n){
    int bitmask =1 ;
        if((n&bitmask) == 0){
            System.out.println("even number");
        }else{
            System.out.println("odd number");
        }
    }


    public static void main(String args[]){
        
        check(3);
        check(12);
    }
}