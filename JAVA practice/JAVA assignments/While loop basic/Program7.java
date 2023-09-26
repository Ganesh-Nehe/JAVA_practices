import java.util.*;

public class Program7 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        sc.close();

        if(a%2==0){
            int i=a;
            while(i>0){
                System.out.print(i + " ");
                i--;
            }
        }else{
            int i=a;
            while(i>0){
                System.out.print(i + " ");
                i=i-2;
            }
        }
    }
}
