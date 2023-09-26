public class Program10 {
    public static void main(String[] args){
        int n = 942111423;
        int a = n;
        int temp=0;
        while(n!=0){
            temp = temp*10+(n%10);
            n=n/10;
        }
        if(temp==a){
            System.out.println("the number is palindrome");
        }else{
            System.out.println("number is not palindrome");
        }
    }
}
