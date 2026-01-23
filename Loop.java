class Loop{
    public static void main(String args[]){

        int counter = 0;
        while(counter<10){
            System.out.println("Shree Ganeshay Namah\nShree Swami Smath");
            counter++;
        }

        int num = 1;
        int sum= 0;
        while(num<=10){
            //System.out.println(num);
            sum += num;
            num++;
        }
        System.out.println(sum);
 
        for(int i=0;i<10;i++){
            if(i==5){
                break;
            }
            System.out.println(i);
        }

        int count =1;
        do{
            System.out.println("Rdhe Radhe");
            count++;
        }while(count<=10);


    }
}