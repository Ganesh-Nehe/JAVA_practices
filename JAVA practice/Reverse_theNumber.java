public class Reverse_theNumber{
    public static void main(String[] args){
        int var = 123,temp=0;
        while(var!=0){
            temp = (temp * 10) + (var%10);
            var/=10;
        }
        System.out.println(temp);
    }

}