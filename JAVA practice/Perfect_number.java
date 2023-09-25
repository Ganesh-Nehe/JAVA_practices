public class Perfect_number {
    public static void main(String[] args){
        int n=6;
        int temp=0;
        for(int i=1;i<n;i++){
            if(n%i==0){
                temp = temp+i;
            }
        }
        if(temp==n){
            System.out.println("perfect number");
        }
        else{
            System.out.println("not a perfect number");
        }
    }
}
