public class Palindrome_Number {
    public static void main(String[] args){
        int var = 121,temp=0;
        int var2 = var;
        while(var!=0){
            temp = (temp * 10) + (var%10);
            var/=10;
        }
        // System.out.println(temp);
        if(var2==temp){
            System.out.println("number is palindrom");
        }
    }
}
