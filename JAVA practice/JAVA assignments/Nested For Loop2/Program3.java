public class Program3 {
    public static void main(String[] args){
        for(int i=1;i<=4;i++){
            int num=14;
            num = num-1+i;
            for(int j=1;j<=4;j++){
                System.out.print(num + " ");
                num++;
            }
            System.out.println();
        }
    }
}
