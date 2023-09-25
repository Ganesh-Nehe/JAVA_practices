public class SumOfDigits {
    public static void main(String[] args){
        // int N=6531,temp=0;
        // while(N!=0){
        //     temp = temp + (N%10);
        //     N=N/10;
        // }
        // System.out.println(temp);

        int N=135;
        int temp=1;
        while(N!=0){
            temp = temp * (N%10);
            N=N/10;
        }
        System.out.println(temp);
    }
}
