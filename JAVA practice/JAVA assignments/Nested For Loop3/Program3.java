public class Program3 {
    public static void main(String[] args){
        int n=4;
        int num=n*(n+1)/2;
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                System.out.print(num + " ");
                num--;
            }
            System.out.println();
        }
    }
}
