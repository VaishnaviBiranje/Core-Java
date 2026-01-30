class OperationWithithBit{

    public static int getithBit(int n, int i){
    int bitmask = 1<<i;
        if((n & bitmask)== 0){
            return 0;
        }else{
            return 1;
        }
    }


    public static int setithBit(int n, int i ){
        int bitmask = 1<<i;
        return n|bitmask;

    }
    public static int clearithBit(int n,int i){
        int bitmask = ~(1<<i);
        return n & bitmask;
    }

    public static int clearLeastibts(){
            return 1; 
    }


    public static void main(String args[]){
        System.out.println(getithBit(10,2));
        System.out.println(setithBit(10,2));
        System.out.println(clearithBit(10,1));
        System.out.println(~0);


    }
}