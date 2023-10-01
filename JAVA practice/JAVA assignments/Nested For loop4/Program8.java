public class Program8 {
    public static void main(String[] args){
        int num = 10;
        char ch='I';
        ch++;
        for(int i=1;i<=4;i++){
            for(int j=1;j<=i;j++){
                if(i%2!=0){
                    System.out.print(num + " ");
                }else{
                    System.out.print(ch + " ");
                }
                num--;
                ch--;
            }
        System.out.println();
        }
    }
}
