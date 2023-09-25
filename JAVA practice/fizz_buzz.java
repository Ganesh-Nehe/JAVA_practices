public class fizz_buzz {
    public static void main(String[] args){
        int x = 15;
        if(x%3==0 && x%5==0){
            System.out.println("fizz_buzz");
        }
        else if(x%5==0){
            System.out.println("buzz");
        }
        else if(x%3==0){
            System.out.println("fizz");
        }
        else{
            System.out.println("not divisible by both");
            
        }
    }
}
