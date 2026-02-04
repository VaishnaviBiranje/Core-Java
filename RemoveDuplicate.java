class RemoveDuplicate{
    public static void removeDupli(String str,int idex,StringBuilder nwatr,boolean map[]){
        if(idex == str.length()){
            System.out.print(nwatr);
            return;
        }
        char currChar = str.charAt(idex);
        if(map[currChar-'a'] ==true ){
            
            removeDupli(str,idex+1, nwatr,map);
        }
        else{
            nwatr.append(currChar);
            map[currChar-'a'] =true;
            removeDupli(str,idex+1, nwatr,map);
        }
    }

    public static void main(String args[]){
        String str = "vaishnavibiranje";
        boolean map[]= new boolean[26];
        removeDupli(str,0,new StringBuilder(""),map);
    }
}