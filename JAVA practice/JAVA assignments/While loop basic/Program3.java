public class Program3 {
    public static void main(String[] args){
        int n = 942111423;
        int a;
        int count=0;
        while(n!=0){
            a=n%10;
            count++;
            n=n/10;
        }
        System.out.println(count);
    }
}
