class Palindrom{

    public static void isPalindrom(int number){
        int palindr = number;
        int reverse =0;
        while(palindr>0){
            int rem = palindr%10;
            reverse =rem + (reverse*10);
            palindr =palindr/10;
        }

        if(number == reverse){
            System.out.println("this is palindrom");
        }
        else{
            System.out.println("This is not palindrom");
        }
    }

    public static void main(String args[]){
        isPalindrom(121);
    }
}