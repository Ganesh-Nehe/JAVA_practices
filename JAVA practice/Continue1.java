public class Continue1 {
    public static void main(String[] args){
        int n=15;
        for(int i=1;i<=n;i++){
            if(i%3==0){
                continue;
            }
            System.out.println(i);
        }
    }
}
