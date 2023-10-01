public class Program2 {
    public static void main(String[] args){
        int num=0;
        if(num>5){
            System.out.println("number is greater than 5");
        }else{
            switch(num){
                case 0:
                    System.out.println("zero");break;
                case 1:
                    System.out.println("one");break;
                case 2:
                    System.out.println("two");break;
                case 3:
                    System.out.println("three");break;
                case 4:
                    System.out.println("four");break;
                case 5:
                    System.err.println("five");break;
                default:
                    System.out.println("invalid number");
            }
        }
    }
}
