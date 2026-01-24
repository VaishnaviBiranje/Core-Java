class LinearSearch{

    public static int linearS(int number[],int key){
        for(int i=0;i<number.length;i++){
            if(key== number[i]){
                    return i;
            }
        }
        return -1;
    }

    public static void main(String args[]){
        int number[] = {2,4,6,8,10,12,14,16};
        int key = 10;
        int search =linearS(number,key);
        if(search == -1){
                System.out.println("key is not found");
        }else{
                System.out.println("key is found at index "+ search);
        }       

    }
}