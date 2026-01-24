class Nfactorial{

    public static int fact(int n){
        int facta =1;
        for(int i=1;i<=n;i++){
            facta *= i;
        }
        return facta;
    }

public static void main(String args[]){
    System.out.print("factorial : "+ fact(5));
}
}