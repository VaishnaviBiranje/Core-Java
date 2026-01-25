class DuplicateValue{

    public static boolean isduplicate(int arr[]){
        for(int i=0; i<arr.length-1;i++){
            for(int j=i+1;j<arr.length;j++){
                if(arr[i]==arr[j]){
                    return true;
                }
            }
        }

        return false;
    }


    public static int traped(int height[]){
        int n= height.length;
        int leftBoun[] = new int[n];
        int rightBoun[] = new int[n];
        leftBoun[0] = height[0];
        rightBoun[n-1] = height[n-1];
        int totalTrap = 0;
        int waterlevel =0;

         
        for(int i =1;i<height.length;i++){
            leftBoun[i] = Math.max(leftBoun[i-1],height[i]);
        }
        for(int i=n-2 ;i>=0;i--){
            rightBoun[i] =Math.max(rightBoun[i+1],height[i]);
        }
        for(int i=1 ; i<n-1;i++){
            waterlevel = Math.min(leftBoun[i],rightBoun[i]);
            totalTrap += (waterlevel-height[i]);
        }

        return totalTrap;
        
    }

    public static void main(String args[]){
    int arr[] ={1,2,3};
    int num[] = {1,1,1,3,3,4,3,2,4,2};
    System.out.println(isduplicate(arr));
    System.out.println(isduplicate(num));

    int height1[] = {0, 1, 0, 2, 1, 0, 1, 3, 2, 1, 2, 1};
    int height2[] = {4, 2, 0, 3, 2, 5}; 

    System.out.println(traped(height1));
    System.out.println(traped(height2));


    }
}