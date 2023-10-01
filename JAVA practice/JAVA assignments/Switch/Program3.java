public class Program3 {
    public static void main(String[] args){
    int num1=13;
    int num2=34;
    if(num1<0 || num2<0){
        System.out.println("sorry negetive numbers are not allowed");
    }else{
        int ans = num1*num2;
        int a;
        if(ans%2==0){
            a=1;
        }else{
            a=2;
        }
        switch(a){
            case 1:
                System.out.println("even number");break;
            case 2:
                System.out.println("number is odd");break;
            default:
                System.out.println("invalid number");break;
        }
    }
    }
}
