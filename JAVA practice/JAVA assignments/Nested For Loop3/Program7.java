public class Program7 {
    public static void main(String[] args){
        for(int i=1;i<=6;i++){
            char ch = 'F';
            ch-=i;
            for(int j=1;j<=i;j++){
                ch+=1;
                System.out.print(ch + " ");

            }
            System.out.println();
        }
    }
}
