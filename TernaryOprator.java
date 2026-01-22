class TernaryOprator{
    public static void main(String args []){
        int num = 4;
        String type = num%2 == 0 ? "Even" : "Odd";
        System.out.println("Number is "+type);

        int age = 12;
        String find = age>18 ? "not Adult" : "Adult";
        System.out.println("you are "+ find);


        int mark = 34;
        String result = mark>=35 ? "pass" : " fail";
        System.out.println("you are "+ result);


    }
}