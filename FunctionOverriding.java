class Teacher{
    void work(){
        System.out.println("Teach to Students");
    }
}

class Principal extends Teacher{
    void work(){
        System.out.println("Teach to Students");
        System.out.println("Check ererything is fine or not");
        
    }

}

class FunctionOverriding{

public static void main(String args[]){
    Principal p = new Principal();
    p.work();
} 

}