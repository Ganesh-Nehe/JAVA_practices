public class Breack1 {
    public static void main(String[] args){
        int n=50;
        for(int i =1;i<=n;i++){
            if(i%3==0 && i%5==0){
                break;
            }
            System.out.println(i);
        }
    }
}
