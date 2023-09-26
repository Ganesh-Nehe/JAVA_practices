public class Program9 {
    public static void main(String[] args){
        int a=3;  //1  //2
        int b=4;  //6  //2
        int c=5;  //9  //2
        if((a*a)+(b*b)==(c*c)){
            System.out.println("number is pythagorean");
        }else if((a*a)==(b*b)+(c*c)){
            System.out.println("number is pythagorean");
        }else if((a*a)+(c*c)==(b*b)){
            System.out.println("number is pythagorean");
        }else{
            System.out.println("number is not pythagorean");
        }
    }   
}
