public class Program10 {
    public static void main(String[] args){
        for(int i=1;i<=4;i++){
            int num=1;
            num=num+i-1;
            for(int j=1;j<=i;j++){
                if(num%2!=0){
                    System.out.print(num*num + " ");
                }else{
                    System.out.print(num*num*num + " ");
                }
                num++;
            }
            System.out.println();
        }
    }
}
