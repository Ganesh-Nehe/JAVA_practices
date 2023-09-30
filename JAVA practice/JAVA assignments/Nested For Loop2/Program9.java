public class Program9 {
    public static void main(String[] args){
        int num1=1,k=3;
        for(int i=1;i<=3;i++){
            char ch='C';
            int num2=3;
            for(int j=1;j<=3;j++){
                System.out.print(num1 + "" + ch + "" + num2 + " ");
                num1 = num1+k;
                k+=2;

                ch--;

                num2--;
            }
            System.out.println();
        }
    }
}
