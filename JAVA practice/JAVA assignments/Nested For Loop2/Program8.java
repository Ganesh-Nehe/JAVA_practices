public class Program8 {
    public static void main(String[] args){
        char a='A',b='b';
        for(int i=1;i<=4;i++){
            for(int j=1;j<=4;j++){
                if(j%2!=0){
                    System.out.print(a + " ");
                    a+=2;
                }else{
                    System.out.print(b + " ");
                    b+=2;
                }
            }
            System.out.println();
        }
    }
}
