class Bytterfly{

    public static void butr(int n){
            int nsp = (n*2)-2;
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
            
            for(int j=1;j<=nsp;j++){
                System.out.print(" ");
            }
            nsp -=2;
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        }



        int nst = n; 
        for(int i=1;i<=n;i++){

            for(int j=1;j<=nst;j++){
                System.out.print("*");
            }
           
            for(int j=1;j<=i*2-2;j++){
                System.out.print(" ");
            }
            
            for(int j=1;j<=nst;j++){
                System.out.print("*");
            }
            nst -= 1;
           
            System.out.println();
        }



    }


    public static void rombus(int n){

        for(int i=1;i<=n;i++){
            for(int j=1;j<=n-i;j++){
                System.out.print(" ");
            }
            for(int j=1;j<=n;j++){
                System.out.print("*");
            }
            System.out.println();

        }
    }

        public static void hollrombus(int n){

        for(int i=1;i<=n;i++){
            for(int j=1;j<=n-i;j++){
                System.out.print(" ");
            }
            for(int j=1;j<=n;j++){
                if(i==1 ||i==n||j==1||j==n){
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
                
            }
            System.out.println();

        }
    }

    public static void dimand(int n){
        for(int i=1;i<=n;i++){
            for(int j=1;j<=n-i;j++){
                System.out.print(" ");
            }
            for(int j=1;j<=i*2-1;j++){
                System.out.print("*");
            }
            System.out.println();
        }


        for(int i=n;i>=1;i--){
            for(int j=1;j<=n-i;j++){
                System.out.print(" ");
            }
            for(int j=1;j<=i*2-1;j++){
                System.out.print("*");
            }
            System.out.println();
        }


    }


    public static void main(String args[]){
        butr(10);
        rombus(6);
        hollrombus(7);
        dimand(5);
    }
}