class TrapingRainWater{

    public static void trapWater(int height[]){
        int leftMaxH[] = new int[height.length];
        int rightMaxH[] = new int[height.length];
      
        int n = height.length-1;
        int waterlevel[] = new int[height.length];
        int totalwater =0;

        leftMaxH[0] = height[0];
        rightMaxH[height.length - 1] = height[height.length-1];

        for(int i=1;i<height.length;i++){
            leftMaxH[i]= Math.max(leftMaxH[i-1],height[i]); 
        }

        for(int i=n-1; i>=0 ; i--){
            rightMaxH[i] = Math.max(height[i],rightMaxH[i+1]);
        }

        for(int i = 1;i<height.length-1;i++){
            waterlevel[i] = Math.min(rightMaxH[i],leftMaxH[i]);
             totalwater += (waterlevel[i] - height[i]);
        }

        System.out.println("Total water trap is "+ totalwater);

    }

    public static void main(String args[]){
        int height[] = {4,2,0,6,3,2,5};
        trapWater(height);
         
    }
}