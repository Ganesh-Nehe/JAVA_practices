public class Program6 {
    public static void main(String[] args){
        int i=1;
        int ans=0,res=1;
        while(i<=10){
            if(i%2==0){
                ans = ans + i;
            }else{
                res = res * i;
            }
            i++;
        }
        System.out.println("sum of even numbers between 1 to 10 : " + ans);
        System.out.println("multiplication of odd numbers between 1 to 10 : " + res);
    }
}
