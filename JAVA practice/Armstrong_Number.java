public class Armstrong_Number {
    public static void main(String[] args){
        int n=153;
        int temp=n,rem;
        int sum=0;
        while(n!=0){
            rem = n%10;
            sum = sum +(rem*rem*rem);
            n=n/10;
        }
        if(sum==temp){
            System.out.println("its a Armstrong number");
        }else{
            System.out.println("its not a armstrong number");
        }
    }
}
