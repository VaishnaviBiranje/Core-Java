class StringBasic{
    public static void main(String args[]){
        char name[] = {'v','a','i','s','h','n','a','v','i'};
        String firstName = "vaishnavi";
        String lastName = "biranje";
        

        // another way to define string is using new keyword
        String firstName1 = new String("Vaishnavi");

        //length
        System.out.println(firstName.length());

        //concat
        System.out.println("my name is "+firstName+" "+lastName);

        //character at index
        System.out.println(firstName.charAt(3));

        for(int i=0;i<firstName.length();i++){
            System.out.print(firstName.charAt(i)+" ");
        }

        //equals method, == , string how work
        String stuName = "swami";
        String boyName = "swami";
        String prsName = new String("swami");

        if(stuName==boyName){
            System.out.println("same");
        }                                 //output : same
        else{
             System.out.println(" not same");
        } 



        if(stuName==prsName){
            System.out.println("same");
        }else{                              // output :  not same
             System.out.println("not same");
        }

        //when two string having same conent that time second variable referse
        // previous same variable 
        // and ==  this  sign check object not that containt
        //with help of 'new' keyword  we create object that time that create  new not refering privious   
        // for this problem resolve we use .equals() function


         if(stuName.equals(prsName)){
            System.out.println("same");
        }else{                              // output :  not same
             System.out.println("not same");
        }

        // this equal function check only value
        
    }
}