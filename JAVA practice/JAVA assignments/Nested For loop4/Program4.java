public class Program4 {
    public static void main(String[] args){
        int n=4;
        for(int i=1;i<=n;i++){
            int num =1;
            num = num+i-1;
            for(int j=1;j<=n-i+1;j++){
                System.out.print(num + " ");
                num++;
            }
         
            System.out.println();
        }
    }
}
