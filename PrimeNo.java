class PrimeNo{
    public static void main(String args[]){
        int num =12;
        boolean flag = false;
        for(int i =2;i<=Math.sqrt(num);i++){
            if(num%i==0){
                flag = true;
                break;
            }
        }

        if(flag==true){
            System.out.println("THIS not prime number");
        }else{
            System.out.println("this is prime number");
        }

    }
}