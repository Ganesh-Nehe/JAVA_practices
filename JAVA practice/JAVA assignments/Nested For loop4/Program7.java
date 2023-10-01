public class Program7 {
    public static void main(String[] args){
        int num=1;
        for(int i=1;i<=6;i++){
            char ch='F';
            ch-=i;
            ch+=1;
            for(int j=1;j<=i;j++){
                if(j%2!=0){
                    System.out.print(ch + " ");
                    ch++;
                }else{
                    System.out.print(num + " ");
                    num++;
                }
            }
            System.out.println();
        }
    }
}
