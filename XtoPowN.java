class XtoPowN{
    public static int pow(int x , int n){
        if(n==1){
            return x;
        }
        return x*pow(x,n-1);
    }

    public static int optipow(int a,int n){
        if(n==0){
            return 1;
        }
        int halfpower = optipow(a,n/2)*optipow(a,n/2);
        if(n %2 != 0){
            halfpower =a*halfpower;
        }

        return halfpower;
    }
    public static void main(String args[]){
        System.out.println(pow(2,5));
        System.out.println(optipow(2,5));

    }
}
//2*2*2*2*2