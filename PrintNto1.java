class PrintNto1{
    public static void print(int n){
        System.out.print(n+" ");
        if(n==1){
            return ;
        }
        
        print(n-1);
    }

    public static void printinccr(int n){
        if(n==1){
            System.out.print(n+" ");
            return ;
        }
        printinccr(n-1);
        System.out.print(n+" ");
    }
    
    public static void main(String args[]){
        print(10);
        System.out.println();
        printinccr(10);
    }
}
