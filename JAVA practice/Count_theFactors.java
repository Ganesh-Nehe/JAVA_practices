public class Count_theFactors {
    public static void main(String[] args){
        int N=24,count=0;
        for(int i=1;i<=N;i++){
            if(N%i==0){
                count++;
            }
        }
        System.out.println(count);
    }
}
