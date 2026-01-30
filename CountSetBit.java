class CountSetBit{


    public static int count(int n){
        int counts =0;
        while(n>0){
            if((n&1)!=0){
                counts++;
            }
            n=n>>1;
        }
        return counts;
    }

    public static void main(String args[]){
        System.out.println(count(15));
    }

}