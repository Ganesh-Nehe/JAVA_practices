public class Program6 {
    public static void main(String[] args){
        int num1 = 1;   //1  // 42
        int num2 = 2;   //4  // 32
        int num3 = 3;   //3  // 42
        if(num1>num2 && num1>num3){
            System.out.println("num1 is greater");
        }else if(num2>num1 && num2>num3){
            System.out.println("num2 is greater");
        }else if(num3>num2 && num3>num1){
            System.out.println("num3 is greater");
        }else if(num1>num3 && num1==num2){
            System.out.println("num1 and num2 are equal and greater than num3");
        }else if(num2>num1 && num2==num3){
            System.out.println("num2 and num3 are equal and greater than num1");
        }else if(num3>num2 && num3==num1){
            System.out.println("num1 and num3 are equal and greater than num2");
        }else{
            System.out.println("all numbers are equal");
        }
    }
}
