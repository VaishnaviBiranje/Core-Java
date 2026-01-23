class PatternPracticeQn{
    public static void main(String args[]){
        //Hollow Rectangle
        int n=4;
        for(int i=1;i<=n;i++){
            for(int j=1;j<=n;j++){
                if(i==1||i==n||j==1||j==n){
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }

        //inverted& roted half-peramid patter
        for(int i=1;i<=n;i++){
            for(int j=1;j<=n;j++){
                if(j>n-i){
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }

        //inverted half- pyramid with number
        int p=0;
        for(int i=1;i<=n;i++){
            for(int j=1;j<=n-p;j++){
                System.out.print(j);
            } p++;
            System.out.println();
        }


        //floyds triangle
        int number =1;
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                System.out.print(number);
                number++;
            }
            System.out.println();
        }

        //0-1 triangle pattern
        for(int i=0;i<n;i++){
            for(int j=0;j<=i;j++){
                if((i+j)%2 == 0){
                    System.out.print("1 ");
                }else{
                    System.out.print("0 ");
                }
            }
            System.out.println();
        }

    }
}