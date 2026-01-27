class Transpos2d{

    public static void tanspos(int arr[][]){
        int row = arr.length;
        int col = arr[0].length;
        
        int transp[][] = new int[col][row];
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[0].length;j++){
                transp[j][i] = arr[i][j];
            }
        }

        System.out.println("The matrix is: "); 
        for(int i=0; i<transp.length; i++) { 
        for (int j=0; j<transp[0].length; j++) { 
        System.out.print(transp[i][j] + " "); 
        } 
        System.out.println(); 
        }


    }
    public static void main(String args[]){
        int matrix[][] = {{2, 3, 7}, 
                          {5, 6, 7},
                          {8, 4, 9} 

        };
        tanspos(matrix);


    }
}