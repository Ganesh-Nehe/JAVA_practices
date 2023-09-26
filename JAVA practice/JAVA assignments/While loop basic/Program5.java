public class Program5 {
    public static void main(String[] args){
        int n = 942111423;
        int a;
        while(n!=0){
            a=n%10;
            if(a%2==0){
                System.out.print(a*a + " ");
            }
            n=n/10;
        }
    }
}
