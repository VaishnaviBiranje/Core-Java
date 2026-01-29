class BitwiseBasic{
    public static void main(String args[]){
        // &-- 1&1=1 0&0=0 1&0=0
        System.out.println("AND : "+ (2&5));  //  10 
                                            //   101
                                            //----------
                                            //   000

        // |-- 1|1=1  1|0=1 0|0=0
        System.out.println("OR "+(5|6));    //    101
                                            //    110
                                            //    ----
                                            //    111  

        // ^-- 0^0=0 1^1=0   1^0=1
        System.out.println("XOR "+(5^6));    //   101
                                             //   110
                                             //  -----
                                             //   011                                  


    }
}