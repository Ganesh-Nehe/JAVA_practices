public class program9 {
    public static void main(String[] args){
        int n = 942111423;
        int temp=0;
        while(n!=0){
            temp = temp*10+(n%10);
            n=n/10;
        }
        System.out.println(temp);
    }
}
