class ShortestPath{

    public static float shortPath(String dir){
        float shortpath1 = 0;
        int x=0,y=0;

        for(int i=0;i<dir.length();i++){

            if(dir.charAt(i)=='N'){
                y++;
            }
            else if(dir.charAt(i)=='S'){
                y--;
            }
            else if(dir.charAt(i)=='E'){
                x++;
            }
            else{
                x--;
            }

        }

        shortpath1 =(x*x)+(y*y);
        return  (float) Math.sqrt(shortpath1);

    }



    public static void main(String args[]){
        String str = "WNEENESENNN";
        System.out.println("shortest path is "+shortPath(str));

    }
}