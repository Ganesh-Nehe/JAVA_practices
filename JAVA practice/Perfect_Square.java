public class Perfect_Square {
    public static void main(String[] args){
        int N=30,i=1;
        int a=N;
        while(N!=0){
            while(i<=a){
                if(N/i==i){System.out.println(i);}
                i++;           
            }
            N--;
        }
    }
}
