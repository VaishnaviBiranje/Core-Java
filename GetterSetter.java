class Demo{
    String userName;
    private String password;

    void setPassword(String password){
       this.password = password;
    }

    String getPassword(){
        return password;
    }

}

class GetterSetter{
    public static void main(String args[]){
     Demo d = new Demo();
     d.userName="vaishnavi";
     System.out.print(d.userName);
     //d.password="123vb"; private member can not directly asses
     d.setPassword("vb2004");
     System.out.print(d.getPassword());
    }
}