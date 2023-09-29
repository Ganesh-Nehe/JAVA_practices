public class Armstrong_Number {
    public static void main(String[] args){
        int n=153;
        int temp=n,rem;
        int sum=0;
        
        int k=temp;
        int count=0;
        

        while(temp!=0){
            count++;
            temp=temp/10;
        }
        while(n!=0){
            rem = n%10;
            int i=1;
            int t=1;
            while(i<=count){
                t=t*rem;
                i++;
            }
            sum = sum + t;
            n=n/10;
        }
        if(sum==k){
            System.out.println("its a Armstrong number");
        }else{
            System.out.println("its not a armstrong number");
        }
    }
}
